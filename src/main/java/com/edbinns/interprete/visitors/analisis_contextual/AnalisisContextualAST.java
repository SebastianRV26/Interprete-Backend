package com.edbinns.interprete.visitors.analisis_contextual;

import com.edbinns.interprete.generated.InterpreteParser;
import com.edbinns.interprete.generated.InterpreteParserBaseVisitor;
import com.edbinns.interprete.visitors.analisis_contextual.models.ClassNode;
import com.edbinns.interprete.visitors.analisis_contextual.models.FunctionNode;
import com.edbinns.interprete.visitors.analisis_contextual.models.Type;
import com.edbinns.interprete.visitors.analisis_contextual.models.VariableNode;
import org.antlr.v4.runtime.Token;

import java.util.ArrayList;

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
            parametersList.add((VariableNode) this.visit(ctx.formalParam(i)));
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

        Token obj = (Token) this.visit(ctx.factor(0));
        if (obj != null) {
            System.out.println(obj.getType());
            System.out.println(obj.getText());
            if ((obj.getType() >= 87) && (obj.getType() <= 90)) {
                System.out.println("entro");
                return (Object) obj;
            }
        }

        for (int i = 1; i <= ctx.factor().toArray().length - 1; i++) {

            this.visit(ctx.multiplicativeop(i - 1));
            this.visit(ctx.factor(i));
        }

        return null;
    }

    @Override
    public Object visitLiteralFAST(InterpreteParser.LiteralFASTContext ctx) {
        return this.visit(ctx.literal());
    }

    @Override
    public Object visitIdFAST(InterpreteParser.IdFASTContext ctx) {


        return null;
    }

    @Override
    public Object visitFunctionCallFAST(InterpreteParser.FunctionCallFASTContext ctx) {


        this.visit(ctx.functionCall());

        return null;
    }

    @Override
    public Object visitArrayLookupFAST(InterpreteParser.ArrayLookupFASTContext ctx) {

        this.visit(ctx.arrayLookup());

        return null;
    }

    @Override
    public Object visitArrayLenghtFAST(InterpreteParser.ArrayLenghtFASTContext ctx) {

        this.visit(ctx.arrayLenght());

        return null;
    }

    @Override
    public Object visitSubEspressionFAST(InterpreteParser.SubEspressionFASTContext ctx) {

        this.visit(ctx.subEspression());

        return null;
    }

    @Override
    public Object visitArrayAllocationEspressionFAST(InterpreteParser.ArrayAllocationEspressionFASTContext ctx) {

        this.visit(ctx.arrayAllocationEspression());

        return null;
    }

    @Override
    public Object visitAllocationExpressionFAST(InterpreteParser.AllocationExpressionFASTContext ctx) {

        this.visit(ctx.allocationExpression());

        return null;
    }

    @Override
    public Object visitUnaryFAST(InterpreteParser.UnaryFASTContext ctx) {

        this.visit(ctx.unary());

        return null;
    }

    @Override
    public Object visitUnaryAST(InterpreteParser.UnaryASTContext ctx) {


        for (int i = 0; i <= ctx.expression().toArray().length - 1; i++) {
            visit(ctx.expression(i));
        }

        return null;
    }

    @Override
    public Object visitAllocationExpressionAST(InterpreteParser.AllocationExpressionASTContext ctx) {


        return null;
    }

    @Override
    public Object visitArrayAllocationEspressionAST(InterpreteParser.ArrayAllocationEspressionASTContext ctx) {

        this.visit(ctx.simpleType());

        this.visit(ctx.expression());


        return null;
    }

    @Override
    public Object visitSubEspressionAST(InterpreteParser.SubEspressionASTContext ctx) {

        this.visit(ctx.expression());


        return null;
    }

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

        this.visit(ctx.expression());


        return null;
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
        return (Object) vn;
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
