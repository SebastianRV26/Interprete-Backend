package com.edbinns.interprete.visitors.analisis_contextual;

import com.edbinns.interprete.generated.InterpreteParser;
import com.edbinns.interprete.generated.InterpreteParserBaseVisitor;
import com.edbinns.interprete.models.TreeItem;

import java.util.ArrayList;

public class AnalisisContextualAST<Object> extends InterpreteParserBaseVisitor<Object> {
    private int numTabs = 0;

    @Override
    public Object visitProgramAST(InterpreteParser.ProgramASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));

        for (int i = 0; i <= ctx.statement().toArray().length - 1; i++) {
            visit(ctx.statement(i));
        }

        return null;

    }

    @Override
    public Object visitVariableDeclSAST(InterpreteParser.VariableDeclSASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));


        TreeItem pyComa = new TreeItem(ctx.PyCOMA().getText(), numTabs);
        this.visit(ctx.variableDecl());


        return null;
    }

    @Override
    public Object visitClassDeclSAST(InterpreteParser.ClassDeclSASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));


        TreeItem pyComa = new TreeItem(ctx.PyCOMA().getText(), numTabs);
         this.visit(ctx.classDecl());


        return null;
    }

    @Override
    public Object visitAssignSAST(InterpreteParser.AssignSASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));

        TreeItem pyComa = new TreeItem(ctx.PyCOMA().getText(), numTabs);
         this.visit(ctx.assignment());


        return null;
    }

    @Override
    public Object visitArrayAssignSAST(InterpreteParser.ArrayAssignSASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));


        TreeItem pyComa = new TreeItem(ctx.PyCOMA().getText(), numTabs);
         this.visit(ctx.arrayAssignment());


        return null;
    }

    @Override
    public Object visitPrintSAST(InterpreteParser.PrintSASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));


        TreeItem pyComa = new TreeItem(ctx.PyCOMA().getText(), numTabs);
        this.visit(ctx.printStatement());


        return null;
    }

    @Override
    public Object visitIfSAST(InterpreteParser.IfSASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));


         this.visit(ctx.ifStatement());

        return null;
    }

    @Override
    public Object visitWhileSAST(InterpreteParser.WhileSASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));


         this.visit(ctx.whileStatement());

        return null;

    }

    @Override
    public Object visitReturnSAST(InterpreteParser.ReturnSASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));


        TreeItem pyComa = new TreeItem(ctx.PyCOMA().getText(), numTabs);
        this.visit(ctx.returnStatement());

        return null;
    }

    @Override
    public Object visitFunctionDeclSAST(InterpreteParser.FunctionDeclSASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        this.visit(ctx.functionDecl());

        return null;

    }

    @Override
    public Object visitBlockSAST(InterpreteParser.BlockSASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        this.visit(ctx.block());

        return null;
    }

    @Override
    public Object visitBlockAST(InterpreteParser.BlockASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));

        TreeItem ppLlaveIzq = new TreeItem(ctx.LLAVEIZQ().getText(), numTabs);
        TreeItem ppLlavaDer = new TreeItem(ctx.LLAVEDER().getText(), numTabs);

        for (int i = 0; i < ctx.statement().size(); i++) {
             this.visit(ctx.statement(i));

        }

        return null;
    }

    @Override
    public Object visitFunctionDeclAST(InterpreteParser.FunctionDeclASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        this.visit(ctx.type());
        TreeItem id = new TreeItem(ctx.ID().getText(),numTabs);
        TreeItem parentesisIZQ = new TreeItem(ctx.PARENTESISIZQ().getText(),numTabs);

        if(ctx.formalParams() != null){
            this.visit(ctx.formalParams());
        }
        TreeItem parentesisDER = new TreeItem(ctx.PARENTESISDER().getText(),numTabs);
        this.visit(ctx.block());


        return null;
    }

    @Override
    public Object visitFormalParamsAST(InterpreteParser.FormalParamsASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        this.visit(ctx.formalParam(0));

        for (int i = 1; i <= ctx.formalParam().toArray().length - 1; i++) {
            if (ctx.COMA(i - 1) != null) {
                 visit(ctx.COMA(i - 1));
                 visit(ctx.formalParam(i));

            }
        }

        return null;
    }

    @Override
    public Object visitFormalParamAST(InterpreteParser.FormalParamASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        this.visit(ctx.type());
        TreeItem id = new TreeItem(ctx.ID().getText(),numTabs);


        return null;
    }

    @Override
    public Object visitWhileAST(InterpreteParser.WhileASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));


        TreeItem visitWhile = new TreeItem(ctx.WHILE().getText(), numTabs);
        TreeItem parentesisIZQ = new TreeItem(ctx.PARENTESISIZQ().getText(), numTabs);
         this.visit(ctx.expression());
        TreeItem parentesisDER = new TreeItem(ctx.PARENTESISDER().getText(), numTabs);
         this.visit(ctx.block());
        return null;
    }

    @Override
    public Object visitIfAST(InterpreteParser.IfASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));

        TreeItem visitIF = new TreeItem(ctx.IF().getText(), numTabs);
        TreeItem parentesisIZQ = new TreeItem(ctx.PARENTESISIZQ().getText(), numTabs);
        this.visit(ctx.expression());
        TreeItem parentesisDER = new TreeItem(ctx.PARENTESISDER().getText(), numTabs);
        this.visit(ctx.block(0));

        if((ctx.ELSE() != null ) && (ctx.block(1) != null)){
            TreeItem elseVisit = new TreeItem(ctx.ELSE().getText(), numTabs);
            this.visit(ctx.block(1));
        }

        return null;
    }

    @Override
    public Object visitReturnAST(InterpreteParser.ReturnASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));

        TreeItem returnVisit = new TreeItem(ctx.RETURN().getText(),numTabs);
        this.visit(ctx.expression());

        return null;
    }

    @Override
    public Object visitPrintAST(InterpreteParser.PrintASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));

        TreeItem print = new TreeItem(ctx.PRINT().getText(),numTabs);
        this.visit(ctx.expression());

        return null;
    }

    @Override
    public Object visitClassDeclAST(InterpreteParser.ClassDeclASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));

        TreeItem classVisit = new TreeItem(ctx.CLASS().getText(),numTabs );
        TreeItem ID = new TreeItem(ctx.ID().getText(),numTabs );
        TreeItem llaveIZQ = new TreeItem(ctx.LLAVEIZQ().getText(),numTabs );

        for (int i = 0; i <= ctx.classVariableDecl().toArray().length - 1; i++) {
             visit(ctx.classVariableDecl(i));

        }
        TreeItem llaveDER = new TreeItem(ctx.LLAVEDER().getText(),numTabs );

        return null;
    }

    @Override
    public Object visitClassVariableDeclAST(InterpreteParser.ClassVariableDeclASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));

         this.visit(ctx.simpleType());

        if((ctx.ASYGN() != null) && (ctx.expression() != null)){
            TreeItem asygn  = new TreeItem(ctx.ASYGN().getText(),numTabs);
            this.visit(ctx.expression());
        }


        return null;
    }

    @Override
    public Object visitVariableDeclAST(InterpreteParser.VariableDeclASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));

        this.visit(ctx.type());
        TreeItem ID = new TreeItem(ctx.ID().getText(),numTabs);

        if((ctx.ASYGN() != null) && (ctx.expression() != null)){
            TreeItem asygn  = new TreeItem(ctx.ASYGN().getText(),numTabs);
            this.visit(ctx.expression());

        }


        return null;
    }

    @Override
    public Object visitTypeAST(InterpreteParser.TypeASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        this.visit(ctx.simpleType());
        return null;
    }

    @Override
    public Object visitArrayTypeTAST(InterpreteParser.ArrayTypeTASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));

        this.visit(ctx.arrayType());

        return null;
    }

    @Override
    public Object visitIdAST(InterpreteParser.IdASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));

        TreeItem text = new TreeItem(ctx.ID().getText(), numTabs);
        return null;
    }

    @Override
    public Object visitArrayTypeAST(InterpreteParser.ArrayTypeASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));

        this.visit(ctx.simpleType());
        TreeItem bracketIZQ = new TreeItem(ctx.BRACKETIZQ().getText(),numTabs);
        TreeItem bracketDER = new TreeItem(ctx.BRACKE5TDER().getText(),numTabs);

        return null;
    }

    @Override
    public Object visitAssignAST(InterpreteParser.AssignASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));

        TreeItem firstID = new TreeItem(ctx.ID(0).getText(),numTabs);

        if((ctx.PUNTO() != null) && (ctx.ID(1) != null)){
            TreeItem punto = new TreeItem(ctx.PUNTO().getText(),numTabs);
            TreeItem nextID = new TreeItem(ctx.ID(1).getText(),numTabs);
        }
        TreeItem asygn  = new TreeItem(ctx.ASYGN().getText(),numTabs);
        visit(ctx.expression());

        return null;
    }

    @Override
    public Object visitArrayAssignAST(InterpreteParser.ArrayAssignASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));

        TreeItem id = new TreeItem(ctx.ID().getText(),numTabs);
        TreeItem bracketIZQ  = new TreeItem(ctx.BRACKETIZQ().getText(),numTabs);
         visit(ctx.expression(0));
        TreeItem bracketDER  = new TreeItem(ctx.BRACKE5TDER().getText(),numTabs);
        TreeItem asygn  = new TreeItem(ctx.ASYGN().getText(),numTabs);

        if(ctx.expression(1) != null){
           visit(ctx.expression(1));
        }

        return null;
    }

    @Override
    public Object visitBooleanTAST(InterpreteParser.BooleanTASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));

        TreeItem text = new TreeItem(ctx.BOOLEAN().getText(), numTabs);


        return null;
    }

    @Override
    public Object visitCharTAST(InterpreteParser.CharTASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));

        TreeItem text = new TreeItem(ctx.CHAR().getText(), numTabs);

        return null;
    }

    @Override
    public Object visitIntTAST(InterpreteParser.IntTASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));

        TreeItem text = new TreeItem(ctx.INT().getText(), numTabs);


        return null;
    }

    @Override
    public Object visitStringTAST(InterpreteParser.StringTASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));

        TreeItem text = new TreeItem(ctx.STRING().getText(), numTabs);


        return null;
    }

    @Override
    public Object visitExpressionAST(InterpreteParser.ExpressionASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        visit(ctx.simpleExpression(0));

        for (int i = 1; i <= ctx.simpleExpression().toArray().length - 1; i++) {
            if (ctx.relacionalop(i - 1) != null) {
                 visit(ctx.relacionalop(i - 1));
                 visit(ctx.simpleExpression(i));
            }
        }

        return null;
    }

    @Override
    public Object visitSimpleExpressionAST(InterpreteParser.SimpleExpressionASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));

        visit(ctx.term(0));
        for (int i = 1; i <= ctx.term().toArray().length - 1; i++) {
            if (ctx.additiveop(i - 1) != null) {
                visit(ctx.additiveop(i - 1));
                visit(ctx.term(i));
            }
        }

        return null;
    }

    @Override
    public Object visitTermAST(InterpreteParser.TermASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));

        this.visit(ctx.factor(0));

        for (int i = 1; i <= ctx.factor().toArray().length - 1; i++) {
            if (ctx.multiplicativeop(i - 1) != null) {
                 visit(ctx.multiplicativeop(i - 1));
                 visit(ctx.factor(i));
            }
        }

        return null;
    }

    @Override
    public Object visitLiteralFAST(InterpreteParser.LiteralFASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));

        this.visit(ctx.literal());


        return null;
    }

    @Override
    public Object visitIdFAST(InterpreteParser.IdFASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));

        TreeItem firstID = new TreeItem(ctx.ID(0).getText(),numTabs);


        if((ctx.PUNTO() != null) && (ctx.ID(1) != null)){
            TreeItem punto = new TreeItem(ctx.PUNTO().getText(),numTabs);
            TreeItem nextID = new TreeItem(ctx.ID(1).getText(),numTabs);
        }

        return null;
    }

    @Override
    public Object visitFunctionCallFAST(InterpreteParser.FunctionCallFASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));

        this.visit(ctx.functionCall());

        return null;
    }

    @Override
    public Object visitArrayLookupFAST(InterpreteParser.ArrayLookupFASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));

         this.visit(ctx.arrayLookup());

        return null;
    }

    @Override
    public Object visitArrayLenghtFAST(InterpreteParser.ArrayLenghtFASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));

        this.visit(ctx.arrayLenght());

        return null;
    }

    @Override
    public Object visitSubEspressionFAST(InterpreteParser.SubEspressionFASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));

        this.visit(ctx.subEspression());

        return null;
    }

    @Override
    public Object visitArrayAllocationEspressionFAST(InterpreteParser.ArrayAllocationEspressionFASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));

        this.visit(ctx.arrayAllocationEspression());

        return null;
    }

    @Override
    public Object visitAllocationExpressionFAST(InterpreteParser.AllocationExpressionFASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));

         this.visit(ctx.allocationExpression());

        return null;
    }

    @Override
    public Object visitUnaryFAST(InterpreteParser.UnaryFASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));

         this.visit(ctx.unary());

        return null;
    }

    @Override
    public Object visitUnaryAST(InterpreteParser.UnaryASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));

        if(ctx.SUM() != null){
            TreeItem sum = new TreeItem(ctx.SUM().getText(),numTabs);
        }

        if(ctx.RES() != null){
            TreeItem res = new TreeItem(ctx.RES().getText(),numTabs);
        }

        if(ctx.ADMIRACION() != null){
            TreeItem admiracion = new TreeItem(ctx.ADMIRACION().getText(),numTabs);
        }

        for (int i = 0; i <= ctx.expression().toArray().length - 1; i++) {
             visit(ctx.expression(i));
        }

        return null;
    }

    @Override
    public Object visitAllocationExpressionAST(InterpreteParser.AllocationExpressionASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));

        TreeItem visitNew = new TreeItem(ctx.NEW().getText(), numTabs);
        TreeItem id = new TreeItem(ctx.ID().getText(), numTabs);
        TreeItem parentesisIZQ = new TreeItem(ctx.PARENTESISIZQ().getText(),numTabs);
        TreeItem parentesisDER = new TreeItem(ctx.PARENTESISDER().getText(),numTabs);


        return null;
    }

    @Override
    public Object visitArrayAllocationEspressionAST(InterpreteParser.ArrayAllocationEspressionASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));

        TreeItem visitNew = new TreeItem(ctx.NEW().getText(), numTabs);
        this.visit(ctx.simpleType());
        TreeItem bracketIZQ = new TreeItem(ctx.BRACKETIZQ().getText(), numTabs);
        this.visit(ctx.expression());
        TreeItem bracketDER = new TreeItem(ctx.BRACKE5TDER().getText(), numTabs);

        return null;
    }

    @Override
    public Object visitSubEspressionAST(InterpreteParser.SubEspressionASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));

        TreeItem parentesisIZQ = new TreeItem(ctx.PARENTESISIZQ().getText(),numTabs);
        this.visit(ctx.expression());
        TreeItem parentesisDER = new TreeItem(ctx.PARENTESISDER().getText(),numTabs);


        return null;
    }

    @Override
    public Object visitFunctionCallAST(InterpreteParser.FunctionCallASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));

        TreeItem id = new TreeItem(ctx.ID().getText(),numTabs);
        TreeItem parentesisIZQ = new TreeItem(ctx.PARENTESISIZQ().getText(),numTabs);
        if(ctx.actualParams() != null){
            this.visit(ctx.actualParams());
        }
        TreeItem parentesisDER = new TreeItem(ctx.PARENTESISDER().getText(),numTabs);



       return null;
    }

    @Override
    public Object visitActualParamsAST(InterpreteParser.ActualParamsASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));

        visit(ctx.expression(0));
        for (int i = 1; i <= ctx.expression().toArray().length - 1; i++) {
            if (ctx.COMA(i - 1) != null) {
                TreeItem coma = new TreeItem(ctx.COMA(i-1).getText(), numTabs);
                visit(ctx.expression(i));
            }
        }
         return null;
    }

    @Override
    public Object visitArrayLookupAST(InterpreteParser.ArrayLookupASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));

        TreeItem id = new TreeItem(ctx.ID().getText(), numTabs);
        TreeItem bracketIZQ = new TreeItem(ctx.BRACKETIZQ().getText(), numTabs);
        this.visit(ctx.expression());
        TreeItem bracketDER = new TreeItem(ctx.BRACKE5TDER().getText(), numTabs);

        return null;
    }

    @Override
    public Object visitArrayLenghtAST(InterpreteParser.ArrayLenghtASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));


        TreeItem lenght = new TreeItem(ctx.LENGHT().getText(), numTabs);
        TreeItem id = new TreeItem(ctx.ID().getText(), numTabs);
        TreeItem punto = new TreeItem(ctx.PUNTO().getText(), numTabs);
        //No visita nada
        return null;
    }

    @Override
    public Object visitMayorRAST(InterpreteParser.MayorRASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        //No visita nada
        return null;
    }

    @Override
    public Object visitMayorIgualRAST(InterpreteParser.MayorIgualRASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
         //No visita nada
        return null;
    }

    @Override
    public Object visitMenorRAST(InterpreteParser.MenorRASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        //No visita nada
        return null;
    }

    @Override
    public Object visitMenorIgualRAST(InterpreteParser.MenorIgualRASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        //No visita nada
        return null;
    }

    @Override
    public Object visitEqualsRAST(InterpreteParser.EqualsRASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        //No visita nada
        return null;
    }


    @Override
    public Object visitOrRAST(InterpreteParser.OrRASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        //No visita nada
        return null;
    }

    @Override
    public Object visitOr2RAST(InterpreteParser.Or2RASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        //No visita nada
        return null;
    }

    @Override
    public Object visitAndRAST(InterpreteParser.AndRASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        //No visita nada
        return null;
    }

    @Override
    public Object visitAnd2RAST(InterpreteParser.And2RASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        //No visita nada
        return null;
    }

    @Override
    public Object visitDifRAST(InterpreteParser.DifRASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        //No visita nada
        return null;
    }

    @Override
    public Object visitSumAST(InterpreteParser.SumASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        //No visita nada
        return null;
    }

    @Override
    public Object visitResAST(InterpreteParser.ResASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        //No visita nada
        return null;
    }

    @Override
    public Object visitOrAST(InterpreteParser.OrASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        //No visita nada
        return null;
    }

    @Override
    public Object visitMulAST(InterpreteParser.MulASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        //No visita nada
        return null;
    }

    @Override
    public Object visitDivAST(InterpreteParser.DivASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        //No visita nada
        return null;
    }

    @Override
    public Object visitAndAST(InterpreteParser.AndASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        //No visita nada
        return null;
    }

    @Override
    public Object visitInLAST(InterpreteParser.InLASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        //No visita nada
        return null;
    }

    @Override
    public Object visitRealLAST(InterpreteParser.RealLASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        //No visita nada
        return null;
    }

    @Override
    public Object visitBoolLAST(InterpreteParser.BoolLASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        //No visita nada
        return null;
    }

    @Override
    public Object visitStringLAST(InterpreteParser.StringLASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        //No visita nada
        return null;

    }
}
