package com.edbinns.InterpreteBackend.visitors.interprete;

import com.edbinns.InterpreteBackend.generated.InterpreteParser;
import com.edbinns.InterpreteBackend.generated.InterpreteParserBaseVisitor;
import com.edbinns.InterpreteBackend.models.Type;
import com.edbinns.InterpreteBackend.visitors.analisis_contextual.utils.AContextualException;
import com.edbinns.InterpreteBackend.visitors.interprete.models.ArrayInterpreter;
import com.edbinns.InterpreteBackend.visitors.interprete.models.ClassInterpreter;
import com.edbinns.InterpreteBackend.visitors.interprete.models.VariableInterpreter;
import com.edbinns.InterpreteBackend.visitors.interprete.utils.InterpreterUtils;
import org.antlr.v4.runtime.Token;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class InterpreteAST<Object> extends InterpreteParserBaseVisitor<Object> {


    private StoresSingleton storesSingleton;

    public InterpreteAST() {
        this.storesSingleton = StoresSingleton.getInstance();
    }

    @Override
    public Object visitProgramAST(InterpreteParser.ProgramASTContext ctx) {
        for (int i = 0; i <= ctx.statement().toArray().length - 1; i++) {
            this.visit(ctx.statement(i));
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
        this.visit(ctx.ifStatement());
        return null;
    }

    @Override
    public Object visitWhileSAST(InterpreteParser.WhileSASTContext ctx) {
        this.visit(ctx.whileStatement());
        return null;
    }

    @Override
    public Object visitReturnSAST(InterpreteParser.ReturnSASTContext ctx) {
        this.visit(ctx.returnStatement());
        return null;
    }

    @Override
    public Object visitFunctionDeclSAST(InterpreteParser.FunctionDeclSASTContext ctx) {
        this.visit(ctx.functionDecl());

        return null;

    }

    @Override
    public Object visitBlockSAST(InterpreteParser.BlockSASTContext ctx) {
        this.visit(ctx.block());
        return null;
    }

    @Override
    public Object visitBlockAST(InterpreteParser.BlockASTContext ctx) {

        storesSingleton.arrayStore.openScope();
        storesSingleton.variableStore.openScope();
        for (int i = 0; i < ctx.statement().size(); i++) {
            this.visit(ctx.statement(i));
        }
        storesSingleton.arrayStore.closeScope();
        storesSingleton.variableStore.closeScope();
        return null;
    }

    @Override
    public Object visitFunctionDeclAST(InterpreteParser.FunctionDeclASTContext ctx) {


        storesSingleton.functionsStore.openScope();
        this.visit(ctx.type());


        if (ctx.formalParams() != null) {
            this.visit(ctx.formalParams());
        }

        this.visit(ctx.block());

        storesSingleton.functionsStore.closeScope();
        return null;
    }

    @Override
    public Object visitFormalParamsAST(InterpreteParser.FormalParamsASTContext ctx) {

        this.visit(ctx.formalParam(0));
        for (int i = 1; i <= ctx.formalParam().toArray().length - 1; i++) {
            visit(ctx.COMA(i - 1));
            visit(ctx.formalParam(i));


        }
        return null;
    }

    @Override
    public Object visitFormalParamAST(InterpreteParser.FormalParamASTContext ctx) {

        this.visit(ctx.type());


        return null;
    }

    @Override
    public Object visitWhileAST(InterpreteParser.WhileASTContext ctx) {

        this.visit(ctx.expression());

        this.visit(ctx.block());


        return null;
    }

    @Override
    public Object visitIfAST(InterpreteParser.IfASTContext ctx) {

        this.visit(ctx.expression());

        this.visit(ctx.block(0));

        if ((ctx.ELSE() != null) && (ctx.block(1) != null)) {

            this.visit(ctx.block(1));
        }


        return null;
    }

    @Override
    public Object visitReturnAST(InterpreteParser.ReturnASTContext ctx) {
        this.visit(ctx.expression());

        return null;
    }

    @Override
    public Object visitPrintAST(InterpreteParser.PrintASTContext ctx) {

        this.visit(ctx.expression());

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
        VariableInterpreter attr = new VariableInterpreter(id,level,ctx,value,type);
        return (Object) attr;
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
                array = new java.lang.Object[lenght];
            } else {
                array = (java.lang.Object[]) value;
            }
            type = type.replace("[]", "");
            ArrayInterpreter variable = new ArrayInterpreter(id, level, ctx, type, array);
            storesSingleton.arrayStore.enter(variable);
        } else {
            VariableInterpreter variable = new VariableInterpreter(id, level, ctx, value, type);
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


        visit(ctx.expression());


        if (ctx.ID(1) != null && ctx.PUNTO() != null) {


        }

        return null;
    }

    @Override
    public Object visitArrayAssignAST(InterpreteParser.ArrayAssignASTContext ctx) {


        visit(ctx.expression(0));

        if (ctx.expression(1) != null) {
            visit(ctx.expression(1));

        }


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
        for (int i = 1; i <= ctx.simpleExpression().toArray().length - 1; i++) {

            Token relativeOP = (Token) visit(ctx.relacionalop(i - 1));
            Object secondValue = (Object)visit(ctx.simpleExpression(i));
            //52 equals, 57 dif, mayor 58, mi 59, menor 60, mei 61, and 68, and 2 69, or 70, 0r2 71
            java.lang.Object obj = null;
            switch (relativeOP.getType()) {
                case 52:
                    obj = (boolean) (value == secondValue);
                    break;
                case 57:
                    obj = (boolean) (value != secondValue);
                    break;
                case 58:
                    if (value instanceof Integer && secondValue instanceof Integer) {
                        int firstInt = (int) value;
                        int secondInt = (int) secondValue;
                        obj = (boolean) (firstInt > secondInt);
                    } else if (value instanceof Double && secondValue instanceof Double) {
                        double first = (double) value;
                        double second = (double) secondValue;
                        obj = (boolean) (first > second);
                    } else  if ((value instanceof Integer && secondValue instanceof Double )) {
                        int first = (int) value;
                        double second = (double) secondValue;
                        obj = (boolean) (first > second);
                    } else if ( value instanceof Double && secondValue instanceof Integer)  {
                        double first = (double) value;
                        int second = (int) secondValue;
                        obj = (boolean) (first > second);
                    }
                    break;
                case 59:
                    if (value instanceof Integer && secondValue instanceof Integer) {
                        int firstInt = (int) value;
                        int secondInt = (int) secondValue;
                        obj = (boolean) (firstInt >= secondInt);
                    } else if (value instanceof Double && secondValue instanceof Double) {
                        double first = (double) value;
                        double second = (double) secondValue;
                        obj = (boolean) (first >= second);
                    } else  if ((value instanceof Integer && secondValue instanceof Double )) {
                        int first = (int) value;
                        double second = (double) secondValue;
                        obj = (boolean) (first >= second);
                    } else if ( value instanceof Double && secondValue instanceof Integer)  {
                        double first = (double) value;
                        int second = (int) secondValue;
                        obj = (boolean) (first >= second);
                    }
                    break;
                case 60:
                    if (value instanceof Integer && secondValue instanceof Integer) {
                        int firstInt = (int) value;
                        int secondInt = (int) secondValue;
                        obj = (boolean) (firstInt < secondInt);
                    } else if (value instanceof Double && secondValue instanceof Double) {
                        double first = (double) value;
                        double second = (double) secondValue;
                        obj = (boolean) (first < second);
                    } else  if ((value instanceof Integer && secondValue instanceof Double )) {
                        int first = (int) value;
                        double second = (double) secondValue;
                        obj = (boolean) (first < second);
                    } else if ( value instanceof Double && secondValue instanceof Integer)  {
                        double first = (double) value;
                        int second = (int) secondValue;
                        obj = (boolean) (first < second);
                    }
                    break;
                case 61:
                    if (value instanceof Integer && secondValue instanceof Integer) {
                        int firstInt = (int) value;
                        int secondInt = (int) secondValue;
                        obj = (boolean) (firstInt <= secondInt);
                    } else if (value instanceof Double && secondValue instanceof Double) {
                        double first = (double) value;
                        double second = (double) secondValue;
                        obj = (boolean) (first  <=  second);
                    } else  if ((value instanceof Integer && secondValue instanceof Double )) {
                        int first = (int) value;
                        double second = (double) secondValue;
                        obj = (boolean) (first  <=  second);
                    } else if ( value instanceof Double && secondValue instanceof Integer)  {
                        double first = (double) value;
                        int second = (int) secondValue;
                        obj = (boolean) (first  <=  second);
                    }
                    break;
                case 68:
                case 69:
                    boolean firstBool = (boolean) value;
                    boolean secondBool = (boolean) secondValue;
                    //Verificar luego si es cierto que siemopre es false
                    System.out.println("Valor del and en expression " + (firstBool || secondBool));
                    obj = (boolean) (firstBool || secondBool);
                    break;
                case 70:
                case 71:
                    boolean firstOr = (boolean) value;
                    boolean secondOr = (boolean) secondValue;
                    //Verificar luego si es cierto que siemopre es false
                    System.out.println("Valor del or en expression " + (firstOr || secondOr));
                    obj = (boolean) (firstOr || secondOr);
                    break;
                default:
                    throw new AContextualException("Excepcion en el defaul de expression");
            }
            return (Object) obj;
        }

        return null;
    }

    @Override
    public Object visitSimpleExpressionAST(InterpreteParser.SimpleExpressionASTContext ctx) {

        Object value = visit(ctx.term(0));
        for (int i = 1; i <= ctx.term().toArray().length - 1; i++) {
            Token additiveOP = (Token) this.visit(ctx.additiveop(i - 1));
            //53 suma ,54 resta ,70 or
            Object secondValue = this.visit(ctx.term(i));
            java.lang.Object obj = null;
            if (additiveOP.getType() == 53) {
                if (value instanceof Integer && secondValue instanceof Integer) {
                    int firstInt = (int) value;
                    int secondInt = (int) secondValue;
                    obj = (int) firstInt + secondInt;
                } else if (value instanceof Double && secondValue instanceof Double) {
                    double first = (double) value;
                    double second = (double) secondValue;
                    obj = (double) first + second;
                } else  if ((value instanceof Integer && secondValue instanceof Double )) {
                    int first = (int) value;
                    double second = (double) secondValue;
                    obj = (double) first + second;
                } else if ( value instanceof Double && secondValue instanceof Integer)  {
                    double first = (double) value;
                    int second = (int) secondValue;
                    obj = (double) first + second;
                }else if(value instanceof String && secondValue instanceof String){
                    String first = (String) value;
                    String second = (String) secondValue;
                    obj = (String) first + second;
                }
            } else if (additiveOP.getType() == 54) {
                //resta
                if (value instanceof Integer && secondValue instanceof Integer) {
                    int firstInt = (int) value;
                    int secondInt = (int) secondValue;
                    obj = (int) firstInt - secondInt;
                } else if (value instanceof Double && secondValue instanceof Double) {
                    double first = (double) value;
                    double second = (double) secondValue;
                    obj = (double) first - second;
                } else  if ((value instanceof Integer && secondValue instanceof Double )) {
                    int first = (int) value;
                    double second = (double) secondValue;
                    obj = (double) first - second;
                } else if ( value instanceof Double && secondValue instanceof Integer)  {
                    double first = (double) value;
                    int second = (int) secondValue;
                    obj = (double) first - second;
                }
            } else if (additiveOP.getType() == 70 || additiveOP.getType() == 71) {
                boolean first = (boolean) value;
                boolean second = (boolean) secondValue;
                //Verificar luego si es cierto que siemopre es false
                System.out.println("Valor del or en simpleexpression " + (first || second));
                obj = (boolean) (first || second);
            }
            return (Object) obj;
        }

        return value;
    }

    @Override
    public Object visitTermAST(InterpreteParser.TermASTContext ctx) {

        Object value =this.visit(ctx.factor(0));
        for (int i = 1; i <= ctx.factor().toArray().length - 1; i++) {

            InterpreterUtils utils = new InterpreterUtils();
            Token multiplicativeOP = (Token) this.visit(ctx.multiplicativeop(i - 1));
            Object secondValue = this.visit(ctx.factor(i));
            //55,56,68
            java.lang.Object obj = null;
            if (multiplicativeOP.getType() == 55) {
                //division
                if (value instanceof Integer && secondValue instanceof Integer) {
                    int firstInt = (int) value;
                    int secondInt = (int) secondValue;
                    utils.divisionBy0(secondInt);
                    obj = (int) firstInt / secondInt;
                } else if (value instanceof Double && secondValue instanceof Double) {
                    double first = (double) value;
                    double second = (double) secondValue;
                    utils.divisionBy0(second);
                    obj = (double) first / second;
                } else  if ((value instanceof Integer && secondValue instanceof Double )) {
                    int first = (int) value;
                    double second = (double) secondValue;
                    utils.divisionBy0(second);
                    obj = (double) first / second;
                } else if ( value instanceof Double && secondValue instanceof Integer)  {
                    double first = (double) value;
                    int second = (int) secondValue;
                    utils.divisionBy0(second);
                    obj = (double) first / second;
                }
            } else if (multiplicativeOP.getType() == 56) {
                if (value instanceof Integer && secondValue instanceof Integer) {
                    int firstInt = (int) value;
                    int secondInt = (int) secondValue;
                    obj = (int) firstInt * secondInt;
                } else if (value instanceof Double && secondValue instanceof Double) {
                    double first = (double) value;
                    double second = (double) secondValue;
                    obj = (double) first * second;
                } else  if ((value instanceof Integer && secondValue instanceof Double )) {
                    int first = (int) value;
                    double second = (double) secondValue;
                    obj = (double) first * second;
                } else if ( value instanceof Double && secondValue instanceof Integer)  {
                    double first = (double) value;
                    int second = (int) secondValue;
                    obj = (double) first * second;
                }
            } else if (multiplicativeOP.getType() == 68 || multiplicativeOP.getType() == 69) {
                //and
                boolean first = (boolean) value;
                boolean second = (boolean) secondValue;
                //Verificar luego si es cierto que siemopre es false
                System.out.println("Valor del and en term " + (first && second));
                obj = (boolean) (first && second);
            }
            return (Object) obj;
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
//        ClassInterpreter classNode = storesSingleton.classStore.searchNode(var.getType());

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
        return (Object) classInterpreter;
    }

    @Override
    public Object visitArrayAllocationEspressionAST(InterpreteParser.ArrayAllocationEspressionASTContext ctx) {
        int lenght = (int)this.visit(ctx.expression());
        java.lang.Object[] array =  new java.lang.Object[lenght];;
        return (Object) array;
    }

    @Override
    public Object visitSubEspressionAST(InterpreteParser.SubEspressionASTContext ctx) {return this.visit(ctx.expression());}

    @Override
    public Object visitFunctionCallAST(InterpreteParser.FunctionCallASTContext ctx) {

        if (ctx.actualParams() != null) {
            this.visit(ctx.actualParams());

        }
        return null;
    }

    @Override
    public Object visitActualParamsAST(InterpreteParser.ActualParamsASTContext ctx) {


        visit(ctx.expression(0));

        for (int i = 1; i <= ctx.expression().toArray().length - 1; i++) {
            visit(ctx.expression(i));
        }
        return null;
    }

    @Override
    public Object visitArrayLookupAST(InterpreteParser.ArrayLookupASTContext ctx) {
        ArrayInterpreter arrayNode =  storesSingleton.arrayStore.searchNode(ctx.ID().getText());
        int position = (int) this.visit(ctx.expression());
        if(position <= arrayNode.getDataList().length){
            return (Object) arrayNode.getDataList()[position];
        }else{
            throw new AContextualException("posicion fuera de rango");
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
        return (Object) ctx.STRINGLITERAL().getText();
    }

    @Override
    public Object visitCharLAST(InterpreteParser.CharLASTContext ctx) {
        char value = ctx.CHARLITERAL().getText().charAt(0);
        java.lang.Object objValue = (char) value;
        return (Object) objValue;
    }


}
