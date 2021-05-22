package com.edbinns.InterpreteBackend.visitors.interprete;

import com.edbinns.InterpreteBackend.generated.InterpreteParser;
import com.edbinns.InterpreteBackend.generated.InterpreteParserBaseVisitor;
import com.edbinns.InterpreteBackend.models.Type;
import com.edbinns.InterpreteBackend.visitors.analisis_contextual.utils.AContextualException;
import org.antlr.v4.runtime.Token;

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

        for (int i = 0; i <= ctx.classVariableDecl().toArray().length - 1; i++) {
            visit(ctx.classVariableDecl(i));

        }
        return null;
    }

    @Override
    public Object visitClassVariableDeclAST(InterpreteParser.ClassVariableDeclASTContext ctx) {

        storesSingleton.variableStore.openScope();
        storesSingleton.classStore.openScope();
        this.visit(ctx.simpleType());

        if ((ctx.ASYGN() != null) && (ctx.expression() != null)) {

        }
        storesSingleton.variableStore.closeScope();
        storesSingleton.classStore.closeScope();
        return null;
    }


    @Override
    public Object visitVariableDeclAST(InterpreteParser.VariableDeclASTContext ctx) {


        this.visit(ctx.type());

        if ((ctx.ASYGN() != null) && (ctx.expression() != null)) {
            this.visit(ctx.expression());

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

        return null;
    }

    @Override
    public Object visitArrayTypeAST(InterpreteParser.ArrayTypeASTContext ctx) {

      this.visit(ctx.simpleType());

        return null;
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
    public Object visitRealTAST(InterpreteParser.RealTASTContext ctx) {
        return  (Object) Type.REAL;
    }

    @Override
    public Object visitExpressionAST(InterpreteParser.ExpressionASTContext ctx) {

        String typeObj = (String) visit(ctx.simpleExpression(0));
        for (int i = 1; i <= ctx.simpleExpression().toArray().length - 1; i++) {

            Token relativeOP = (Token)visit(ctx.relacionalop(i - 1));
            visit(ctx.simpleExpression(i));
            //52 equals, 57 dif, mayor 58, mi 59, menor 60, mei 61, and 68, and 2 69, or 70, 0r2 71

            switch (relativeOP.getType()){
                case 52:
                case 57:

                    break;
                case 58:
                case 59:
                case 60:
                case 61:

                    break;
                case 68:
                case 69:
                case 70:
                case 71:

                    break;
                default:
                    throw new AContextualException("Excepcion en el defaul de expression");
            }
        }

        return null;
    }

    @Override
    public Object visitSimpleExpressionAST(InterpreteParser.SimpleExpressionASTContext ctx) {

         visit(ctx.term(0));
        for (int i = 1; i <= ctx.term().toArray().length - 1; i++) {
            Token additiveOP = (Token) this.visit(ctx.additiveop(i - 1));
            //53 suma ,54 resta ,70 or
            this.visit(ctx.term(i));
            if (additiveOP.getType() == 53) {

            } else if (additiveOP.getType() == 54) {

            } else if (additiveOP.getType() == 68) {

            }
        }

        return null;
    }

    @Override
    public Object visitTermAST(InterpreteParser.TermASTContext ctx) {

        this.visit(ctx.factor(0));
        for (int i = 1; i <= ctx.factor().toArray().length - 1; i++) {

            Token multiplicativeOP = (Token) this.visit(ctx.multiplicativeop(i - 1));
            this.visit(ctx.factor(i));

            //55,56,68
            if (multiplicativeOP.getType() == 55) {

            } else if (multiplicativeOP.getType() == 56) {

            } else if (multiplicativeOP.getType() == 68) {

            }
        }

        return null;
    }

    @Override
    public Object visitLiteralFAST(InterpreteParser.LiteralFASTContext ctx) {
        return this.visit(ctx.literal());
    }

    @Override
    public Object visitIdFAST(InterpreteParser.IdFASTContext ctx) {

        //acceder a la posicion sub 0 del ID

            if(ctx.ID(1) != null && ctx.PUNTO() != null){

            }
            return null;

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
            if(tokenOperator.getType() == 53 || tokenOperator.getType() == 54  ){

            }
            if(tokenOperator.getType() == 62 ){

            }
        }

        return null;
    }

    @Override
    public Object visitAllocationExpressionAST(InterpreteParser.AllocationExpressionASTContext ctx) {

        return null;
    }

    @Override
    public Object visitArrayAllocationEspressionAST(InterpreteParser.ArrayAllocationEspressionASTContext ctx) {

        ///Falta validar que la expresion sea siempre un entero
        this.visit(ctx.simpleType());
        this.visit(ctx.expression());

        return null;
    }

    @Override
    public Object visitSubEspressionAST(InterpreteParser.SubEspressionASTContext ctx) {
        return  this.visit(ctx.expression());
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

    @Override
    public Object visitCharLAST(InterpreteParser.CharLASTContext ctx) {
        return (Object) ctx.CHARLITERAL().getSymbol();
    }


}
