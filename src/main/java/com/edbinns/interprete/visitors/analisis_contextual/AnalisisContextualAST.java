package com.edbinns.interprete.visitors.analisis_contextual;

import com.edbinns.interprete.generated.InterpreteParser;
import com.edbinns.interprete.generated.InterpreteParserBaseVisitor;
import com.edbinns.interprete.visitors.analisis_contextual.models.ClassNode;
import com.edbinns.interprete.visitors.analisis_contextual.models.FunctionNode;
import com.edbinns.interprete.visitors.analisis_contextual.models.Type;
import com.edbinns.interprete.visitors.analisis_contextual.models.VariableNode;
import org.antlr.v4.codegen.model.chunk.RulePropertyRef_ctx;
import org.antlr.v4.runtime.Token;

import java.util.ArrayList;
import java.util.LinkedList;

public class AnalisisContextualAST<Object> extends InterpreteParserBaseVisitor<Object> {

    TablesSingleton tablesSingleton;

    public AnalisisContextualAST() {
        this.tablesSingleton = TablesSingleton.getInstance();
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

        tablesSingleton.variableTable.openScope();

        for (int i = 0; i < ctx.statement().size(); i++) {
            this.visit(ctx.statement(i));
        }
        tablesSingleton.variableTable.imprimir();
        tablesSingleton.variableTable.closeScope();
        return null;
    }

    @Override
    public Object visitFunctionDeclAST(InterpreteParser.FunctionDeclASTContext ctx) {
        try{
            int level = tablesSingleton.functionsTable.getLevel();
            tablesSingleton.functionsTable.openScope();
            Object objectType = this.visit(ctx.type());
            String type = null;
            Boolean isArray = false;
            if (objectType instanceof Type) {
                type = ((Type) objectType).name();
                isArray = false;
            } else if (objectType instanceof String) {
                //Se detecta si es de tipo array
                type = ((String) objectType).replace("[]", "");
                isArray = true;
            } else {
                //Validar si la clase que se instancio existe
                type = ((Token) objectType).getText();
            }
            ArrayList<VariableNode> parametersList = new ArrayList<>();
            if (ctx.formalParams() != null) {
                parametersList.addAll((ArrayList<VariableNode>) this.visit(ctx.formalParams()));
            }

            Token id = ctx.ID().getSymbol();

            FunctionNode function = tablesSingleton.functionsTable.searchNode(id.getText());
            if(function != null){
                throw   new AContextualException("Ya existe la funcion " + id.getText());
            }

            FunctionNode fn = new FunctionNode(id, level, ctx, type, parametersList, isArray);
            tablesSingleton.functionsTable.enter(fn);

            this.visit(ctx.block());
            tablesSingleton.functionsTable.imprimir();
            tablesSingleton.functionsTable.closeScope();
        }catch (AContextualException e){
            System.out.println(e.getMessage());
        }

        return null;
    }

    @Override
    public Object visitFormalParamsAST(InterpreteParser.FormalParamsASTContext ctx) {
        ArrayList<VariableNode> parametersList = new ArrayList<>();
        parametersList.add((VariableNode) this.visit(ctx.formalParam(0)));
        for (int i = 1; i <= ctx.formalParam().toArray().length - 1; i++) {
            visit(ctx.COMA(i - 1));
            VariableNode vn = (VariableNode) visit(ctx.formalParam(i));
            for (VariableNode attr : parametersList) {
                if (attr.getId().getText().equals(vn.getId().getText()))
                    throw new AContextualException("Error, no se pueden repetir parametro dentro de una funcion");

            }
            parametersList.add(vn);
        }
        return (Object) parametersList;
    }

    @Override
    public Object visitFormalParamAST(InterpreteParser.FormalParamASTContext ctx) {

        Object objectType = this.visit(ctx.type());
        String type = null;
        if (objectType instanceof Type) {
            type = ((Type) objectType).name();
        } else {
            //Validar si la clase que se instancio existe
            type = ((Token) objectType).getText();
        }
        Token id = ctx.ID().getSymbol();
        int level = tablesSingleton.functionsTable.getLevel();
        VariableNode vn = new VariableNode(id, level, ctx, type, null, false);

        return (Object) vn;
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
        try{
            int level = tablesSingleton.classTable.getLevel();
            tablesSingleton.classTable.openScope();
            ArrayList<VariableNode> attrList = new ArrayList<>();
            for (int i = 0; i <= ctx.classVariableDecl().toArray().length - 1; i++) {
                VariableNode vn = (VariableNode) visit(ctx.classVariableDecl(i));
                for (VariableNode attr : attrList) {
                    if (attr.getId().getText().equals(vn.getId().getText()))
                        throw new AContextualException("Error, no se pueden repetir atributos en una clase");

                }
                attrList.add(vn);
            }
            Token id = ctx.ID().getSymbol();
            ClassNode temp = tablesSingleton.classTable.searchNode(id.getText());
            if(temp != null){
                throw  new AContextualException("Error, esta clase ya existe en el sistema");
            }
            ClassNode cn = new ClassNode(id, level, ctx, attrList);
            tablesSingleton.classTable.enter(cn);
            tablesSingleton.classTable.imprimir();
            tablesSingleton.classTable.closeScope();
        }catch (AContextualException e){
            System.out.println(e.getMessage());
        }


        return null;
    }

    @Override
    public Object visitClassVariableDeclAST(InterpreteParser.ClassVariableDeclASTContext ctx) {


        Object objectType = this.visit(ctx.simpleType());
        String type = null;
        if (objectType instanceof Type) {
            type = ((Type) objectType).name();
        } else {
            throw new AContextualException("No es un tipo de dato valido para un atributo de una clase");
        }

        int level = tablesSingleton.classTable.getLevel();
        Token id = ctx.ID().getSymbol();

        Token value = null;
        if ((ctx.ASYGN() != null) && (ctx.expression() != null)) {
            Object objectValue =  this.visit(ctx.expression());
            value = validateAssing(type, value, objectValue);
        }
        VariableNode variable = new VariableNode(id, level, ctx, type, value, false);


        return (Object) variable;
    }



    @Override
    public Object visitVariableDeclAST(InterpreteParser.VariableDeclASTContext ctx) {

        try {
            Object objectType = this.visit(ctx.type());
            String type = null;
            Boolean isArray = false;
            if (objectType instanceof Type) {
                type = ((Type) objectType).name();
                isArray = false;
            } else if (objectType instanceof String) {
                //Se detecta si es de tipo array
                type = ((String) objectType).replace("[]", "");
                isArray = true;
            } else {
                //Validar si la clase que se instancio existe
                type = ((Token) objectType).getText();
            }


            int level = tablesSingleton.variableTable.getLevel();
            Token id = ctx.ID().getSymbol();

            VariableNode vn =  tablesSingleton.variableTable.searchNode(id.getText());
            if(vn != null && level == vn.getLevel()){
                throw new AContextualException("Error, ya existe una variable con el nombre " + id.getText() + " dentro del nivel " + level);
            }

            Token value = null;
            if ((ctx.ASYGN() != null) && (ctx.expression() != null)) {
                Object objectValue = (Object) this.visit(ctx.expression());
                value = validateAssing(type, value, objectValue);

            }
            VariableNode variable = new VariableNode(id, level, ctx, type, value, isArray);
            tablesSingleton.variableTable.enter(variable);
        } catch (AContextualException e) {
            System.out.println(e.getMessage());
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
        ClassNode cn = tablesSingleton.classTable.searchNode(ctx.ID().getText());
        if (cn == null) {
            throw new AContextualException("\"" + ctx.ID().getText() + "\" no es un tipo de dato valido");
        }
        return (Object) ctx.ID().getSymbol();
    }

    @Override
    public Object visitArrayTypeAST(InterpreteParser.ArrayTypeASTContext ctx) {

        Type arrayType = (Type) this.visit(ctx.simpleType());

        return (Object) (arrayType.name() + "[]");
    }

    @Override
    public Object visitAssignAST(InterpreteParser.AssignASTContext ctx) {


        visit(ctx.expression());

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
        return (Object) Type.BOOLEAN;
    }

    @Override
    public Object visitCharTAST(InterpreteParser.CharTASTContext ctx) {
        return (Object) Type.CHAR;
    }

    @Override
    public Object visitIntTAST(InterpreteParser.IntTASTContext ctx) {
        return (Object) Type.INT;
    }

    @Override
    public Object visitStringTAST(InterpreteParser.StringTASTContext ctx) {
        return (Object) Type.STRING;
    }

    @Override
    public Object visitExpressionAST(InterpreteParser.ExpressionASTContext ctx) {

        Object obj = visit(ctx.simpleExpression(0));

        for (int i = 1; i <= ctx.simpleExpression().toArray().length - 1; i++) {

            visit(ctx.relacionalop(i - 1));
            visit(ctx.simpleExpression(i));
        }

        return obj;
    }

    @Override
    public Object visitSimpleExpressionAST(InterpreteParser.SimpleExpressionASTContext ctx) {

        Object obj = visit(ctx.term(0));
        for (int i = 1; i <= ctx.term().toArray().length - 1; i++) {

            visit(ctx.additiveop(i - 1));
            visit(ctx.term(i));
        }

        return obj;
    }

    @Override
    public Object visitTermAST(InterpreteParser.TermASTContext ctx) {
//        if (obj != null) {
//            if(obj instanceof  Token){
//                 token = (Token) obj;
////                if ((token.getType() >= 87) && (token.getType() <= 90)) {
////                }
//            } else  if (obj instanceof VariableNode) {
//
//            }
//
//        }


        //Sirve para obtener el valor de la asignacion
        Object obj = (Object) this.visit(ctx.factor(0));

        for (int i = 1; i <= ctx.factor().toArray().length - 1; i++) {

            Token additiveOP = (Token) this.visit(ctx.multiplicativeop(i - 1));
            Object obj2 =  this.visit(ctx.factor(i));
            //55,56,68
            if(additiveOP.getType() == 55){
                //div

            } else  if(additiveOP.getType() == 56){
                //mul
            }else  if(additiveOP.getType() == 68){
                //and
            }

        }

        return obj;
    }

    @Override
    public Object visitLiteralFAST(InterpreteParser.LiteralFASTContext ctx) {
        return this.visit(ctx.literal());
    }

    @Override
    public Object visitIdFAST(InterpreteParser.IdFASTContext ctx) {

        ClassNode cn = tablesSingleton.classTable.searchNode(ctx.ID(0).getText());

        VariableNode vn = tablesSingleton.variableTable.searchNode(ctx.ID(0).getText());
        LinkedList<FunctionNode> table =  tablesSingleton.functionsTable.getTable();
        if(cn != null ){
            if(ctx.ID(1) != null && ctx.PUNTO() != null){
                VariableNode attr = cn.search(ctx.ID(1).getText());
                if(attr == null){
                    throw  new AContextualException("No se puede acceder al atributo " + attr.getId().getText() + " debido a que no es un atributo de la clase " + cn.getId().getText());
                }
                return (Object) attr;
            }
            return (Object) cn;
        }else if(vn != null){
            return (Object) vn;
        } else{
            for (FunctionNode fn: table) {
               VariableNode parameter =  fn.searchParameters(ctx.ID(0).getText());
               if(parameter != null){
                   return (Object)  parameter;
               }
            }
            throw  new AContextualException("Esta variable o clase no existe en el programa");
        }
    }

    @Override
    public Object visitFunctionCallFAST(InterpreteParser.FunctionCallFASTContext ctx) { return this.visit(ctx.functionCall()); }

    @Override
    public Object visitArrayLookupFAST(InterpreteParser.ArrayLookupFASTContext ctx) { return this.visit(ctx.arrayLookup()); }

    @Override
    public Object visitArrayLenghtFAST(InterpreteParser.ArrayLenghtFASTContext ctx) { return this.visit(ctx.arrayLenght()); }

    @Override
    public Object visitSubEspressionFAST(InterpreteParser.SubEspressionFASTContext ctx) { return  this.visit(ctx.subEspression()); }

    @Override
    public Object visitArrayAllocationEspressionFAST(InterpreteParser.ArrayAllocationEspressionFASTContext ctx) { return   this.visit(ctx.arrayAllocationEspression()); }

    @Override
    public Object visitAllocationExpressionFAST(InterpreteParser.AllocationExpressionFASTContext ctx) { return   this.visit(ctx.allocationExpression()); }

    @Override
    public Object visitUnaryFAST(InterpreteParser.UnaryFASTContext ctx) {
        return this.visit(ctx.unary());
    }

    @Override
    public Object visitUnaryAST(InterpreteParser.UnaryASTContext ctx) {

        Token tokenOperator = null;

        if(ctx.ADMIRACION() != null){
            tokenOperator = ctx.ADMIRACION().getSymbol();
        } else if(ctx.SUM() != null){
            tokenOperator = ctx.SUM().getSymbol();
        } else if(ctx.RES() != null){
            tokenOperator = ctx.RES().getSymbol();
        }


        for (int i = 0; i <= ctx.expression().toArray().length - 1; i++) {
            visit(ctx.expression(i));
        }

        return (Object) "unary";
    }

    @Override
    public Object visitAllocationExpressionAST(InterpreteParser.AllocationExpressionASTContext ctx) {
        ClassNode cn = tablesSingleton.classTable.searchNode(ctx.ID().getText());
        if(cn == null){
            throw new AContextualException("No se puede instanciar la clase " +ctx.ID().getText()+ ", ya que no ha sido declarada");
        }
        return (Object) cn;
    }

    @Override
    public Object visitArrayAllocationEspressionAST(InterpreteParser.ArrayAllocationEspressionASTContext ctx) {

        ///Falta validar que la expresion sea siempre un entero
         Object type = this.visit(ctx.simpleType());
        this.visit(ctx.expression());
        return type;
    }

    @Override
    public Object visitSubEspressionAST(InterpreteParser.SubEspressionASTContext ctx) {
        return  this.visit(ctx.expression());
    }

    @Override
    public Object visitFunctionCallAST(InterpreteParser.FunctionCallASTContext ctx) {
        FunctionNode fn = tablesSingleton.functionsTable.searchNode(ctx.ID().getText());
        if (fn == null) {
            throw new AContextualException("La funcion " + ctx.ID().getText() + " no ha sido declarada");
        }
        if (ctx.actualParams() != null) {
            ArrayList<Object> paremeters = (ArrayList<Object>) this.visit(ctx.actualParams());

            System.out.println("parameters " + paremeters.size());
            System.out.println("parameters 2 " + fn.getParameterList().size());
            if (paremeters.size() == fn.getParameterList().size()) {
                for (int i = 0; i < fn.getParameterList().size(); i++) {
                    Object obj = paremeters.get(i);
                    VariableNode parameter = fn.getParameterList().get(i);
                    if (!(obj instanceof Token)) {
                        if (obj instanceof VariableNode) {
                            VariableNode lookup = (VariableNode) obj;
                            if (!lookup.getType().equals(parameter.getType())) {
                                throw new AContextualException("Error,el tipo del parametro  " + parameter.getId().getText() + " no coincide tipo de " + lookup.getId().getText());
                            }
                        } else if (obj instanceof FunctionNode){
                            FunctionNode function = (FunctionNode) obj;
                            if (!function.getType().equals(parameter.getType())) {
                                throw new AContextualException("Error,el tipo del parametro  " + parameter.getId().getText() + " no coincide con el retorno de la funcion " + function.getId().getText());
                            }
                        } else if(obj instanceof Type){
                            Type type = (Type) obj;
                            if (!type.name().equals(parameter.getType())) {
                                throw new AContextualException("Error,el tipo del parametro  " + parameter.getId().getText() + " no coincide  con el del array");
                            }
                        }else if(obj instanceof ClassNode){
                            ClassNode classNode = (ClassNode) obj;
                            if (classNode.getId().getText().equals(parameter.getType())) {
                                throw new AContextualException("Error,el tipo del parametro  " + parameter.getId().getText() + " no coincide  con el del valor enviado");
                            }
                        } else if(obj instanceof String){
                            System.out.println("Esto es un unary");
                        }
                    } else {
                        Token token = (Token) obj;
                        switch (token.getType()) {
                            case 40:
                            case 87:
                            case 88:
                                if (!parameter.getType().equals("INT")) {
                                    throw new AContextualException("Error,el " + parameter.getId().getText() + " debe de ser de tipo int");
                                }
                                break;
                            case 89:
                                if (!parameter.getType().equals("BOOLEAN")) {
                                    throw new AContextualException("Error,el " + parameter.getId().getText() + " debe de ser de tipo int");
                                }
                                break;
                            case 90:
                                if (!parameter.getType().equals("STRING")) {
                                    throw new AContextualException("Error,el " + parameter.getId().getText() + " debe de ser de tipo int");
                                }
                                break;
                            default:
                                throw new AContextualException("Error, tipo de dato no valido");

                        }
                    }
                }
            } else {
                throw new AContextualException("La cantidad de parametros enviados no corresponden a la cantiad de parametros esperados por la funcion " + fn.getId().getText());
            }
        }
        return (Object) fn;
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
        VariableNode vn= tablesSingleton.variableTable.searchNode(ctx.ID().getText());
        if(vn == null){
            throw  new AContextualException("El arreglo " + ctx.ID().getText() +  " no existe");
        }
        if(!vn.getIsArray()){
            throw  new AContextualException("No es posible hacer una busqueda en la variable " + ctx.ID().getText() +  " debido a que no es un array");
        }
        this.visit(ctx.expression());
        return (Object) vn;
    }

    @Override
    public Object visitArrayLenghtAST(InterpreteParser.ArrayLenghtASTContext ctx) {
        VariableNode vn= tablesSingleton.variableTable.searchNode(ctx.ID().getText());
        if(vn == null){
            throw  new AContextualException("El arreglo " + ctx.ID().getText() +  " no existe");
        }
        if(!vn.getIsArray()){
            throw  new AContextualException("A la variable " + ctx.ID().getText() +  " no es posible obtener su lenght");
        }
        return (Object) ctx.LENGHT();
    }

    @Override
    public Object visitMayorRAST(InterpreteParser.MayorRASTContext ctx) {
        return (Object) ctx.MAYOR().getSymbol();
    }

    @Override
    public Object visitMayorIgualRAST(InterpreteParser.MayorIgualRASTContext ctx) {
        return (Object) ctx.MAYORIGUAL().getSymbol();
    }

    @Override
    public Object visitMenorRAST(InterpreteParser.MenorRASTContext ctx) {
        return (Object) ctx.MENOR().getSymbol();
    }

    @Override
    public Object visitMenorIgualRAST(InterpreteParser.MenorIgualRASTContext ctx) {
        return (Object) ctx.MENORIGUAL().getSymbol();
    }

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

        return (Object) ctx.INTLITERAL().getSymbol();
    }

    @Override
    public Object visitRealLAST(InterpreteParser.RealLASTContext ctx) {

        return (Object) ctx.REALLITERAL().getSymbol();
    }

    @Override
    public Object visitBoolLAST(InterpreteParser.BoolLASTContext ctx) {

        return (Object) ctx.BOOLLITERAL().getSymbol();

    }

    @Override
    public Object visitStringLAST(InterpreteParser.StringLASTContext ctx) {
        return (Object) ctx.STRINGLITERAL().getSymbol();
    }

    private Token validateAssing(String type, Token value, java.lang.Object objectValue) {
        if (objectValue instanceof Token) {
            value = (Token) objectValue;
            switch (type) {
                case "INT":
                    if ( !(value.getType() == 87 ) && !(value.getType() == 88))
                        throw new AContextualException(value.getText() +  " no es posible asignarlo a una variable tipo int ");
                    break;
                case "STRING":
                case "CHAR":
                    if (!(value.getType() == 90 ))
                        throw new AContextualException(value.getText() +  " no es posible asignarlo a una variable tipo int ");
                    break;
                case "BOOLEAN":
                    if (!(value.getType() == 89 ))
                        throw new AContextualException(value.getText() +  " no es posible asignarlo a una variable tipo int ");
                    break;
                default:
                    throw new AContextualException(value.getText() +" no correponde a ningun valor");
            }
        }
        return value;
    }


}
