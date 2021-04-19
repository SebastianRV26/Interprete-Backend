package com.edbinns.interprete.visitors.pretty_print;

import com.edbinns.interprete.generated.InterpreteParser;
import com.edbinns.interprete.generated.InterpreteParserBaseVisitor;
import com.edbinns.interprete.models.TreeItem;
import com.google.gson.Gson;
import org.antlr.runtime.tree.Tree;

import java.util.ArrayList;

public class PrettyPrintAST<Object> extends InterpreteParserBaseVisitor<Object> {
    private int numTabs = 0;
    public TreeItem treeItem;
    @Override
    public Object visitProgramAST(InterpreteParser.ProgramASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        numTabs++;

        ArrayList<TreeItem> list = new ArrayList<>();
        treeItem = new TreeItem(ctx.getClass().getSimpleName().replace("Context", ""),numTabs);
        treeItem.setChildren(list);
        for (InterpreteParser.StatementContext s : ctx.statement()) {
            ArrayList<TreeItem> treeVisits = (ArrayList<TreeItem>) this.visit(s);
            treeItem.getChildren().addAll(treeVisits);
        }
        numTabs--;
        return null;
    }

    @Override
    public Object visitVariableDeclSAST(InterpreteParser.VariableDeclSASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        numTabs++;
        ArrayList<TreeItem> list = new ArrayList<>();
        TreeItem ppVisit = new TreeItem(ctx.getClass().getSimpleName().replace("Context", ""), numTabs);
        ppVisit.setChildren(list);
        TreeItem ppPyCOMA = new TreeItem(ctx.PyCOMA().getText(), numTabs);

        ArrayList<TreeItem> treeVisits = (ArrayList<TreeItem>) this.visit(ctx.variableDecl());

//        ppVisit.getChildren().addAll(treeVisits);
        ArrayList<TreeItem> finalList = new ArrayList<>();
        finalList.add(ppVisit);
        finalList.add(ppPyCOMA);

        numTabs--;

        return (Object) finalList;
    }

    @Override
    public Object visitClassDeclSAST(InterpreteParser.ClassDeclSASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        numTabs++;
        ArrayList<TreeItem> list = new ArrayList<>();
        TreeItem ppVisit = new TreeItem(ctx.getClass().getSimpleName().replace("Context", ""), numTabs);
        ppVisit.setChildren(list);
        TreeItem ppPyCOMA = new TreeItem(ctx.PyCOMA().getText(), numTabs);

        ArrayList<TreeItem> treeVisits = (ArrayList<TreeItem>) this.visit(ctx.classDecl());
        ppVisit.getChildren().addAll(treeVisits);

        ArrayList<TreeItem> finalList = new ArrayList<>();
        finalList.add(ppVisit);
        finalList.add(ppPyCOMA);

        numTabs--;
        return (Object) finalList;
    }

    @Override
    public Object visitAssignSAST(InterpreteParser.AssignSASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        numTabs++;
        ArrayList<TreeItem> list = new ArrayList<>();
        TreeItem ppVisit = new TreeItem(ctx.getClass().getSimpleName().replace("Context", ""), numTabs);
        ppVisit.setChildren(list);
        TreeItem ppPyCOMA = new TreeItem(ctx.PyCOMA().getText(), numTabs);

        ArrayList<TreeItem> treeVisits = (ArrayList<TreeItem>) this.visit(ctx.assignment());
//        ppVisit.getChildren().addAll(treeVisits);

        ArrayList<TreeItem> finalList = new ArrayList<>();
        finalList.add(ppVisit);
        finalList.add(ppPyCOMA);
        numTabs--;
        return (Object) finalList;
    }

    @Override
    public Object visitArrayAssignSAST(InterpreteParser.ArrayAssignSASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        numTabs++;
        ArrayList<TreeItem> list = new ArrayList<>();
        TreeItem ppVisit = new TreeItem(ctx.getClass().getSimpleName().replace("Context", ""), numTabs);
        ppVisit.setChildren(list);
        TreeItem ppPyCOMA = new TreeItem(ctx.PyCOMA().getText(), numTabs);
        ArrayList<TreeItem> treeVisits = (ArrayList<TreeItem>) this.visit(ctx.arrayAssignment());
        ppVisit.getChildren().addAll(treeVisits);

        ArrayList<TreeItem> finalList = new ArrayList<>();
        finalList.add(ppVisit);
        finalList.add(ppPyCOMA);
        numTabs--;
        return (Object) finalList;
    }

    @Override
    public Object visitPrintSAST(InterpreteParser.PrintSASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        numTabs++;
        ArrayList<TreeItem> list = new ArrayList<>();
        TreeItem ppVisit = new TreeItem(ctx.getClass().getSimpleName().replace("Context", ""), numTabs);
        ppVisit.setChildren(list);
        TreeItem ppPyCOMA = new TreeItem(ctx.PyCOMA().getText(), numTabs);
        ArrayList<TreeItem> treeVisits = (ArrayList<TreeItem>) this.visit(ctx.printStatement());
        ppVisit.getChildren().addAll(treeVisits);

        ArrayList<TreeItem> finalList = new ArrayList<>();
        finalList.add(ppVisit);
        finalList.add(ppPyCOMA);
        numTabs--;
        return (Object) finalList;
    }

    @Override
    public Object visitIfSAST(InterpreteParser.IfSASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        numTabs++;
        ArrayList<TreeItem> list = new ArrayList<>();
        TreeItem ppVisit = new TreeItem(ctx.getClass().getSimpleName().replace("Context", ""), numTabs);
        ppVisit.setChildren(list);
        ArrayList<TreeItem> treeVisits = (ArrayList<TreeItem>) this.visit(ctx.ifStatement());
        ppVisit.getChildren().addAll(treeVisits);

        ArrayList<TreeItem> finalList = new ArrayList<>();
        finalList.add(ppVisit);
        numTabs--;
        return (Object) finalList;
    }

    @Override
    public Object visitWhileSAST(InterpreteParser.WhileSASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        numTabs++;
        ArrayList<TreeItem> list = new ArrayList<>();
        TreeItem ppVisit = new TreeItem(ctx.getClass().getSimpleName().replace("Context", ""), numTabs);
        ppVisit.setChildren(list);

;       ArrayList<TreeItem> treeVisits = (ArrayList<TreeItem>) this.visit(ctx.whileStatement());
        ppVisit.getChildren().addAll(treeVisits);

        ArrayList<TreeItem> finalList = new ArrayList<>();
        finalList.add(ppVisit);
        numTabs--;
        return (Object) finalList;
    }

    @Override
    public Object visitReturnSAST(InterpreteParser.ReturnSASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        numTabs++;
        ArrayList<TreeItem> list = new ArrayList<>();
        TreeItem ppVisit = new TreeItem(ctx.getClass().getSimpleName().replace("Context", ""), numTabs);
        ppVisit.setChildren(list);
        TreeItem ppPyCOMA = new TreeItem(ctx.PyCOMA().getText(), numTabs);
        ArrayList<TreeItem> treeVisits = (ArrayList<TreeItem>) this.visit(ctx.returnStatement());
        ppVisit.getChildren().addAll(treeVisits);
        ArrayList<TreeItem> finalList = new ArrayList<>();
        finalList.add(ppVisit);
        finalList.add(ppPyCOMA);
        numTabs--;
        return (Object) finalList;
    }

    @Override
    public Object visitFunctionDeclSAST(InterpreteParser.FunctionDeclSASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        numTabs++;
        ArrayList<TreeItem> list = new ArrayList<>();
        TreeItem ppVisit = new TreeItem(ctx.getClass().getSimpleName().replace("Context", ""), numTabs);
        ppVisit.setChildren(list);
        ArrayList<TreeItem> treeVisits = (ArrayList<TreeItem>) this.visit(ctx.functionDecl());
        ppVisit.getChildren().addAll(treeVisits);

        ArrayList<TreeItem> finalList = new ArrayList<>();
        finalList.add(ppVisit);
        numTabs--;
        return (Object) finalList;

    }

    @Override
    public Object visitBlockSAST(InterpreteParser.BlockSASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        numTabs++;
        ArrayList<TreeItem> list = new ArrayList<>();
        TreeItem ppVisit = new TreeItem(ctx.getClass().getSimpleName().replace("Context", ""), numTabs);
        ArrayList<TreeItem> treeVisits = (ArrayList<TreeItem>) this.visit(ctx.block());
        ppVisit.getChildren().addAll(treeVisits);

        ArrayList<TreeItem> finalList = new ArrayList<>();
        finalList.add(ppVisit);
        numTabs--;
        return (Object) finalList;
    }

    @Override
    public Object visitBlockAST(InterpreteParser.BlockASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        numTabs++;
        ArrayList<TreeItem> list = new ArrayList<>();
        TreeItem ppVisit = new TreeItem(ctx.getClass().getSimpleName().replace("Context", ""), numTabs);
        TreeItem ppLlaveIzq = new TreeItem(ctx.LLAVEIZQ().getText(), numTabs);
        TreeItem ppLlavaDer = new TreeItem(ctx.LLAVEDER().getText(), numTabs);
        ppVisit.setChildren(list);

        ArrayList<TreeItem> treeVisits = (ArrayList<TreeItem>) this.visit(ctx.statement(0));
        for(int i=1; i< ctx.statement().size(); i++) {
            treeVisits.addAll( (ArrayList<TreeItem>) this.visit(ctx.statement(i)));
        }

        ppVisit.getChildren().addAll(treeVisits);
        numTabs--;

        ArrayList<TreeItem> finalList = new ArrayList<>();
        finalList.add(ppLlaveIzq);
        finalList.add(ppVisit);
        finalList.add(ppLlavaDer);
        return (Object) finalList;
    }

    @Override
    public Object visitFunctionDeclAST(InterpreteParser.FunctionDeclASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        numTabs++;
        this.visit(ctx.type());
        System.out.println("ctx.formalParams() " + ctx.formalParams());
        this.visit(ctx.formalParams());
        this.visit(ctx.block());
        numTabs--;
        return null;
    }

    @Override
    public Object visitFormalParamsAST(InterpreteParser.FormalParamsASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        numTabs++;
        for (InterpreteParser.FormalParamContext s : ctx.formalParam()) {
            this.visit(s);
        }
        numTabs--;
        return null;
    }

    @Override
    public Object visitFormalParamAST(InterpreteParser.FormalParamASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        numTabs++;
        this.visit(ctx.type());
        numTabs--;
        return null;
    }

    @Override
    public Object visitWhileAST(InterpreteParser.WhileASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        numTabs++;
        this.visit(ctx.expression());
        this.visit(ctx.block());
        numTabs--;
        return null;
    }

    @Override
    public Object visitIfAST(InterpreteParser.IfASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        numTabs++;
        this.visit(ctx.expression());
        for (InterpreteParser.BlockContext s : ctx.block()) {
            this.visit(s);
        }
        numTabs--;
        return null;
    }

    @Override
    public Object visitReturnAST(InterpreteParser.ReturnASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        numTabs++;
        this.visit(ctx.expression());
        numTabs--;
        return null;
    }

    @Override
    public Object visitPrintAST(InterpreteParser.PrintASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        numTabs++;
        this.visit(ctx.expression());
        numTabs--;
        return null;
    }

    @Override
    public Object visitClassDeclAST(InterpreteParser.ClassDeclASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        numTabs++;
        for (InterpreteParser.ClassVariableDeclContext c : ctx.classVariableDecl()) {
            this.visit(c);
        }
        numTabs--;
        return null;
    }

    @Override
    public Object visitClassVariableDeclAST(InterpreteParser.ClassVariableDeclASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        numTabs++;
        this.visit(ctx.simpleType());
        this.visit(ctx.expression());
        numTabs--;
        return null;
    }

    @Override
    public Object visitVariableDeclAST(InterpreteParser.VariableDeclASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        numTabs++;
        this.visit(ctx.type());
        this.visit(ctx.expression());
        numTabs--;
        return null;
    }

    @Override
    public Object visitTypeAST(InterpreteParser.TypeASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        numTabs++;
        this.visit(ctx.simpleType());
        numTabs--;
        return null;
    }

    @Override
    public Object visitArrayTypeTAST(InterpreteParser.ArrayTypeTASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        numTabs++;
        this.visit(ctx.arrayType());
        numTabs--;
        return null;
    }

    @Override
    public Object visitIdAST(InterpreteParser.IdASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        numTabs++;
        //this.visit(ctx.singleCommand());
        numTabs--;
        return null;
    }

    @Override
    public Object visitArrayTypeAST(InterpreteParser.ArrayTypeASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        numTabs++;
        this.visit(ctx.simpleType());
        numTabs--;
        return null;
    }

    @Override
    public Object visitAssignAST(InterpreteParser.AssignASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        numTabs++;
        // Nota: Token id opcional
//        this.visit(ctx.expression());
        numTabs--;
        return null;
    }

    @Override
    public Object visitArrayAssignAST(InterpreteParser.ArrayAssignASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        numTabs++;
        // Nota: dos expression, expression pide int, ctx.depth() es int
        this.visit(ctx.expression(ctx.depth()));
        for (InterpreteParser.ExpressionContext c : ctx.expression()) {
            this.visit(c);
        }
        numTabs--;
        return null;
    }

    @Override
    public Object visitBooleanTAST(InterpreteParser.BooleanTASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        numTabs++;
        //this.visit(ctx.singleCommand());
        numTabs--;
        return null;
    }

    @Override
    public Object visitCharTAST(InterpreteParser.CharTASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        numTabs++;
        //this.visit(ctx.singleCommand());
        numTabs--;
        return null;
    }

    @Override
    public Object visitIntTAST(InterpreteParser.IntTASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        numTabs++;
        //this.visit(ctx.singleCommand());
        numTabs--;
        return null;
    }

    @Override
    public Object visitStringTAST(InterpreteParser.StringTASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        numTabs++;
        //this.visit(ctx.singleCommand());
        numTabs--;
        return null;
    }

    @Override
    public Object visitExpressionAST(InterpreteParser.ExpressionASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        numTabs++;
        visit(ctx.simpleExpression(0));
        for (int i = 1; i <= ctx.simpleExpression().toArray().length-1; i++) {
            if (ctx.relacionalop(i - 1) != null) {
                visit(ctx.relacionalop(i - 1));
                visit(ctx.simpleExpression(i));
            }
        }
        numTabs--;
        return null;
    }

    @Override
    public Object visitSimpleExpressionAST(InterpreteParser.SimpleExpressionASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        numTabs++;
        visit(ctx.term(0));
        for (int i = 1; i <= ctx.term().toArray().length - 1; i++) {
            if (ctx.additiveop(i - 1) != null) {
                visit(ctx.additiveop(i - 1));
                visit(ctx.term(i));
            }
        }
        numTabs--;
        return null;
    }

    @Override
    public Object visitTermAST(InterpreteParser.TermASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        numTabs++;
        visit(ctx.factor(0));
        for (int i = 1; i <= ctx.factor().toArray().length - 1; i++) {
            if (ctx.multiplicativeop(i - 1) != null) {
                visit(ctx.multiplicativeop(i - 1));
                visit(ctx.factor(i));
            }
        }
        numTabs--;
        return null;
    }

    @Override
    public Object visitLiteralFAST(InterpreteParser.LiteralFASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        numTabs++;

        this.visit(ctx.literal());
        numTabs--;
        return null;
    }

    @Override
    public Object visitIdFAST(InterpreteParser.IdFASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        numTabs++;
        // this.visit(ctx.id());
        numTabs--;
        return null;
    }

    @Override
    public Object visitFunctionCallFAST(InterpreteParser.FunctionCallFASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        numTabs++;
        this.visit(ctx.functionCall());
        numTabs--;
        return null;
    }

    @Override
    public Object visitArrayLookupFAST(InterpreteParser.ArrayLookupFASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        numTabs++;
        this.visit(ctx.arrayLookup());
        numTabs--;
        return null;
    }

    @Override
    public Object visitArrayLenghtFAST(InterpreteParser.ArrayLenghtFASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        numTabs++;
        this.visit(ctx.arrayLenght());
        numTabs--;
        return null;
    }

    @Override
    public Object visitSubEspressionFAST(InterpreteParser.SubEspressionFASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        numTabs++;
        this.visit(ctx.subEspression());
        numTabs--;
        return null;
    }

    @Override
    public Object visitArrayAllocationEspressionFAST(InterpreteParser.ArrayAllocationEspressionFASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        numTabs++;
        this.visit(ctx.arrayAllocationEspression());
        numTabs--;
        return null;
    }

    @Override
    public Object visitAllocationExpressionFAST(InterpreteParser.AllocationExpressionFASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        numTabs++;
        this.visit(ctx.allocationExpression());
        numTabs--;
        return null;
    }

    @Override
    public Object visitUnaryFAST(InterpreteParser.UnaryFASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        numTabs++;
        this.visit(ctx.unary());
        numTabs--;
        return null;
    }

    @Override
    public Object visitUnaryAST(InterpreteParser.UnaryASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        numTabs++;
        for (InterpreteParser.ExpressionContext s : ctx.expression()) {
            this.visit(s);
        }
        numTabs--;
        return null;
    }

    @Override
    public Object visitAllocationExpressionAST(InterpreteParser.AllocationExpressionASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        numTabs++;
        //this.visit(ctx.singleCommand());
        numTabs--;
        return null;
    }

    @Override
    public Object visitArrayAllocationEspressionAST(InterpreteParser.ArrayAllocationEspressionASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        numTabs++;
        this.visit(ctx.simpleType());
        this.visit(ctx.expression());
        numTabs--;
        return null;
    }

    @Override
    public Object visitSubEspressionAST(InterpreteParser.SubEspressionASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        numTabs++;
        this.visit(ctx.expression());
        numTabs--;
        return null;
    }

    @Override
    public Object visitFunctionCallAST(InterpreteParser.FunctionCallASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        numTabs++;
        this.visit(ctx.actualParams());
        numTabs--;
        return null;
    }

    @Override
    public Object visitActualParamsAST(InterpreteParser.ActualParamsASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        numTabs++;
        for (InterpreteParser.ExpressionContext s : ctx.expression()) {
            this.visit(s);
        }
        numTabs--;
        return null;
    }

    @Override
    public Object visitArrayLookupAST(InterpreteParser.ArrayLookupASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        numTabs++;
        this.visit(ctx.expression());
        numTabs--;
        return null;
    }

    @Override
    public Object visitArrayLenghtAST(InterpreteParser.ArrayLenghtASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        numTabs++;
        ArrayList<TreeItem> list = new ArrayList<>();
        TreeItem ppVisit = new TreeItem(ctx.getClass().getSimpleName().replace("Context", ""), numTabs);
         ppVisit.setChildren(list);
        TreeItem lenght = new TreeItem(ctx.LENGHT().getText(), numTabs);
        TreeItem id = new TreeItem(ctx.ID().getText(), numTabs);
        TreeItem punto = new TreeItem(ctx.PUNTO().getText(), numTabs);

        numTabs--;
        ArrayList<TreeItem> finalList = new ArrayList<>();
        finalList.add(ppVisit);

        return (Object) finalList;
    }

    @Override
    public Object visitMayorRAST(InterpreteParser.MayorRASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        numTabs++;

        TreeItem ppVisit = new TreeItem(ctx.getClass().getSimpleName().replace("Context", ""), numTabs);
        numTabs--;
        ArrayList<TreeItem> finalList = new ArrayList<>();
        finalList.add(ppVisit);
        return (Object) finalList;
    }

    @Override
    public Object visitMayorIgualRAST(InterpreteParser.MayorIgualRASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        numTabs++;

        TreeItem ppVisit = new TreeItem(ctx.getClass().getSimpleName().replace("Context", ""), numTabs);
        numTabs--;
        ArrayList<TreeItem> finalList = new ArrayList<>();
        finalList.add(ppVisit);
        return (Object) finalList;
    }

    @Override
    public Object visitMenorRAST(InterpreteParser.MenorRASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        numTabs++;

        TreeItem ppVisit = new TreeItem(ctx.getClass().getSimpleName().replace("Context", ""), numTabs);
        numTabs--;
        ArrayList<TreeItem> finalList = new ArrayList<>();
        finalList.add(ppVisit);
        return (Object) finalList;
    }

    @Override
    public Object visitMenorIgualRAST(InterpreteParser.MenorIgualRASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        numTabs++;

        TreeItem ppVisit = new TreeItem(ctx.getClass().getSimpleName().replace("Context", ""), numTabs);
        numTabs--;
        ArrayList<TreeItem> finalList = new ArrayList<>();
        finalList.add(ppVisit);
        return (Object) finalList;
    }

    @Override
    public Object visitEqualsRAST(InterpreteParser.EqualsRASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        numTabs++;

        TreeItem ppVisit = new TreeItem(ctx.getClass().getSimpleName().replace("Context", ""), numTabs);
        numTabs--;
        ArrayList<TreeItem> finalList = new ArrayList<>();
        finalList.add(ppVisit);
        return (Object) finalList;
    }


    @Override
    public Object visitOrRAST(InterpreteParser.OrRASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        numTabs++;

        TreeItem ppVisit = new TreeItem(ctx.getClass().getSimpleName().replace("Context", ""), numTabs);
        numTabs--;
        ArrayList<TreeItem> finalList = new ArrayList<>();
        finalList.add(ppVisit);
        return (Object) finalList;
    }

    @Override
    public Object visitOr2RAST(InterpreteParser.Or2RASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        numTabs++;

        TreeItem ppVisit = new TreeItem(ctx.getClass().getSimpleName().replace("Context", ""), numTabs);
        numTabs--;
        ArrayList<TreeItem> finalList = new ArrayList<>();
        finalList.add(ppVisit);
        return (Object) finalList;
    }

    @Override
    public Object visitAndRAST(InterpreteParser.AndRASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        numTabs++;

        TreeItem ppVisit = new TreeItem(ctx.getClass().getSimpleName().replace("Context", ""), numTabs);
        numTabs--;
        ArrayList<TreeItem> finalList = new ArrayList<>();
        finalList.add(ppVisit);
        return (Object) finalList;
    }

    @Override
    public Object visitAnd2RAST(InterpreteParser.And2RASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        numTabs++;

        TreeItem ppVisit = new TreeItem(ctx.getClass().getSimpleName().replace("Context", ""), numTabs);
        numTabs--;
        ArrayList<TreeItem> finalList = new ArrayList<>();
        finalList.add(ppVisit);
        return (Object) finalList;
    }

    @Override
    public Object visitDifRAST(InterpreteParser.DifRASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        numTabs++;

        TreeItem ppVisit = new TreeItem(ctx.getClass().getSimpleName().replace("Context", ""), numTabs);
        numTabs--;
        ArrayList<TreeItem> finalList = new ArrayList<>();
        finalList.add(ppVisit);
        return (Object) finalList;
    }

    @Override
    public Object visitSumAST(InterpreteParser.SumASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        numTabs++;

        TreeItem ppVisit = new TreeItem(ctx.getClass().getSimpleName().replace("Context", ""), numTabs);
        numTabs--;
        ArrayList<TreeItem> finalList = new ArrayList<>();
        finalList.add(ppVisit);
        return (Object) finalList;
    }

    @Override
    public Object visitResAST(InterpreteParser.ResASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        numTabs++;

        TreeItem ppVisit = new TreeItem(ctx.getClass().getSimpleName().replace("Context", ""), numTabs);
        numTabs--;
        ArrayList<TreeItem> finalList = new ArrayList<>();
        finalList.add(ppVisit);
        return (Object) finalList;
    }

    @Override
    public Object visitOrAST(InterpreteParser.OrASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        numTabs++;

        TreeItem ppVisit = new TreeItem(ctx.getClass().getSimpleName().replace("Context", ""), numTabs);
        numTabs--;
        ArrayList<TreeItem> finalList = new ArrayList<>();
        finalList.add(ppVisit);
        return (Object) finalList;
    }

    @Override
    public Object visitMulAST(InterpreteParser.MulASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        numTabs++;

        TreeItem ppVisit = new TreeItem(ctx.getClass().getSimpleName().replace("Context", ""), numTabs);
        numTabs--;
        ArrayList<TreeItem> finalList = new ArrayList<>();
        finalList.add(ppVisit);
        return (Object) finalList;
    }

    @Override
    public Object visitDivAST(InterpreteParser.DivASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        numTabs++;

        TreeItem ppVisit = new TreeItem(ctx.getClass().getSimpleName().replace("Context", ""), numTabs);
        numTabs--;
        ArrayList<TreeItem> finalList = new ArrayList<>();
        finalList.add(ppVisit);
        return (Object) finalList;
    }

    @Override
    public Object visitAndAST(InterpreteParser.AndASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        numTabs++;

        TreeItem ppVisit = new TreeItem(ctx.getClass().getSimpleName().replace("Context", ""), numTabs);
        numTabs--;
        ArrayList<TreeItem> finalList = new ArrayList<>();
        finalList.add(ppVisit);
        return (Object) finalList;
    }

    @Override
    public Object visitInLAST(InterpreteParser.InLASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        numTabs++;

        TreeItem ppVisit = new TreeItem(ctx.getClass().getSimpleName().replace("Context", ""), numTabs);
        numTabs--;
        ArrayList<TreeItem> finalList = new ArrayList<>();
        finalList.add(ppVisit);
        return (Object) finalList;
    }

    @Override
    public Object visitRealLAST(InterpreteParser.RealLASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        numTabs++;

        TreeItem ppVisit = new TreeItem(ctx.getClass().getSimpleName().replace("Context", ""), numTabs);
        numTabs--;
        ArrayList<TreeItem> finalList = new ArrayList<>();
        finalList.add(ppVisit);
        return (Object) finalList;
    }

    @Override
    public Object visitBoolLAST(InterpreteParser.BoolLASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        numTabs++;

        TreeItem ppVisit = new TreeItem(ctx.getClass().getSimpleName().replace("Context", ""), numTabs);
        numTabs--;
        ArrayList<TreeItem> finalList = new ArrayList<>();
        finalList.add(ppVisit);
        return (Object) finalList;
    }

    @Override
    public Object visitStringLAST(InterpreteParser.StringLASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        numTabs++;

        TreeItem ppVisit = new TreeItem(ctx.getClass().getSimpleName().replace("Context", ""), numTabs);
        numTabs--;
        ArrayList<TreeItem> finalList = new ArrayList<>();
        finalList.add(ppVisit);
        return (Object) finalList;

    }
}
