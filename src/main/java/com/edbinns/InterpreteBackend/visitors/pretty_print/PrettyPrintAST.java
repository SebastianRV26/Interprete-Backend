package com.edbinns.InterpreteBackend.visitors.pretty_print;

import com.edbinns.InterpreteBackend.generated.InterpreteParser;
import com.edbinns.InterpreteBackend.generated.InterpreteParserBaseVisitor;
import com.edbinns.InterpreteBackend.models.TreeItem;

import java.util.ArrayList;

public class PrettyPrintAST<Object> extends InterpreteParserBaseVisitor<Object> {
    private int numTabs = 0;
    public TreeItem treeItem;
    @Override
    public Object visitProgramAST(InterpreteParser.ProgramASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        TreeItem ppVisit = new TreeItem(ctx.getClass().getSimpleName().replace("Context", ""), numTabs);
        numTabs++;

        ArrayList<TreeItem> finalList = new ArrayList<>();

        for (int i = 0; i <= ctx.statement().toArray().length - 1; i++) {
            finalList.add((TreeItem) visit(ctx.statement(i)));
        }
        ppVisit.setChildren(finalList);
        treeItem = ppVisit;
        numTabs--;
        return null;

    }

    @Override
    public Object visitVariableDeclSAST(InterpreteParser.VariableDeclSASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        TreeItem ppVisit = new TreeItem(ctx.getClass().getSimpleName().replace("Context", ""), numTabs);
        numTabs++;

        ArrayList<TreeItem> finalList = new ArrayList<>();

        TreeItem pyComa = new TreeItem(ctx.PyCOMA().getText(), numTabs);
        TreeItem declaration = (TreeItem) this.visit(ctx.variableDecl());

        finalList.add(declaration);
        finalList.add(pyComa);
        numTabs--;
        ppVisit.setChildren(finalList);
        return (Object) ppVisit;
    }

    @Override
    public Object visitClassDeclSAST(InterpreteParser.ClassDeclSASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        TreeItem ppVisit = new TreeItem(ctx.getClass().getSimpleName().replace("Context", ""), numTabs);
        numTabs++;

        ArrayList<TreeItem> finalList = new ArrayList<>();

        TreeItem pyComa = new TreeItem(ctx.PyCOMA().getText(), numTabs);
        TreeItem classDeclaration = (TreeItem) this.visit(ctx.classDecl());

        finalList.add(classDeclaration);
        finalList.add(pyComa);
        numTabs--;
        ppVisit.setChildren(finalList);
        return (Object) ppVisit;
    }

    @Override
    public Object visitAssignSAST(InterpreteParser.AssignSASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        TreeItem ppVisit = new TreeItem(ctx.getClass().getSimpleName().replace("Context", ""), numTabs);
        numTabs++;

        ArrayList<TreeItem> finalList = new ArrayList<>();

        TreeItem pyComa = new TreeItem(ctx.PyCOMA().getText(), numTabs);
        TreeItem assign = (TreeItem) this.visit(ctx.assignment());

        finalList.add(assign);
        finalList.add(pyComa);
        numTabs--;
        ppVisit.setChildren(finalList);
        return (Object) ppVisit;
    }

    @Override
    public Object visitArrayAssignSAST(InterpreteParser.ArrayAssignSASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        TreeItem ppVisit = new TreeItem(ctx.getClass().getSimpleName().replace("Context", ""), numTabs);
        numTabs++;

        ArrayList<TreeItem> finalList = new ArrayList<>();

        TreeItem pyComa = new TreeItem(ctx.PyCOMA().getText(), numTabs);
        TreeItem arrayAssign = (TreeItem) this.visit(ctx.arrayAssignment());

        finalList.add(arrayAssign);
        finalList.add(pyComa);
        numTabs--;
        ppVisit.setChildren(finalList);
        return (Object) ppVisit;
    }

    @Override
    public Object visitPrintSAST(InterpreteParser.PrintSASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        TreeItem ppVisit = new TreeItem(ctx.getClass().getSimpleName().replace("Context", ""), numTabs);
        numTabs++;

        ArrayList<TreeItem> finalList = new ArrayList<>();

        TreeItem pyComa = new TreeItem(ctx.PyCOMA().getText(), numTabs);
        TreeItem print = (TreeItem) this.visit(ctx.printStatement());

        finalList.add(print);
        finalList.add(pyComa);
        numTabs--;
        ppVisit.setChildren(finalList);
        return (Object) ppVisit;
    }

    @Override
    public Object visitIfSAST(InterpreteParser.IfSASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        TreeItem ppVisit = new TreeItem(ctx.getClass().getSimpleName().replace("Context", ""), numTabs);
        numTabs++;

        ArrayList<TreeItem> finalList = new ArrayList<>();

        TreeItem visit = (TreeItem) this.visit(ctx.ifStatement());
        finalList.add(visit);

        numTabs--;
        ppVisit.setChildren(finalList);
        return (Object) ppVisit;
    }

    @Override
    public Object visitWhileSAST(InterpreteParser.WhileSASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        TreeItem ppVisit = new TreeItem(ctx.getClass().getSimpleName().replace("Context", ""), numTabs);
        numTabs++;

        ArrayList<TreeItem> finalList = new ArrayList<>();

        TreeItem visit = (TreeItem) this.visit(ctx.whileStatement());
        finalList.add(visit);

        numTabs--;
        ppVisit.setChildren(finalList);
        return (Object) ppVisit;
    }

    @Override
    public Object visitReturnSAST(InterpreteParser.ReturnSASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        TreeItem ppVisit = new TreeItem(ctx.getClass().getSimpleName().replace("Context", ""), numTabs);
        numTabs++;

        ArrayList<TreeItem> finalList = new ArrayList<>();

        TreeItem pyComa = new TreeItem(ctx.PyCOMA().getText(), numTabs);
        TreeItem returnStatement = (TreeItem) this.visit(ctx.returnStatement());

        finalList.add(returnStatement);
        finalList.add(pyComa);
        numTabs--;
        ppVisit.setChildren(finalList);
        return (Object) ppVisit;
    }

    @Override
    public Object visitFunctionDeclSAST(InterpreteParser.FunctionDeclSASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        TreeItem ppVisit = new TreeItem(ctx.getClass().getSimpleName().replace("Context", ""), numTabs);
        numTabs++;

        ArrayList<TreeItem> finalList = new ArrayList<>();

        TreeItem functionDecl = (TreeItem) this.visit(ctx.functionDecl());
        finalList.add(functionDecl);

        numTabs--;
        ppVisit.setChildren(finalList);
        return (Object) ppVisit;

    }

    @Override
    public Object visitBlockSAST(InterpreteParser.BlockSASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        TreeItem ppVisit = new TreeItem(ctx.getClass().getSimpleName().replace("Context", ""), numTabs);
        numTabs++;

        ArrayList<TreeItem> finalList = new ArrayList<>();

        TreeItem block = (TreeItem) this.visit(ctx.block());
        finalList.add(block);

        numTabs--;
        ppVisit.setChildren(finalList);
        return (Object) ppVisit;
    }

    @Override
    public Object visitBlockAST(InterpreteParser.BlockASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        TreeItem ppVisit = new TreeItem(ctx.getClass().getSimpleName().replace("Context", ""), numTabs);

        numTabs++;
        ArrayList<TreeItem> finalList = new ArrayList<>();
        TreeItem ppLlaveIzq = new TreeItem(ctx.LLAVEIZQ().getText(), numTabs);
        TreeItem ppLlavaDer = new TreeItem(ctx.LLAVEDER().getText(), numTabs);

        finalList.add(ppLlaveIzq);
        for (int i = 0; i < ctx.statement().size(); i++) {
            TreeItem statements = (TreeItem) this.visit(ctx.statement(i));
            finalList.add(statements);
        }
        finalList.add(ppLlavaDer);

        numTabs--;

        ppVisit.setChildren(finalList);
        return (Object) ppVisit;
    }

    @Override
    public Object visitFunctionDeclAST(InterpreteParser.FunctionDeclASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        TreeItem ppVisit = new TreeItem(ctx.getClass().getSimpleName().replace("Context", ""), numTabs);
        numTabs++;
        ArrayList<TreeItem> finalList = new ArrayList<>();
        TreeItem type = (TreeItem) this.visit(ctx.type());
        TreeItem id = new TreeItem(ctx.ID().getText(),numTabs);
        TreeItem parentesisIZQ = new TreeItem(ctx.PARENTESISIZQ().getText(),numTabs);
        finalList.add(type);
        finalList.add(id);
        finalList.add(parentesisIZQ);
        if(ctx.formalParams() != null){
            TreeItem formalParams = (TreeItem) this.visit(ctx.formalParams());
            finalList.add(formalParams);
        }
        TreeItem parentesisDER = new TreeItem(ctx.PARENTESISDER().getText(),numTabs);
        TreeItem block = (TreeItem)  this.visit(ctx.block());
        finalList.add(parentesisDER);
        finalList.add(block);

        numTabs--;
        ppVisit.setChildren(finalList);
        return (Object) ppVisit;
    }

    @Override
    public Object visitFormalParamsAST(InterpreteParser.FormalParamsASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        TreeItem ppVisit = new TreeItem(ctx.getClass().getSimpleName().replace("Context", ""), numTabs);
        numTabs++;
        ArrayList<TreeItem> finalList = new ArrayList<>();
        TreeItem formalParam = (TreeItem) this.visit(ctx.formalParam(0));
        finalList.add(formalParam);
        for (int i = 1; i <= ctx.formalParam().toArray().length - 1; i++) {
            if (ctx.COMA(i - 1) != null) {
                TreeItem coma = (TreeItem)  visit(ctx.COMA(i - 1));
                TreeItem formalParams = (TreeItem)  visit(ctx.formalParam(i));
                finalList.add(coma);
                finalList.add(formalParams);
            }
        }
        numTabs--;
        ppVisit.setChildren(finalList);
        return (Object) ppVisit;
    }

    @Override
    public Object visitFormalParamAST(InterpreteParser.FormalParamASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        TreeItem ppVisit = new TreeItem(ctx.getClass().getSimpleName().replace("Context", ""), numTabs);
        numTabs++;

        TreeItem type = (TreeItem) this.visit(ctx.type());
        TreeItem id = new TreeItem(ctx.ID().getText(),numTabs);
        ArrayList<TreeItem> finalList = new ArrayList<>();
        finalList.add(type);
        finalList.add(id);
        numTabs--;
        ppVisit.setChildren(finalList);
        return (Object) ppVisit;
    }

    @Override
    public Object visitWhileAST(InterpreteParser.WhileASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        TreeItem ppVisit = new TreeItem(ctx.getClass().getSimpleName().replace("Context", ""), numTabs);
        numTabs++;


        ArrayList<TreeItem> finalList = new ArrayList<>();

        TreeItem visitWhile = new TreeItem(ctx.WHILE().getText(), numTabs);
        TreeItem parentesisIZQ = new TreeItem(ctx.PARENTESISIZQ().getText(), numTabs);
        TreeItem expression = (TreeItem) this.visit(ctx.expression());
        TreeItem parentesisDER = new TreeItem(ctx.PARENTESISDER().getText(), numTabs);
        TreeItem block = (TreeItem) this.visit(ctx.block());
        finalList.add(visitWhile);
        finalList.add(parentesisIZQ);
        finalList.add(expression);
        finalList.add(parentesisDER);
        finalList.add(block);


        numTabs--;
        ppVisit.setChildren(finalList);
        return (Object) ppVisit;
    }

    @Override
    public Object visitIfAST(InterpreteParser.IfASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        TreeItem ppVisit = new TreeItem(ctx.getClass().getSimpleName().replace("Context", ""), numTabs);
        numTabs++;


        ArrayList<TreeItem> finalList = new ArrayList<>();
        TreeItem visitIF = new TreeItem(ctx.IF().getText(), numTabs);
        TreeItem parentesisIZQ = new TreeItem(ctx.PARENTESISIZQ().getText(), numTabs);
        TreeItem expression = (TreeItem) this.visit(ctx.expression());
        TreeItem parentesisDER = new TreeItem(ctx.PARENTESISDER().getText(), numTabs);
        TreeItem ifBlock = (TreeItem) this.visit(ctx.block(0));
        finalList.add(visitIF);
        finalList.add(parentesisIZQ);
        finalList.add(expression);
        finalList.add(parentesisDER);
        finalList.add(ifBlock);
        if((ctx.ELSE() != null ) && (ctx.block(1) != null)){
            TreeItem elseVisit = new TreeItem(ctx.ELSE().getText(), numTabs);
            TreeItem elseBlock = (TreeItem) this.visit(ctx.block(1));
            finalList.add(elseVisit);
            finalList.add(elseBlock);
        }

        numTabs--;
        ppVisit.setChildren(finalList);
        return (Object) ppVisit;
    }

    @Override
    public Object visitReturnAST(InterpreteParser.ReturnASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        TreeItem ppVisit = new TreeItem(ctx.getClass().getSimpleName().replace("Context", ""), numTabs);
        numTabs++;

        ArrayList<TreeItem> finalList = new ArrayList<>();
        TreeItem returnVisit = new TreeItem(ctx.RETURN().getText(),numTabs);
        TreeItem expression = (TreeItem) this.visit(ctx.expression());
        finalList.add(returnVisit);
        finalList.add(expression);
        numTabs--;
        ppVisit.setChildren(finalList);
        return (Object) ppVisit;
    }

    @Override
    public Object visitPrintAST(InterpreteParser.PrintASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        TreeItem ppVisit = new TreeItem(ctx.getClass().getSimpleName().replace("Context", ""), numTabs);
        numTabs++;

        ArrayList<TreeItem> finalList = new ArrayList<>();
        TreeItem print = new TreeItem(ctx.PRINT().getText(),numTabs);
        TreeItem expression = (TreeItem) this.visit(ctx.expression());
        finalList.add(print);
        finalList.add(expression);
        numTabs--;
        ppVisit.setChildren(finalList);
        return (Object) ppVisit;
    }

    @Override
    public Object visitClassDeclAST(InterpreteParser.ClassDeclASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        TreeItem ppVisit = new TreeItem(ctx.getClass().getSimpleName().replace("Context", ""), numTabs);
        numTabs++;

        ArrayList<TreeItem> finalList = new ArrayList<>();
        TreeItem classVisit = new TreeItem(ctx.CLASS().getText(),numTabs );
        TreeItem ID = new TreeItem(ctx.ID().getText(),numTabs );
        TreeItem llaveIZQ = new TreeItem(ctx.LLAVEIZQ().getText(),numTabs );
        finalList.add(classVisit);
        finalList.add(ID);
        finalList.add(llaveIZQ);
        for (int i = 0; i <= ctx.classVariableDecl().toArray().length - 1; i++) {
            TreeItem visitSimpleExpression = (TreeItem) visit(ctx.classVariableDecl(i));
            finalList.add(visitSimpleExpression);
        }
        TreeItem llaveDER = new TreeItem(ctx.LLAVEDER().getText(),numTabs );
        finalList.add(llaveDER);
        numTabs--;
        ppVisit.setChildren(finalList);
        return (Object) ppVisit;
    }

    @Override
    public Object visitClassVariableDeclAST(InterpreteParser.ClassVariableDeclASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        TreeItem ppVisit = new TreeItem(ctx.getClass().getSimpleName().replace("Context", ""), numTabs);
        numTabs++;
        ArrayList<TreeItem> finalList = new ArrayList<>();
        TreeItem type = (TreeItem)    this.visit(ctx.simpleType());
        TreeItem ID = new TreeItem(ctx.ID().getText(),numTabs);
        finalList.add(type);
        finalList.add(ID);
        if((ctx.ASYGN() != null) && (ctx.expression() != null)){
            TreeItem asygn  = new TreeItem(ctx.ASYGN().getText(),numTabs);
            finalList.add(asygn);
            TreeItem expression = (TreeItem)    this.visit(ctx.expression());
            finalList.add(expression);
        }
        numTabs--;
        ppVisit.setChildren(finalList);

        return (Object) ppVisit;
    }

    @Override
    public Object visitVariableDeclAST(InterpreteParser.VariableDeclASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        TreeItem ppVisit = new TreeItem(ctx.getClass().getSimpleName().replace("Context", ""), numTabs);
        numTabs++;
        ArrayList<TreeItem> finalList = new ArrayList<>();
        TreeItem type = (TreeItem)    this.visit(ctx.type());
        TreeItem ID = new TreeItem(ctx.ID().getText(),numTabs);
        finalList.add(type);
        finalList.add(ID);
        if((ctx.ASYGN() != null) && (ctx.expression() != null)){
            TreeItem asygn  = new TreeItem(ctx.ASYGN().getText(),numTabs);
            finalList.add(asygn);
            TreeItem expression = (TreeItem)    this.visit(ctx.expression());
            finalList.add(expression);
        }
        numTabs--;
        ppVisit.setChildren(finalList);

        return (Object) ppVisit;
    }

    @Override
    public Object visitTypeAST(InterpreteParser.TypeASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        TreeItem ppVisit = new TreeItem(ctx.getClass().getSimpleName().replace("Context", ""), numTabs);
        numTabs++;
        TreeItem visit = (TreeItem)    this.visit(ctx.simpleType());
        numTabs--;
        ArrayList<TreeItem> finalList = new ArrayList<>();
        finalList.add(visit);
        ppVisit.setChildren(finalList);

        return (Object) ppVisit;
    }

    @Override
    public Object visitArrayTypeTAST(InterpreteParser.ArrayTypeTASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        TreeItem ppVisit = new TreeItem(ctx.getClass().getSimpleName().replace("Context", ""), numTabs);
        numTabs++;
        TreeItem visit = (TreeItem)    this.visit(ctx.arrayType());
        numTabs--;
        ArrayList<TreeItem> finalList = new ArrayList<>();
        finalList.add(visit);
        ppVisit.setChildren(finalList);

        return (Object) ppVisit;
    }

    @Override
    public Object visitIdAST(InterpreteParser.IdASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        TreeItem ppVisit = new TreeItem(ctx.getClass().getSimpleName().replace("Context", ""), numTabs);
        numTabs++;
        TreeItem text = new TreeItem(ctx.ID().getText(), numTabs);
        numTabs--;
        ArrayList<TreeItem> finalList = new ArrayList<>();
        finalList.add(text);
        ppVisit.setChildren(finalList);

        return (Object) ppVisit;
    }

    @Override
    public Object visitArrayTypeAST(InterpreteParser.ArrayTypeASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        TreeItem ppVisit = new TreeItem(ctx.getClass().getSimpleName().replace("Context", ""), numTabs);
        numTabs++;
        TreeItem simpleType = (TreeItem) this.visit(ctx.simpleType());
        TreeItem bracketIZQ = new TreeItem(ctx.BRACKETIZQ().getText(),numTabs);
        TreeItem bracketDER = new TreeItem(ctx.BRACKE5TDER().getText(),numTabs);
        ArrayList<TreeItem> finalList = new ArrayList<>();
        finalList.add(simpleType);
        finalList.add(bracketIZQ);
        finalList.add(bracketDER);
        numTabs--;
        ppVisit.setChildren(finalList);
        return (Object) ppVisit;
    }

    @Override
    public Object visitAssignAST(InterpreteParser.AssignASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        TreeItem ppVisit = new TreeItem(ctx.getClass().getSimpleName().replace("Context", ""), numTabs);
        numTabs++;
        TreeItem firstID = new TreeItem(ctx.ID(0).getText(),numTabs);
        ArrayList<TreeItem> finalList = new ArrayList<>();
        finalList.add(firstID);

        if((ctx.PUNTO() != null) && (ctx.ID(1) != null)){
            TreeItem punto = new TreeItem(ctx.PUNTO().getText(),numTabs);
            TreeItem nextID = new TreeItem(ctx.ID(1).getText(),numTabs);
            finalList.add(punto);
            finalList.add(nextID);
        }
        TreeItem asygn  = new TreeItem(ctx.ASYGN().getText(),numTabs);
        TreeItem visit = (TreeItem) visit(ctx.expression());
        finalList.add(asygn);
        finalList.add(visit);
        numTabs--;
        ppVisit.setChildren(finalList);
        return (Object) ppVisit;
    }

    @Override
    public Object visitArrayAssignAST(InterpreteParser.ArrayAssignASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        TreeItem ppVisit = new TreeItem(ctx.getClass().getSimpleName().replace("Context", ""), numTabs);
        numTabs++;
        TreeItem id = new TreeItem(ctx.ID().getText(),numTabs);
        TreeItem bracketIZQ  = new TreeItem(ctx.BRACKETIZQ().getText(),numTabs);
        TreeItem visit = (TreeItem) visit(ctx.expression(0));
        TreeItem bracketDER  = new TreeItem(ctx.BRACKE5TDER().getText(),numTabs);
        TreeItem asygn  = new TreeItem(ctx.ASYGN().getText(),numTabs);
        ArrayList<TreeItem> finalList = new ArrayList<>();
        finalList.add(id);
        finalList.add(bracketIZQ);
        finalList.add(visit);
        finalList.add(bracketDER);
        finalList.add(asygn);
        if(ctx.expression(1) != null){
            TreeItem secondExpression = (TreeItem) visit(ctx.expression(1));
            finalList.add(secondExpression);
        }
        numTabs--;
        ppVisit.setChildren(finalList);
        return (Object) ppVisit;
    }

    @Override
    public Object visitBooleanTAST(InterpreteParser.BooleanTASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        TreeItem ppVisit = new TreeItem(ctx.getClass().getSimpleName().replace("Context", ""), numTabs);
        numTabs++;
        TreeItem text = new TreeItem(ctx.BOOLEAN().getText(), numTabs);
        numTabs--;
        ArrayList<TreeItem> finalList = new ArrayList<>();
        finalList.add(text);
        ppVisit.setChildren(finalList);

        return (Object) ppVisit;
    }

    @Override
    public Object visitCharTAST(InterpreteParser.CharTASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        TreeItem ppVisit = new TreeItem(ctx.getClass().getSimpleName().replace("Context", ""), numTabs);
        numTabs++;
        TreeItem text = new TreeItem(ctx.CHAR().getText(), numTabs);
        numTabs--;
        ArrayList<TreeItem> finalList = new ArrayList<>();
        finalList.add(text);
        ppVisit.setChildren(finalList);

        return (Object) ppVisit;
    }

    @Override
    public Object visitIntTAST(InterpreteParser.IntTASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        TreeItem ppVisit = new TreeItem(ctx.getClass().getSimpleName().replace("Context", ""), numTabs);
        numTabs++;
        TreeItem text = new TreeItem(ctx.INT().getText(), numTabs);
        numTabs--;
        ArrayList<TreeItem> finalList = new ArrayList<>();
        finalList.add(text);
        ppVisit.setChildren(finalList);

        return (Object) ppVisit;
    }

    @Override
    public Object visitStringTAST(InterpreteParser.StringTASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        TreeItem ppVisit = new TreeItem(ctx.getClass().getSimpleName().replace("Context", ""), numTabs);
        numTabs++;
        TreeItem text = new TreeItem(ctx.STRING().getText(), numTabs);
        numTabs--;
        ArrayList<TreeItem> finalList = new ArrayList<>();
        finalList.add(text);
        ppVisit.setChildren(finalList);

        return (Object) ppVisit;
    }

    @Override
    public Object visitExpressionAST(InterpreteParser.ExpressionASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        TreeItem ppVisit = new TreeItem(ctx.getClass().getSimpleName().replace("Context", ""), numTabs);
        numTabs++;
        TreeItem visit = (TreeItem) visit(ctx.simpleExpression(0));
        ArrayList<TreeItem> finalList = new ArrayList<>();
        finalList.add(visit);
        for (int i = 1; i <= ctx.simpleExpression().toArray().length - 1; i++) {
            if (ctx.relacionalop(i - 1) != null) {
                TreeItem visitRelacionalOP = (TreeItem)  visit(ctx.relacionalop(i - 1));
                TreeItem visitSimpleExpression = (TreeItem)  visit(ctx.simpleExpression(i));
                finalList.add(visitRelacionalOP);
                finalList.add(visitSimpleExpression);
            }
        }
        numTabs--;
        ppVisit.setChildren(finalList);
        return (Object) ppVisit;
    }

    @Override
    public Object visitSimpleExpressionAST(InterpreteParser.SimpleExpressionASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        TreeItem ppVisit = new TreeItem(ctx.getClass().getSimpleName().replace("Context", ""), numTabs);
        numTabs++;
        TreeItem visitTerm = (TreeItem) visit(ctx.term(0));
        ArrayList<TreeItem> finalList = new ArrayList<>();
        finalList.add(visitTerm);
        for (int i = 1; i <= ctx.term().toArray().length - 1; i++) {
            if (ctx.additiveop(i - 1) != null) {
                TreeItem visitAdditiveOP = (TreeItem)  visit(ctx.additiveop(i - 1));
                TreeItem visitNextTerm = (TreeItem)  visit(ctx.term(i));
                finalList.add(visitAdditiveOP);
                finalList.add(visitNextTerm);
            }
        }
        numTabs--;
        ppVisit.setChildren(finalList);
        return (Object) ppVisit;
    }

    @Override
    public Object visitTermAST(InterpreteParser.TermASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        TreeItem ppVisit = new TreeItem(ctx.getClass().getSimpleName().replace("Context", ""), numTabs);
        numTabs++;
        TreeItem visitFactor = (TreeItem) visit(ctx.factor(0));
        ArrayList<TreeItem> finalList = new ArrayList<>();
        finalList.add(visitFactor);
        for (int i = 1; i <= ctx.factor().toArray().length - 1; i++) {
            if (ctx.multiplicativeop(i - 1) != null) {
                TreeItem visitMultiplicativeOP = (TreeItem)  visit(ctx.multiplicativeop(i - 1));
                TreeItem visitNextFactor = (TreeItem)  visit(ctx.factor(i));
                finalList.add(visitMultiplicativeOP);
                finalList.add(visitNextFactor);
            }
        }
        numTabs--;
        ppVisit.setChildren(finalList);
        return (Object) ppVisit;
    }

    @Override
    public Object visitLiteralFAST(InterpreteParser.LiteralFASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        TreeItem ppVisit = new TreeItem(ctx.getClass().getSimpleName().replace("Context", ""), numTabs);
        numTabs++;
        TreeItem visit = (TreeItem) this.visit(ctx.literal());
        numTabs--;
        ArrayList<TreeItem> finalList = new ArrayList<>();
        finalList.add(visit);
        ppVisit.setChildren(finalList);
        return (Object) ppVisit;
    }

    @Override
    public Object visitIdFAST(InterpreteParser.IdFASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        TreeItem ppVisit = new TreeItem(ctx.getClass().getSimpleName().replace("Context", ""), numTabs);
        numTabs++;
        TreeItem firstID = new TreeItem(ctx.ID(0).getText(),numTabs);
        ArrayList<TreeItem> finalList = new ArrayList<>();
        finalList.add(firstID);

        if((ctx.PUNTO() != null) && (ctx.ID(1) != null)){
            TreeItem punto = new TreeItem(ctx.PUNTO().getText(),numTabs);
            TreeItem nextID = new TreeItem(ctx.ID(1).getText(),numTabs);
            finalList.add(punto);
            finalList.add(nextID);
        }
        numTabs--;
        ppVisit.setChildren(finalList);
        return (Object) ppVisit;
    }

    @Override
    public Object visitFunctionCallFAST(InterpreteParser.FunctionCallFASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        TreeItem ppVisit = new TreeItem(ctx.getClass().getSimpleName().replace("Context", ""), numTabs);
        numTabs++;
        TreeItem visit = (TreeItem) this.visit(ctx.functionCall());
        numTabs--;
        ArrayList<TreeItem> finalList = new ArrayList<>();
        finalList.add(visit);
        ppVisit.setChildren(finalList);
        return (Object) ppVisit;
    }

    @Override
    public Object visitArrayLookupFAST(InterpreteParser.ArrayLookupFASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        TreeItem ppVisit = new TreeItem(ctx.getClass().getSimpleName().replace("Context", ""), numTabs);
        numTabs++;
        TreeItem visit = (TreeItem) this.visit(ctx.arrayLookup());
        numTabs--;
        ArrayList<TreeItem> finalList = new ArrayList<>();
        finalList.add(visit);
        ppVisit.setChildren(finalList);
        return (Object) ppVisit;
    }

    @Override
    public Object visitArrayLenghtFAST(InterpreteParser.ArrayLenghtFASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        TreeItem ppVisit = new TreeItem(ctx.getClass().getSimpleName().replace("Context", ""), numTabs);
        numTabs++;
        TreeItem visit = (TreeItem) this.visit(ctx.arrayLenght());
        numTabs--;
        ArrayList<TreeItem> finalList = new ArrayList<>();
        finalList.add(visit);
        ppVisit.setChildren(finalList);
        return (Object) ppVisit;
    }

    @Override
    public Object visitSubEspressionFAST(InterpreteParser.SubEspressionFASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        TreeItem ppVisit = new TreeItem(ctx.getClass().getSimpleName().replace("Context", ""), numTabs);
        numTabs++;
        TreeItem visit = (TreeItem) this.visit(ctx.subEspression());
        numTabs--;
        ArrayList<TreeItem> finalList = new ArrayList<>();
        finalList.add(visit);
        ppVisit.setChildren(finalList);
        return (Object) ppVisit;
    }

    @Override
    public Object visitArrayAllocationEspressionFAST(InterpreteParser.ArrayAllocationEspressionFASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        TreeItem ppVisit = new TreeItem(ctx.getClass().getSimpleName().replace("Context", ""), numTabs);
        numTabs++;
        TreeItem visit = (TreeItem) this.visit(ctx.arrayAllocationEspression());
        numTabs--;
        ArrayList<TreeItem> finalList = new ArrayList<>();
        finalList.add(visit);
        ppVisit.setChildren(finalList);
        return (Object) ppVisit;
    }

    @Override
    public Object visitAllocationExpressionFAST(InterpreteParser.AllocationExpressionFASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        TreeItem ppVisit = new TreeItem(ctx.getClass().getSimpleName().replace("Context", ""), numTabs);
        numTabs++;
        TreeItem visit = (TreeItem) this.visit(ctx.allocationExpression());
        numTabs--;
        ArrayList<TreeItem> finalList = new ArrayList<>();
        finalList.add(visit);
        ppVisit.setChildren(finalList);
        return (Object) ppVisit;
    }

    @Override
    public Object visitUnaryFAST(InterpreteParser.UnaryFASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        TreeItem ppVisit = new TreeItem(ctx.getClass().getSimpleName().replace("Context", ""), numTabs);
        numTabs++;

        TreeItem visitUnary = (TreeItem) this.visit(ctx.unary());
        numTabs--;
        ArrayList<TreeItem> finalList = new ArrayList<>();
        finalList.add(visitUnary);
        ppVisit.setChildren(finalList);
        return (Object) ppVisit;
    }

    @Override
    public Object visitUnaryAST(InterpreteParser.UnaryASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        TreeItem ppVisit = new TreeItem(ctx.getClass().getSimpleName().replace("Context", ""), numTabs);
        numTabs++;
        ArrayList<TreeItem> finalList = new ArrayList<>();
        if(ctx.SUM() != null){
            TreeItem sum = new TreeItem(ctx.SUM().getText(),numTabs);
            finalList.add(sum);
        }
        if(ctx.RES() != null){
            TreeItem res = new TreeItem(ctx.RES().getText(),numTabs);
            finalList.add(res);
        }
        if(ctx.ADMIRACION() != null){
            TreeItem admiracion = new TreeItem(ctx.ADMIRACION().getText(),numTabs);
            finalList.add(admiracion);
        }

        for (int i = 0; i <= ctx.expression().toArray().length - 1; i++) {
            finalList.add((TreeItem) visit(ctx.expression(i)));
        }
        numTabs--;
        ppVisit.setChildren(finalList);
        return (Object)  ppVisit;
    }

    @Override
    public Object visitAllocationExpressionAST(InterpreteParser.AllocationExpressionASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        TreeItem ppVisit = new TreeItem(ctx.getClass().getSimpleName().replace("Context", ""), numTabs);
        numTabs++;
        TreeItem visitNew = new TreeItem(ctx.NEW().getText(), numTabs);
        TreeItem id = new TreeItem(ctx.ID().getText(), numTabs);
        TreeItem parentesisIZQ = new TreeItem(ctx.PARENTESISIZQ().getText(),numTabs);
        TreeItem parentesisDER = new TreeItem(ctx.PARENTESISDER().getText(),numTabs);
        numTabs--;
        ArrayList<TreeItem> finalList = new ArrayList<>();

        finalList.add(visitNew);
        finalList.add(id);
        finalList.add(parentesisIZQ);
        finalList.add(parentesisDER);
        ppVisit.setChildren(finalList);

        return (Object)  ppVisit;
    }

    @Override
    public Object visitArrayAllocationEspressionAST(InterpreteParser.ArrayAllocationEspressionASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));

        TreeItem ppVisit = new TreeItem(ctx.getClass().getSimpleName().replace("Context", ""), numTabs);
        numTabs++;
        TreeItem visitNew = new TreeItem(ctx.NEW().getText(), numTabs);
        TreeItem visitSimpleType = (TreeItem) this.visit(ctx.simpleType());
        TreeItem bracketIZQ = new TreeItem(ctx.BRACKETIZQ().getText(), numTabs);
        TreeItem visitEspresion = (TreeItem) this.visit(ctx.expression());
        TreeItem bracketDER = new TreeItem(ctx.BRACKE5TDER().getText(), numTabs);


        numTabs--;
        ArrayList<TreeItem> finalList = new ArrayList<>();
        finalList.add(visitNew);
        finalList.add(visitSimpleType);
        finalList.add(bracketIZQ);
        finalList.add(visitEspresion);
        finalList.add(bracketDER);
        ppVisit.setChildren(finalList);
        return (Object) ppVisit;
    }

    @Override
    public Object visitSubEspressionAST(InterpreteParser.SubEspressionASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        TreeItem ppVisit = new TreeItem(ctx.getClass().getSimpleName().replace("Context", ""), numTabs);
        numTabs++;
        TreeItem parentesisIZQ = new TreeItem(ctx.PARENTESISIZQ().getText(),numTabs);
        TreeItem visitExpression = (TreeItem) this.visit(ctx.expression());
        TreeItem parentesisDER = new TreeItem(ctx.PARENTESISDER().getText(),numTabs);
        numTabs--;
        ArrayList<TreeItem> finalList = new ArrayList<>();

        finalList.add(parentesisIZQ);
        finalList.add(visitExpression);
        finalList.add(parentesisDER);
        ppVisit.setChildren(finalList);

        return (Object)  ppVisit;
    }

    @Override
    public Object visitFunctionCallAST(InterpreteParser.FunctionCallASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        TreeItem ppVisit = new TreeItem(ctx.getClass().getSimpleName().replace("Context", ""), numTabs);
        TreeItem visitActualParams = null;
        numTabs++;
        TreeItem id = new TreeItem(ctx.ID().getText(),numTabs);
        TreeItem parentesisIZQ = new TreeItem(ctx.PARENTESISIZQ().getText(),numTabs);
        if(ctx.actualParams() != null){
            visitActualParams = (TreeItem) this.visit(ctx.actualParams());
        }
        TreeItem parentesisDER = new TreeItem(ctx.PARENTESISDER().getText(),numTabs);
        numTabs--;
        ArrayList<TreeItem> finalList = new ArrayList<>();
        finalList.add(id);
        finalList.add(parentesisIZQ);
        if(visitActualParams != null){
            finalList.add(visitActualParams);
        }
        finalList.add(parentesisDER);
        ppVisit.setChildren(finalList);
        return (Object)  ppVisit;
    }

    @Override
    public Object visitActualParamsAST(InterpreteParser.ActualParamsASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        TreeItem ppVisit = new TreeItem(ctx.getClass().getSimpleName().replace("Context", ""), numTabs);
        numTabs++;
        TreeItem visitFirstExpression = (TreeItem) visit(ctx.expression(0));
        ArrayList<TreeItem> finalList = new ArrayList<>();
        finalList.add(visitFirstExpression);

        for (int i = 1; i <= ctx.expression().toArray().length - 1; i++) {
            if (ctx.COMA(i - 1) != null) {
                TreeItem coma = new TreeItem(ctx.COMA(i-1).getText(), numTabs);
                finalList.add(coma);
                finalList.add((TreeItem) visit(ctx.expression(i)));
            }
        }
        numTabs--;
        ppVisit.setChildren(finalList);
        return (Object)  ppVisit;
    }

    @Override
    public Object visitArrayLookupAST(InterpreteParser.ArrayLookupASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));

        TreeItem ppVisit = new TreeItem(ctx.getClass().getSimpleName().replace("Context", ""), numTabs);
        numTabs++;
        TreeItem id = new TreeItem(ctx.ID().getText(), numTabs);
        TreeItem bracketIZQ = new TreeItem(ctx.BRACKETIZQ().getText(), numTabs);
        TreeItem visitEspresion = (TreeItem) this.visit(ctx.expression());
        TreeItem bracketDER = new TreeItem(ctx.BRACKE5TDER().getText(), numTabs);
        numTabs--;
        ArrayList<TreeItem> finalList = new ArrayList<>();
        finalList.add(id);
        finalList.add(bracketIZQ);
        finalList.add(visitEspresion);
        finalList.add(bracketDER);
        ppVisit.setChildren(finalList);
        return (Object) ppVisit;
    }

    @Override
    public Object visitArrayLenghtAST(InterpreteParser.ArrayLenghtASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        TreeItem ppVisit = new TreeItem(ctx.getClass().getSimpleName().replace("Context", ""), numTabs);
        numTabs++;
        TreeItem lenght = new TreeItem(ctx.LENGHT().getText(), numTabs);
        TreeItem id = new TreeItem(ctx.ID().getText(), numTabs);
        TreeItem punto = new TreeItem(ctx.PUNTO().getText(), numTabs);
        numTabs--;
        ArrayList<TreeItem> finalList = new ArrayList<>();
        finalList.add(id);
        finalList.add(punto);
        finalList.add(lenght);
        ppVisit.setChildren(finalList);
        return (Object) ppVisit;
    }

    @Override
    public Object visitMayorRAST(InterpreteParser.MayorRASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        TreeItem ppVisit = new TreeItem(ctx.getClass().getSimpleName().replace("Context", ""), numTabs);
        numTabs++;
        TreeItem text = new TreeItem(ctx.MAYOR().getText(), numTabs);
        numTabs--;
        ArrayList<TreeItem> finalList = new ArrayList<>();
        finalList.add(text);
        ppVisit.setChildren(finalList);

        return (Object) ppVisit;
    }

    @Override
    public Object visitMayorIgualRAST(InterpreteParser.MayorIgualRASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        TreeItem ppVisit = new TreeItem(ctx.getClass().getSimpleName().replace("Context", ""), numTabs);
        numTabs++;
        TreeItem text = new TreeItem(ctx.MAYORIGUAL().getText(), numTabs);
        numTabs--;
        ArrayList<TreeItem> finalList = new ArrayList<>();
        finalList.add(text);
        ppVisit.setChildren(finalList);

        return (Object) ppVisit;
    }

    @Override
    public Object visitMenorRAST(InterpreteParser.MenorRASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        TreeItem ppVisit = new TreeItem(ctx.getClass().getSimpleName().replace("Context", ""), numTabs);
        numTabs++;
        TreeItem text = new TreeItem(ctx.MENOR().getText(), numTabs);
        numTabs--;
        ArrayList<TreeItem> finalList = new ArrayList<>();
        finalList.add(text);
        ppVisit.setChildren(finalList);

        return (Object) ppVisit;
    }

    @Override
    public Object visitMenorIgualRAST(InterpreteParser.MenorIgualRASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        TreeItem ppVisit = new TreeItem(ctx.getClass().getSimpleName().replace("Context", ""), numTabs);
        numTabs++;
        TreeItem text = new TreeItem(ctx.MENORIGUAL().getText(), numTabs);
        numTabs--;
        ArrayList<TreeItem> finalList = new ArrayList<>();
        finalList.add(text);
        ppVisit.setChildren(finalList);

        return (Object) ppVisit;
    }

    @Override
    public Object visitEqualsRAST(InterpreteParser.EqualsRASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        TreeItem ppVisit = new TreeItem(ctx.getClass().getSimpleName().replace("Context", ""), numTabs);
        numTabs++;
        TreeItem text = new TreeItem(ctx.EQUALS().getText(), numTabs);
        numTabs--;
        ArrayList<TreeItem> finalList = new ArrayList<>();
        finalList.add(text);
        ppVisit.setChildren(finalList);

        return (Object) ppVisit;
    }


    @Override
    public Object visitOrRAST(InterpreteParser.OrRASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        TreeItem ppVisit = new TreeItem(ctx.getClass().getSimpleName().replace("Context", ""), numTabs);
        numTabs++;
        TreeItem text = new TreeItem(ctx.OR().getText(), numTabs);
        numTabs--;
        ArrayList<TreeItem> finalList = new ArrayList<>();
        finalList.add(text);
        ppVisit.setChildren(finalList);

        return (Object) ppVisit;
    }

    @Override
    public Object visitOr2RAST(InterpreteParser.Or2RASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        TreeItem ppVisit = new TreeItem(ctx.getClass().getSimpleName().replace("Context", ""), numTabs);
        numTabs++;
        TreeItem text = new TreeItem(ctx.OR2().getText(), numTabs);
        numTabs--;
        ArrayList<TreeItem> finalList = new ArrayList<>();
        finalList.add(text);
        ppVisit.setChildren(finalList);

        return (Object) ppVisit;
    }

    @Override
    public Object visitAndRAST(InterpreteParser.AndRASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        TreeItem ppVisit = new TreeItem(ctx.getClass().getSimpleName().replace("Context", ""), numTabs);
        numTabs++;
        TreeItem text = new TreeItem(ctx.AND().getText(), numTabs);
        numTabs--;
        ArrayList<TreeItem> finalList = new ArrayList<>();
        finalList.add(text);
        ppVisit.setChildren(finalList);

        return (Object) ppVisit;
    }

    @Override
    public Object visitAnd2RAST(InterpreteParser.And2RASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        TreeItem ppVisit = new TreeItem(ctx.getClass().getSimpleName().replace("Context", ""), numTabs);
        numTabs++;
        TreeItem text = new TreeItem(ctx.AND2().getText(), numTabs);
        numTabs--;
        ArrayList<TreeItem> finalList = new ArrayList<>();
        finalList.add(text);
        ppVisit.setChildren(finalList);

        return (Object) ppVisit;
    }

    @Override
    public Object visitDifRAST(InterpreteParser.DifRASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        TreeItem ppVisit = new TreeItem(ctx.getClass().getSimpleName().replace("Context", ""), numTabs);
        numTabs++;
        TreeItem text = new TreeItem(ctx.DIF().getText(), numTabs);
        numTabs--;
        ArrayList<TreeItem> finalList = new ArrayList<>();
        finalList.add(text);
        ppVisit.setChildren(finalList);

        return (Object) ppVisit;
    }

    @Override
    public Object visitSumAST(InterpreteParser.SumASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        TreeItem ppVisit = new TreeItem(ctx.getClass().getSimpleName().replace("Context", ""), numTabs);
        numTabs++;
        TreeItem text = new TreeItem(ctx.SUM().getText(), numTabs);
        numTabs--;
        ArrayList<TreeItem> finalList = new ArrayList<>();
        finalList.add(text);
        ppVisit.setChildren(finalList);

        return (Object) ppVisit;
    }

    @Override
    public Object visitResAST(InterpreteParser.ResASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        TreeItem ppVisit = new TreeItem(ctx.getClass().getSimpleName().replace("Context", ""), numTabs);
        numTabs++;
        TreeItem text = new TreeItem(ctx.RES().getText(), numTabs);
        numTabs--;
        ArrayList<TreeItem> finalList = new ArrayList<>();
        finalList.add(text);
        ppVisit.setChildren(finalList);

        return (Object) ppVisit;
    }

    @Override
    public Object visitOrAST(InterpreteParser.OrASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        TreeItem ppVisit = new TreeItem(ctx.getClass().getSimpleName().replace("Context", ""), numTabs);
        numTabs++;
        TreeItem text = new TreeItem(ctx.OR().getText(), numTabs);
        numTabs--;
        ArrayList<TreeItem> finalList = new ArrayList<>();
        finalList.add(text);
        ppVisit.setChildren(finalList);

        return (Object) ppVisit;
    }

    @Override
    public Object visitMulAST(InterpreteParser.MulASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        TreeItem ppVisit = new TreeItem(ctx.getClass().getSimpleName().replace("Context", ""), numTabs);
        numTabs++;
        TreeItem text = new TreeItem(ctx.MUL().getText(), numTabs);
        numTabs--;
        ArrayList<TreeItem> finalList = new ArrayList<>();
        finalList.add(text);
        ppVisit.setChildren(finalList);

        return (Object) ppVisit;
    }

    @Override
    public Object visitDivAST(InterpreteParser.DivASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        TreeItem ppVisit = new TreeItem(ctx.getClass().getSimpleName().replace("Context", ""), numTabs);
        numTabs++;
        TreeItem text = new TreeItem(ctx.DIV().getText(), numTabs);
        numTabs--;
        ArrayList<TreeItem> finalList = new ArrayList<>();
        finalList.add(text);
        ppVisit.setChildren(finalList);

        return (Object) ppVisit;
    }

    @Override
    public Object visitAndAST(InterpreteParser.AndASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        TreeItem ppVisit = new TreeItem(ctx.getClass().getSimpleName().replace("Context", ""), numTabs);
        numTabs++;
        TreeItem text = new TreeItem(ctx.AND().getText(), numTabs);
        numTabs--;
        ArrayList<TreeItem> finalList = new ArrayList<>();
        finalList.add(text);
        ppVisit.setChildren(finalList);

        return (Object) ppVisit;
    }

    @Override
    public Object visitInLAST(InterpreteParser.InLASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        TreeItem ppVisit = new TreeItem(ctx.getClass().getSimpleName().replace("Context", ""), numTabs);
        numTabs++;
        TreeItem text = new TreeItem(ctx.INTLITERAL().getText(), numTabs);
        numTabs--;
        ArrayList<TreeItem> finalList = new ArrayList<>();
        finalList.add(text);
        ppVisit.setChildren(finalList);

        return (Object) ppVisit;
    }

    @Override
    public Object visitRealLAST(InterpreteParser.RealLASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        TreeItem ppVisit = new TreeItem(ctx.getClass().getSimpleName().replace("Context", ""), numTabs);
        numTabs++;
        TreeItem text = new TreeItem(ctx.REALLITERAL().getText(), numTabs);
        numTabs--;
        ArrayList<TreeItem> finalList = new ArrayList<>();
        finalList.add(text);
        ppVisit.setChildren(finalList);

        return (Object) ppVisit;
    }

    @Override
    public Object visitBoolLAST(InterpreteParser.BoolLASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        TreeItem ppVisit = new TreeItem(ctx.getClass().getSimpleName().replace("Context", ""), numTabs);
        numTabs++;
        TreeItem text = new TreeItem(ctx.BOOLLITERAL().getText(), numTabs);
        numTabs--;
        ArrayList<TreeItem> finalList = new ArrayList<>();
        finalList.add(text);
        ppVisit.setChildren(finalList);

        return (Object) ppVisit;
    }

    @Override
    public Object visitStringLAST(InterpreteParser.StringLASTContext ctx) {
        System.out.println("\t".repeat(numTabs) + ctx.getClass().getSimpleName().replace("Context", ""));
        TreeItem ppVisit = new TreeItem(ctx.getClass().getSimpleName().replace("Context", ""), numTabs);
        numTabs++;
        TreeItem text = new TreeItem(ctx.STRINGLITERAL().getText(), numTabs);
        numTabs--;
        ArrayList<TreeItem> finalList = new ArrayList<>();
        finalList.add(text);
        ppVisit.setChildren(finalList);

        return (Object) ppVisit;

    }
}
