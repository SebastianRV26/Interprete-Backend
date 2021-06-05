package com.edbinns.InterpreteBackend.visitors.interprete;

import com.edbinns.InterpreteBackend.generated.InterpreteParser;
import com.edbinns.InterpreteBackend.generated.InterpreteParserBaseVisitor;
import com.edbinns.InterpreteBackend.visitors.analisis_contextual.utils.AContextualErrorListener;
import com.edbinns.InterpreteBackend.visitors.interprete.utils.PrintUtils;
import com.edbinns.InterpreteBackend.visitors.models.Type;
import com.edbinns.InterpreteBackend.visitors.analisis_contextual.utils.AContextualException;
import com.edbinns.InterpreteBackend.visitors.interprete.models.ArrayInterpreter;
import com.edbinns.InterpreteBackend.visitors.interprete.models.ClassInterpreter;
import com.edbinns.InterpreteBackend.visitors.interprete.models.FunctionInterpreter;
import com.edbinns.InterpreteBackend.visitors.interprete.models.VariableInterpreter;
import com.edbinns.InterpreteBackend.visitors.interprete.utils.InterpreterUtils;
import org.antlr.v4.runtime.Token;


import java.util.ArrayList;

public class InterpreteAST<Object> extends InterpreteParserBaseVisitor<Object> {


    private StoresSingleton storesSingleton;

    public InterpreteAST() {
        this.storesSingleton = StoresSingleton.getInstance();
    }

    @Override
    public Object visitProgramAST(InterpreteParser.ProgramASTContext ctx) {
        try {
            for (int i = 0; i <= ctx.statement().toArray().length - 1; i++) {
                this.visit(ctx.statement(i));
            }
        }catch (AContextualException e){
            System.out.println(e.getMessage());
            AContextualErrorListener errorListener = AContextualErrorListener.getInstance();
            errorListener.sendError(e.getMessage());
        }
        return null;
    }

    @Override
    public Object visitVariableDeclSAST(InterpreteParser.VariableDeclSASTContext ctx) {
        this.visit(ctx.variableDecl());
        return null;
    }

    @Override
    public Object visitClassDeclSAST(InterpreteParser.ClassDeclSASTContext ctx) {
        this.visit(ctx.classDecl());
        return null;
    }

    @Override
    public Object visitAssignSAST(InterpreteParser.AssignSASTContext ctx) {
        this.visit(ctx.assignment());
        return null;
    }

    @Override
    public Object visitArrayAssignSAST(InterpreteParser.ArrayAssignSASTContext ctx) {
        this.visit(ctx.arrayAssignment());
        return null;
    }

    @Override
    public Object visitPrintSAST(InterpreteParser.PrintSASTContext ctx) {
        this.visit(ctx.printStatement());
        return null;
    }

    @Override
    public Object visitIfSAST(InterpreteParser.IfSASTContext ctx) {

        return this.visit(ctx.ifStatement());
    }

    @Override
    public Object visitWhileSAST(InterpreteParser.WhileSASTContext ctx) {
        return this.visit(ctx.whileStatement());
    }

    @Override
    public Object visitReturnSAST(InterpreteParser.ReturnSASTContext ctx) {
        return  this.visit(ctx.returnStatement());
    }

    @Override
    public Object visitFunctionDeclSAST(InterpreteParser.FunctionDeclSASTContext ctx) {
        this.visit(ctx.functionDecl());
        return null;
    }

    @Override
    public Object visitBlockSAST(InterpreteParser.BlockSASTContext ctx) {
        return this.visit(ctx.block());
    }

    @Override
    public Object visitBlockAST(InterpreteParser.BlockASTContext ctx) {

        storesSingleton.arrayStore.openScope();
        storesSingleton.variableStore.openScope();
        Object returVar = null;
        for (int i = 0; i < ctx.statement().size(); i++) {
            Object temp = this.visit(ctx.statement(i));
            if (temp != null) {
                returVar = temp;
                break;
            }
        }
        storesSingleton.variableStore.imprimir();
        storesSingleton.functionsStore.imprimir();
        storesSingleton.arrayStore.imprimir();
        storesSingleton.arrayStore.closeScope();
        storesSingleton.variableStore.closeScope();
        return returVar;
    }

    @Override
    public Object visitFunctionDeclAST(InterpreteParser.FunctionDeclASTContext ctx) {

        int level = storesSingleton.functionsStore.getLevel();
        storesSingleton.functionsStore.openScope();

        String type  = (String)this.visit(ctx.type());

        ArrayList<Object> parametersList = new ArrayList<>();
        if (ctx.formalParams() != null) {
            parametersList.addAll((ArrayList<Object>) this.visit(ctx.formalParams()));
        }

        Token id = ctx.ID().getSymbol();

        FunctionInterpreter funcion = new FunctionInterpreter(id,level,ctx,(ArrayList<java.lang.Object>)parametersList,null,type);
        storesSingleton.functionsStore.enter(funcion);

        storesSingleton.functionsStore.imprimir();
        storesSingleton.functionsStore.closeScope();
        return null;
    }

    @Override
    public Object visitFormalParamsAST(InterpreteParser.FormalParamsASTContext ctx) {
        ArrayList<Object> parametersList = new ArrayList<>();
        parametersList.add( this.visit(ctx.formalParam(0)));
        for (int i = 1; i <= ctx.formalParam().toArray().length - 1; i++) {
            visit(ctx.COMA(i - 1));
            Object vn = visit(ctx.formalParam(i));
            parametersList.add(vn);
        }
        return  (Object) parametersList;
    }

    @Override
    public Object visitFormalParamAST(InterpreteParser.FormalParamASTContext ctx) {
        String type = (String)this.visit(ctx.type());
        Token id = ctx.ID().getSymbol();
        int level = storesSingleton.functionsStore.getLevel();
        Object value = null;
        if (type.contains("[]")) {

            type = type.replace("[]", "");
            ArrayInterpreter variable = new ArrayInterpreter(id, level, ctx, type, null);
            storesSingleton.arrayStore.enter(variable);
            return (Object) variable;
        } else {
            VariableInterpreter variable = null;
            if (type.equals("INT") || type.equals("REAL")) {
                variable = new VariableInterpreter(id, level, ctx, 0, type);
            } else if (type.equals("STRING")) {
                variable = new VariableInterpreter(id, level, ctx, "", type);
            } else if (type.equals("CHAR")) {
                variable = new VariableInterpreter(id, level, ctx, '\0', type);
            } else if (type.equals("BOOLEAN")) {
                variable = new VariableInterpreter(id, level, ctx, false, type);
            }
//            storesSingleton.variableStore.enter(variable);
            return (Object) variable;
        }
    }

    @Override
    public Object visitWhileAST(InterpreteParser.WhileASTContext ctx) {
        boolean value = (boolean) this.visit(ctx.expression());
        Object returnValue = null;
        while (value) {
            returnValue = this.visit(ctx.block());
            if (returnValue != null)
                break;
            value = (boolean) this.visit(ctx.expression());
        }
        return returnValue;
    }

    @Override
    public Object visitIfAST(InterpreteParser.IfASTContext ctx) {
        boolean value = (boolean)this.visit(ctx.expression());
        Object returnValue = null;
        if(value){
            returnValue = this.visit(ctx.block(0));
        }else{
            if ((ctx.ELSE() != null) && (ctx.block(1) != null)) {
                returnValue = this.visit(ctx.block(1));
            }
        }
        return returnValue;
    }

    @Override
    public Object visitReturnAST(InterpreteParser.ReturnASTContext ctx) {
        return this.visit(ctx.expression());
    }

    @Override
    public Object visitPrintAST(InterpreteParser.PrintASTContext ctx) {

        Object value = this.visit(ctx.expression());
        System.out.println("Print " + value.toString());
        PrintUtils print = PrintUtils.getInstance();
        print.setValue(value.toString());
        return null;
    }

    @Override
    public Object visitClassDeclAST(InterpreteParser.ClassDeclASTContext ctx) {
        int level = storesSingleton.variableStore.getLevel();
        storesSingleton.variableStore.openScope();
        storesSingleton.classStore.openScope();

        ArrayList<VariableInterpreter> attrList = new ArrayList<>();
        for (int i = 0; i <= ctx.classVariableDecl().toArray().length - 1; i++) {
            VariableInterpreter attr = (VariableInterpreter) visit(ctx.classVariableDecl(i));
            attrList.add(attr);
        }

        Token id = ctx.ID().getSymbol();
        ClassInterpreter classInterpreter = new ClassInterpreter(id, level, ctx, attrList);
        storesSingleton.classStore.enter(classInterpreter);
        storesSingleton.classStore.imprimir();
        storesSingleton.variableStore.closeScope();
        storesSingleton.classStore.closeScope();
        return null;
    }

    @Override
    public Object visitClassVariableDeclAST(InterpreteParser.ClassVariableDeclASTContext ctx) {

        String type = (String)this.visit(ctx.simpleType());
        int level = storesSingleton.variableStore.getLevel();
        Token id = ctx.ID().getSymbol();
        Object value= null;
        if ((ctx.ASYGN() != null) && (ctx.expression() != null)) {
           value = this.visit(ctx.expression());
        }
        VariableInterpreter variable  = null;
        if(value == null){
            if(type.equals("INT") ||type.equals("REAL") ) {
                variable  = new VariableInterpreter(id, level, ctx, 0, type);
            }else if(type.equals("STRING")){
                variable  = new VariableInterpreter(id, level, ctx, "", type);
            }else if(type.equals("CHAR")){
                variable  = new VariableInterpreter(id, level, ctx, '\0', type);
            }else if(type.equals("BOOLEAN")){
                variable  = new VariableInterpreter(id, level, ctx, false, type);
            }else{
                variable  = new VariableInterpreter(id, level, ctx, null, type);
            }
        }else {
            variable  = new VariableInterpreter(id, level, ctx, value, type);
        }
        return (Object) variable;
    }


    @Override
    public Object visitVariableDeclAST(InterpreteParser.VariableDeclASTContext ctx) {

        String type = (String) this.visit(ctx.type());
        Object value = null;
        Token id = ctx.ID().getSymbol();
        int level = storesSingleton.variableStore.getLevel();
        if ((ctx.ASYGN() != null) && (ctx.expression() != null)) {
            value = this.visit(ctx.expression());
        }

        if (type.contains("[]")) {
            java.lang.Object[] array = null;
            if (value instanceof Integer) {
                int lenght = (Integer) value;
                if( lenght > -1){
                    array = new java.lang.Object[lenght];
                }else{
                    throw new AContextualException("Error, fuera de rango, no se aceptan valores negativos");
                }

            } else {
                array = (java.lang.Object[]) value;
            }
            type = type.replace("[]", "");
            ArrayInterpreter variable = new ArrayInterpreter(id, level, ctx, type, array);
            storesSingleton.arrayStore.enter(variable);
        } else {
            VariableInterpreter variable  = null;
            if(value == null){
                if(type.equals("INT") ||type.equals("REAL") ) {
                    variable  = new VariableInterpreter(id, level, ctx, 0, type);
                }else if(type.equals("STRING")){
                    variable  = new VariableInterpreter(id, level, ctx, "", type);
                }else if(type.equals("CHAR")){
                    variable  = new VariableInterpreter(id, level, ctx, '\0', type);
                }else if(type.equals("BOOLEAN")){
                    variable  = new VariableInterpreter(id, level, ctx, false, type);
                }else{
                    variable  = new VariableInterpreter(id, level, ctx, null, type);
                }
            }else {
                variable  = new VariableInterpreter(id, level, ctx, value, type);
            }
            storesSingleton.variableStore.enter(variable);
        }

        return null;
    }

    @Override
    public Object visitTypeAST(InterpreteParser.TypeASTContext ctx) {
        //Este siempre va a retornar un enum Type
        return this.visit(ctx.simpleType());
    }

    @Override
    public Object visitArrayTypeTAST(InterpreteParser.ArrayTypeTASTContext ctx) {
        return this.visit(ctx.arrayType());
    }

    @Override
    public Object visitIdAST(InterpreteParser.IdASTContext ctx) {
        return (Object) ctx.ID().getText();
    }

    @Override
    public Object visitArrayTypeAST(InterpreteParser.ArrayTypeASTContext ctx) {
        String type = (String) this.visit(ctx.simpleType());
        return (Object) (type + "[]");
    }

    @Override
    public Object visitAssignAST(InterpreteParser.AssignASTContext ctx) {

        VariableInterpreter var = storesSingleton.variableStore.searchNode(ctx.ID(0).getText());
        ArrayInterpreter varArray = storesSingleton.arrayStore.searchNode(ctx.ID(0).getText());
        Object value = this.visit(ctx.expression());

        if(var != null){
            if (ctx.ID(1) != null && ctx.PUNTO() != null) {
                ClassInterpreter classInter = (ClassInterpreter) var.getValue() ;
                classInter.updateValue(ctx.ID(1).getText(), value);
                return null;
            }
            var.updateValue(value);
        }else{
            varArray.setDataList((java.lang.Object[]) value);
        }

        return null;
    }

    @Override
    public Object visitArrayAssignAST(InterpreteParser.ArrayAssignASTContext ctx) {

        ArrayInterpreter array = storesSingleton.arrayStore.searchNode(ctx.ID().getText());
        int position = (int) visit(ctx.expression(0));
        Object value = this.visit(ctx.expression(1));

        array.updateValue(position,value);


        return null;
    }

    @Override
    public Object visitBooleanTAST(InterpreteParser.BooleanTASTContext ctx) {
        return (Object) Type.BOOLEAN.name();
    }

    @Override
    public Object visitCharTAST(InterpreteParser.CharTASTContext ctx) {
        return (Object) Type.CHAR.name();
    }

    @Override
    public Object visitIntTAST(InterpreteParser.IntTASTContext ctx) {
        return (Object) Type.INT.name();
    }

    @Override
    public Object visitStringTAST(InterpreteParser.StringTASTContext ctx) {
        return (Object) Type.STRING.name();
    }

    @Override
    public Object visitRealTAST(InterpreteParser.RealTASTContext ctx) {
        return (Object) Type.REAL.name();
    }

    @Override
    public Object visitExpressionAST(InterpreteParser.ExpressionASTContext ctx) {

        Object value = (Object) visit(ctx.simpleExpression(0));
        java.lang.Object obj = null;
        for (int i = 1; i <= ctx.simpleExpression().toArray().length - 1; i++) {

            Token relativeOP = (Token) visit(ctx.relacionalop(i - 1));
            Object secondValue = (Object)visit(ctx.simpleExpression(i));
            //52 equals, 57 dif, mayor 58, mi 59, menor 60, mei 61, and 68, and 2 69, or 70, 0r2 71

            switch (relativeOP.getType()) {
                case 52:
                    obj = (boolean) (value == secondValue);
                    value = (Object) obj;
                    break;
                case 57:
                    obj = (boolean) (value != secondValue);
                    value = (Object) obj;
                    break;
                case 58:
                    if (value instanceof Integer && secondValue instanceof Integer) {
                        int firstInt = (int) value;
                        int secondInt = (int) secondValue;
                        obj = (boolean) (firstInt > secondInt);
                        value = (Object) obj;
                    } else if (value instanceof Double && secondValue instanceof Double) {
                        double first = (double) value;
                        double second = (double) secondValue;
                        obj = (boolean) (first > second);
                        value = (Object) obj;
                    } else  if ((value instanceof Integer && secondValue instanceof Double )) {
                        int first = (int) value;
                        double second = (double) secondValue;
                        obj = (boolean) (first > second);
                        value = (Object) obj;
                    } else if ( value instanceof Double && secondValue instanceof Integer)  {
                        double first = (double) value;
                        int second = (int) secondValue;
                        obj = (boolean) (first > second);
                        value = (Object) obj;
                    }
                    break;
                case 59:
                    if (value instanceof Integer && secondValue instanceof Integer) {
                        int firstInt = (int) value;
                        int secondInt = (int) secondValue;
                        obj = (boolean) (firstInt >= secondInt);
                        value = (Object) obj;
                    } else if (value instanceof Double && secondValue instanceof Double) {
                        double first = (double) value;
                        double second = (double) secondValue;
                        obj = (boolean) (first >= second);
                        value = (Object) obj;
                    } else  if ((value instanceof Integer && secondValue instanceof Double )) {
                        int first = (int) value;
                        double second = (double) secondValue;
                        obj = (boolean) (first >= second);
                        value = (Object) obj;
                    } else if ( value instanceof Double && secondValue instanceof Integer)  {
                        double first = (double) value;
                        int second = (int) secondValue;
                        obj = (boolean) (first >= second);
                        value = (Object) obj;
                    }
                    break;
                case 60:
                    if (value instanceof Integer && secondValue instanceof Integer) {
                        int firstInt = (int) value;
                        int secondInt = (int) secondValue;
                        obj = (boolean) (firstInt < secondInt);
                        value = (Object) obj;
                    } else if (value instanceof Double && secondValue instanceof Double) {
                        double first = (double) value;
                        double second = (double) secondValue;
                        obj = (boolean) (first < second);
                        value = (Object) obj;
                    } else  if ((value instanceof Integer && secondValue instanceof Double )) {
                        int first = (int) value;
                        double second = (double) secondValue;
                        obj = (boolean) (first < second);
                        value = (Object) obj;
                    } else if ( value instanceof Double && secondValue instanceof Integer)  {
                        double first = (double) value;
                        int second = (int) secondValue;
                        obj = (boolean) (first < second);
                        value = (Object) obj;
                    }
                    break;
                case 61:
                    if (value instanceof Integer && secondValue instanceof Integer) {
                        int firstInt = (int) value;
                        int secondInt = (int) secondValue;
                        obj = (boolean) (firstInt <= secondInt);
                        value = (Object) obj;
                    } else if (value instanceof Double && secondValue instanceof Double) {
                        double first = (double) value;
                        double second = (double) secondValue;
                        obj = (boolean) (first  <=  second);
                        value = (Object) obj;
                    } else  if ((value instanceof Integer && secondValue instanceof Double )) {
                        int first = (int) value;
                        double second = (double) secondValue;
                        obj = (boolean) (first  <=  second);
                        value = (Object) obj;
                    } else if ( value instanceof Double && secondValue instanceof Integer)  {
                        double first = (double) value;
                        int second = (int) secondValue;
                        obj = (boolean) (first  <=  second);
                        value = (Object) obj;
                    }
                    break;
                case 68:
                case 69:
                    boolean firstBool = (boolean) value;
                    boolean secondBool = (boolean) secondValue;
                    //Verificar luego si es cierto que siemopre es false
                    System.out.println("Valor del and en expression " + (firstBool && secondBool));
                    obj = (boolean) (firstBool && secondBool);
                    value = (Object) obj;
                    break;
                case 70:
                case 71:
                    boolean firstOr = (boolean) value;
                    boolean secondOr = (boolean) secondValue;
                    //Verificar luego si es cierto que siemopre es false
                    System.out.println("Valor del or en expression " + (firstOr || secondOr));
                    obj = (boolean) (firstOr || secondOr);
                    value = (Object) obj;
                    break;
                default:
                    throw new AContextualException("Excepcion en el defaul de expression");
            }
        }

        return value;
    }

    @Override
    public Object visitSimpleExpressionAST(InterpreteParser.SimpleExpressionASTContext ctx) {

        Object value = visit(ctx.term(0));
        java.lang.Object obj = null;
        for (int i = 1; i <= ctx.term().toArray().length - 1; i++) {
            Token additiveOP = (Token) this.visit(ctx.additiveop(i - 1));
            //53 suma ,54 resta ,70 or
            Object secondValue = this.visit(ctx.term(i));
            if (additiveOP.getType() == 53) {
                if (value instanceof Integer && secondValue instanceof Integer) {
                    int firstInt = (int) value;
                    int secondInt = (int) secondValue;
                    obj = (int) firstInt + secondInt;
                    value = (Object) obj;
                } else if (value instanceof Double && secondValue instanceof Double) {
                    double first = (double) value;
                    double second = (double) secondValue;
                    obj = (double) first + second;
                    value = (Object) obj;
                } else  if ((value instanceof Integer && secondValue instanceof Double )) {
                    int first = (int) value;
                    double second = (double) secondValue;
                    obj = (double) first + second;
                    value = (Object) obj;
                } else if ( value instanceof Double && secondValue instanceof Integer)  {
                    double first = (double) value;
                    int second = (int) secondValue;
                    value = (Object) obj;
                    obj = (double) first + second;
                }else if(value instanceof String && secondValue instanceof String){
                    String first = (String) value;
                    String second = (String) secondValue;
                    obj = (String) first + second;
                    value = (Object) obj;
                }
            } else if (additiveOP.getType() == 54) {
                //resta
                if (value instanceof Integer && secondValue instanceof Integer) {
                    int firstInt = (int) value;
                    int secondInt = (int) secondValue;
                    obj = (int) firstInt - secondInt;
                    value = (Object) obj;
                } else if (value instanceof Double && secondValue instanceof Double) {
                    double first = (double) value;
                    double second = (double) secondValue;
                    obj = (double) first - second;
                    value = (Object) obj;
                } else  if ((value instanceof Integer && secondValue instanceof Double )) {
                    int first = (int) value;
                    double second = (double) secondValue;
                    obj = (double) first - second;
                    value = (Object) obj;
                } else if ( value instanceof Double && secondValue instanceof Integer)  {
                    double first = (double) value;
                    int second = (int) secondValue;
                    obj = (double) first - second;
                    value = (Object) obj;
                }
            } else if (additiveOP.getType() == 70 || additiveOP.getType() == 71) {
                boolean first = (boolean) value;
                boolean second = (boolean) secondValue;
                //Verificar luego si es cierto que siemopre es false
                System.out.println("Valor del or en simpleexpression " + (first || second));
                obj = (boolean) (first || second);
                value = (Object) obj;
            }
        }

        return value;
    }

    @Override
    public Object visitTermAST(InterpreteParser.TermASTContext ctx) {

        Object value =this.visit(ctx.factor(0));
        java.lang.Object obj = null;
        for (int i = 1; i <= ctx.factor().toArray().length - 1; i++) {

            InterpreterUtils utils = new InterpreterUtils();
            Token multiplicativeOP = (Token) this.visit(ctx.multiplicativeop(i - 1));
            Object secondValue = this.visit(ctx.factor(i));
            //55,56,68

            if (multiplicativeOP.getType() == 55) {
                //division
                if (value instanceof Integer && secondValue instanceof Integer) {
                    int firstInt = (int) value;
                    int secondInt = (int) secondValue;
                    utils.divisionBy0(secondInt);
                    obj = (int) firstInt / secondInt;
                    value = (Object) obj;
                } else if (value instanceof Double && secondValue instanceof Double) {
                    double first = (double) value;
                    double second = (double) secondValue;
                    utils.divisionBy0(second);
                    obj = (double) first / second;
                    value = (Object) obj;
                } else  if ((value instanceof Integer && secondValue instanceof Double )) {
                    int first = (int) value;
                    double second = (double) secondValue;
                    utils.divisionBy0(second);
                    obj = (double) first / second;
                    value = (Object) obj;
                } else if ( value instanceof Double && secondValue instanceof Integer)  {
                    double first = (double) value;
                    int second = (int) secondValue;
                    utils.divisionBy0(second);
                    obj = (double) first / second;
                    value = (Object) obj;
                }
            } else if (multiplicativeOP.getType() == 56) {
                if (value instanceof Integer && secondValue instanceof Integer) {
                    int firstInt = (int) value;
                    int secondInt = (int) secondValue;
                    obj = (int) firstInt * secondInt;
                    value = (Object) obj;
                } else if (value instanceof Double && secondValue instanceof Double) {
                    double first = (double) value;
                    double second = (double) secondValue;
                    obj = (double) first * second;
                    value = (Object) obj;
                } else  if ((value instanceof Integer && secondValue instanceof Double )) {
                    int first = (int) value;
                    double second = (double) secondValue;
                    obj = (double) first * second;
                    value = (Object) obj;
                } else if ( value instanceof Double && secondValue instanceof Integer)  {
                    double first = (double) value;
                    int second = (int) secondValue;
                    obj = (double) first * second;
                    value = (Object) obj;
                }
            } else if (multiplicativeOP.getType() == 68 || multiplicativeOP.getType() == 69) {
                //and
                boolean first = (boolean) value;
                boolean second = (boolean) secondValue;
                //Verificar luego si es cierto que siemopre es false
                System.out.println("Valor del and en term " + (first && second));
                obj = (boolean) (first && second);
                value = (Object) obj;
            }
        }

        return value;
    }

    @Override
    public Object visitLiteralFAST(InterpreteParser.LiteralFASTContext ctx) {
        return this.visit(ctx.literal());
    }

    @Override
    public Object visitIdFAST(InterpreteParser.IdFASTContext ctx) {
        VariableInterpreter var = storesSingleton.variableStore.searchNode( ctx.ID(0).getText());
        ArrayInterpreter varArray = storesSingleton.arrayStore.searchNode( ctx.ID(0).getText());

        if(var != null){
            if (ctx.ID(1) != null && ctx.PUNTO() != null) {
                ClassInterpreter classNode = (ClassInterpreter) var.getValue();
                VariableInterpreter attr = classNode.searchAttr(ctx.ID(1).getText());
                if(attr != null){
                    return (Object) attr.getValue();
                }else{
                    throw new AContextualException("Este atributo no existe");
                }
            }
            return (Object)  var.getValue();
        } else {
            int lenght = varArray.getDataList().length;
            java.lang.Object[] array = new java.lang.Object[lenght];
            for (int i = 0; i < lenght ; i++) {
                array[i] = varArray.getDataList()[i];
            }
            return (Object) array;
        }
    }

    @Override
    public Object visitFunctionCallFAST(InterpreteParser.FunctionCallFASTContext ctx) { return this.visit(ctx.functionCall()); }

    @Override
    public Object visitArrayLookupFAST(InterpreteParser.ArrayLookupFASTContext ctx) {return this.visit(ctx.arrayLookup()); }

    @Override
    public Object visitArrayLenghtFAST(InterpreteParser.ArrayLenghtFASTContext ctx) {return this.visit(ctx.arrayLenght()); }

    @Override
    public Object visitSubEspressionFAST(InterpreteParser.SubEspressionFASTContext ctx) {return this.visit(ctx.subEspression()); }

    @Override
    public Object visitArrayAllocationEspressionFAST(InterpreteParser.ArrayAllocationEspressionFASTContext ctx) {return this.visit(ctx.arrayAllocationEspression()); }

    @Override
    public Object visitAllocationExpressionFAST(InterpreteParser.AllocationExpressionFASTContext ctx) { return this.visit(ctx.allocationExpression()); }

    @Override
    public Object visitUnaryFAST(InterpreteParser.UnaryFASTContext ctx) { return this.visit(ctx.unary()); }

    @Override
    public Object visitUnaryAST(InterpreteParser.UnaryASTContext ctx) {

        Token tokenOperator = null;
        if (ctx.ADMIRACION() != null) {
            tokenOperator = ctx.ADMIRACION().getSymbol();
        } else if (ctx.SUM() != null) {
            tokenOperator = ctx.SUM().getSymbol();
        } else if (ctx.RES() != null) {
            tokenOperator = ctx.RES().getSymbol();
        }

        for (int i = 0; i <= ctx.expression().toArray().length - 1; i++) {
            Object value = visit(ctx.expression(i));
            if (tokenOperator.getType() == 53 ) {
                //suma
                return value;
            }
            if( tokenOperator.getType() == 54){
                //resta
                if (value instanceof Integer){
                    int intValue = (int) value;
                    java.lang.Object obj = (int)(intValue*-1);
                    return (Object) obj;
                }else{
                    double doubleValue = (double) value;
                    java.lang.Object obj = (double)(doubleValue*-1);
                    return (Object) obj;
                }
            }
            if (tokenOperator.getType() == 62) {
                boolean booleanValue = !((boolean) value);
                java.lang.Object objValue = (boolean) booleanValue;
                return (Object) objValue;
            }
        }

        return null;
    }

    @Override
    public Object visitAllocationExpressionAST(InterpreteParser.AllocationExpressionASTContext ctx) {
        ClassInterpreter classInterpreter = storesSingleton.classStore.searchNode(ctx.ID().getText());

        ArrayList<VariableInterpreter> auxAttrList = new ArrayList<>();
        for (VariableInterpreter attr: classInterpreter.getAttrList()) {
            VariableInterpreter newInstance = new VariableInterpreter(attr.getId(),attr.getLevel(),attr.getDeclCtx(),attr.getValue(),attr.getType());
            auxAttrList.add(newInstance);
        }
        ClassInterpreter newClassInstance = new ClassInterpreter(classInterpreter.getId(),classInterpreter.getLevel(),classInterpreter.getDeclCtx(),auxAttrList);
        return (Object) newClassInstance;
    }

    @Override
    public Object visitArrayAllocationEspressionAST(InterpreteParser.ArrayAllocationEspressionASTContext ctx) {
        int lenght = (int)this.visit(ctx.expression());
        if(lenght > -1){
            java.lang.Object[] array =  new java.lang.Object[lenght];;
            return (Object) array;
        }else{
            throw new AContextualException("Error, fuera de rango, no se aceptan valores negativos");
        }

    }

    @Override
    public Object visitSubEspressionAST(InterpreteParser.SubEspressionASTContext ctx) {return this.visit(ctx.expression());}

    @Override
    public Object visitFunctionCallAST(InterpreteParser.FunctionCallASTContext ctx) {
        FunctionInterpreter function = storesSingleton.functionsStore.searchNode(ctx.ID().getText());
        if (ctx.actualParams() != null) {
            ArrayList<Object> paremeters = (ArrayList<Object>) this.visit(ctx.actualParams());
            for (int i = 0; i < function.getParameterList().size(); i++) {
                Object valueParameter = paremeters.get(i);
                Object parameter = (Object) function.getParameterList().get(i);
                if (parameter instanceof VariableInterpreter) {
                    VariableInterpreter variable = (VariableInterpreter) parameter;
                    variable.updateValue(valueParameter);
                    storesSingleton.variableStore.enter(variable);
                }else if(parameter instanceof ArrayInterpreter){
                    ArrayInterpreter variable = (ArrayInterpreter) parameter;
                    variable.setDataList((java.lang.Object[]) valueParameter);
                    storesSingleton.arrayStore.enter(variable);
                }
            }
        }
        Object valueReturn =  null;
        if(function.getId().getText().equals("len")){
            VariableInterpreter parameter = (VariableInterpreter) function.getParameterList().get(0);
            java.lang.Object value = (int) (((String)(parameter.getValue())).length());
            valueReturn =(Object) value ;
        }else if(function.getId().getText().equals("ord")){
            //char a entero
            VariableInterpreter parameter = (VariableInterpreter) function.getParameterList().get(0);
            int value =  ((char)(parameter.getValue()));
            java.lang.Object obj = value;
            valueReturn =(Object) obj ;
        }else if(function.getId().getText().equals("chr")){
            //entero a char
            VariableInterpreter parameter = (VariableInterpreter) function.getParameterList().get(0);
            char value = (char)((int)(parameter.getValue()));
            java.lang.Object obj = (char) value;
            valueReturn =(Object) obj ;
        }else {
            InterpreteParser.FunctionDeclASTContext declASTContext = (InterpreteParser.FunctionDeclASTContext) function.getDeclCtx();
            valueReturn = this.visit(declASTContext.block());


        }
        return valueReturn;
    }

    @Override
    public Object visitActualParamsAST(InterpreteParser.ActualParamsASTContext ctx) {

        ArrayList<Object> paremeters = new ArrayList<>();
        Object first = visit(ctx.expression(0));
        paremeters.add(first);
        for (int i = 1; i <= ctx.expression().toArray().length - 1; i++) {
            Object obj = visit(ctx.expression(i));
            paremeters.add(obj);
        }
        return (Object) paremeters;
    }

    @Override
    public Object visitArrayLookupAST(InterpreteParser.ArrayLookupASTContext ctx) {
        ArrayInterpreter arrayNode =  storesSingleton.arrayStore.searchNode(ctx.ID().getText());
        int position = (int) this.visit(ctx.expression());
        if(position <= arrayNode.getDataList().length && position > -1){
            return (Object) arrayNode.getDataList()[position];
        }else{
            throw new AContextualException("Error, posicion fuera de rango");
        }
    }

    @Override
    public Object visitArrayLenghtAST(InterpreteParser.ArrayLenghtASTContext ctx) {
        ArrayInterpreter arrayNode =  storesSingleton.arrayStore.searchNode(ctx.ID().getText());
        int lenght = arrayNode.getDataList().length;
        java.lang.Object objValue = (int) lenght;
        return (Object) objValue;
    }

    @Override
    public Object visitMayorRAST(InterpreteParser.MayorRASTContext ctx) {
        return (Object) ctx.MAYOR().getSymbol();
    }

    @Override
    public Object visitMayorIgualRAST(InterpreteParser.MayorIgualRASTContext ctx) {return (Object) ctx.MAYORIGUAL().getSymbol(); }

    @Override
    public Object visitMenorRAST(InterpreteParser.MenorRASTContext ctx) {
        return (Object) ctx.MENOR().getSymbol();
    }

    @Override
    public Object visitMenorIgualRAST(InterpreteParser.MenorIgualRASTContext ctx) {return (Object) ctx.MENORIGUAL().getSymbol(); }

    @Override
    public Object visitEqualsRAST(InterpreteParser.EqualsRASTContext ctx) {
        return (Object) ctx.EQUALS().getSymbol();
    }


    @Override
    public Object visitOrRAST(InterpreteParser.OrRASTContext ctx) {
        return (Object) ctx.OR().getSymbol();
    }

    @Override
    public Object visitOr2RAST(InterpreteParser.Or2RASTContext ctx) {
        return (Object) ctx.OR2().getSymbol();
    }

    @Override
    public Object visitAndRAST(InterpreteParser.AndRASTContext ctx) {
        return (Object) ctx.AND().getSymbol();
    }

    @Override
    public Object visitAnd2RAST(InterpreteParser.And2RASTContext ctx) {
        return (Object) ctx.AND2().getSymbol();
    }

    @Override
    public Object visitDifRAST(InterpreteParser.DifRASTContext ctx) {
        return (Object) ctx.DIF().getSymbol();
    }

    @Override
    public Object visitSumAST(InterpreteParser.SumASTContext ctx) {
        return (Object) ctx.SUM().getSymbol();
    }

    @Override
    public Object visitResAST(InterpreteParser.ResASTContext ctx) {
        return (Object) ctx.RES().getSymbol();
    }

    @Override
    public Object visitOrAST(InterpreteParser.OrASTContext ctx) {
        return (Object) ctx.OR().getSymbol();
    }

    @Override
    public Object visitMulAST(InterpreteParser.MulASTContext ctx) {
        return (Object) ctx.MUL().getSymbol();
    }

    @Override
    public Object visitDivAST(InterpreteParser.DivASTContext ctx) {
        return (Object) ctx.DIV().getSymbol();
    }

    @Override
    public Object visitAndAST(InterpreteParser.AndASTContext ctx) {
        return (Object) ctx.AND().getSymbol();
    }

    @Override
    public Object visitInLAST(InterpreteParser.InLASTContext ctx) {
        int value = Integer.parseInt(ctx.INTLITERAL().getText());
        java.lang.Object objValue = (int) value;
        return (Object) objValue;
    }

    @Override
    public Object visitRealLAST(InterpreteParser.RealLASTContext ctx) {

        double value = Double.parseDouble(ctx.REALLITERAL().getText());
        java.lang.Object objValue = (double) value;
        return (Object) objValue;
    }

    @Override
    public Object visitBoolLAST(InterpreteParser.BoolLASTContext ctx) {

        boolean value = Boolean.parseBoolean(ctx.BOOLLITERAL().getText());
        java.lang.Object objValue = (boolean) value;
        return (Object) objValue;

    }

    @Override
    public Object visitStringLAST(InterpreteParser.StringLASTContext ctx) {
        String value =ctx.STRINGLITERAL().getText();
        value = value.replace("\"","");
        return (Object) value;
    }

    @Override
    public Object visitCharLAST(InterpreteParser.CharLASTContext ctx) {
        char value = ctx.CHARLITERAL().getText().charAt(1);
        java.lang.Object objValue = (char) value;
        return (Object) objValue;
    }


}
