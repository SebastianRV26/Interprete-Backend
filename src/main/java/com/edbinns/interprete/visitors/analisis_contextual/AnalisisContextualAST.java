package com.edbinns.interprete.visitors.analisis_contextual;

import com.edbinns.interprete.generated.InterpreteParser;
import com.edbinns.interprete.generated.InterpreteParserBaseVisitor;
import com.edbinns.interprete.visitors.analisis_contextual.models.ClassNode;
import com.edbinns.interprete.visitors.analisis_contextual.models.FunctionNode;
import com.edbinns.interprete.visitors.analisis_contextual.models.Type;
import com.edbinns.interprete.visitors.analisis_contextual.models.VariableNode;
import com.edbinns.interprete.visitors.analisis_contextual.utils.UtilsAContextual;
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
        Boolean isArray = false;
        if (objectType instanceof Type) {
            type = ((Type) objectType).name();
            isArray = false;
        }  else if (objectType instanceof String) {
            //Se detecta si es de tipo array
            type = ((String) objectType).replace("[]", "");
            isArray = true;
        }else {
            //Validar si la clase que se instancio existe
            type = ((Token) objectType).getText();
        }
        Token id = ctx.ID().getSymbol();
        int level = tablesSingleton.functionsTable.getLevel();
        VariableNode vn = new VariableNode(id, level, ctx, type, null, isArray);
        tablesSingleton.variableTable.enter(vn);
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
            String strType = (String) this.visit(ctx.expression());
            if(!type.equals(strType)){
                throw new AContextualException("Error, el tipo de dato " + strType + " no es posible asginarlo a un atributo tipo " + type);
            }
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
                String strType = (String) this.visit(ctx.expression());

                if(!type.equals(strType)){
                    throw new AContextualException("Error, el tipo de dato " + strType + " no es posible asginarlo a una variable tipo " + type);
                }

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


        String type = (String) visit(ctx.expression());
        ClassNode cn = tablesSingleton.classTable.searchNode(ctx.ID(0).getText());
        VariableNode vn = tablesSingleton.variableTable.searchNode(ctx.ID(0).getText());

        if(cn != null ){
            if(ctx.ID(1) != null && ctx.PUNTO() != null){
                VariableNode attr = cn.search(ctx.ID(1).getText());
                if(attr == null){
                    throw  new AContextualException("No se puede acceder al atributo " + attr.getId().getText() + " debido a que no es un atributo de la clase " + cn.getId().getText());
                }
                if (!attr.getType().equals(type)) {
                    throw  new AContextualException("Error, tipos incompatibles");
                }
                return null;
            }
            if(!cn.getId().getText().equals(type)){
                throw  new AContextualException("Error, tipos incompatibles");
            }
            return null;
        }else if(vn != null){
            if (!vn.getType().equals(type)) {
                throw  new AContextualException("Error, tipos incompatibles");
            }
            return null;
        } else{
            throw  new AContextualException("Esta variable o clase no existe en el programa");
        }

    }

    @Override
    public Object visitArrayAssignAST(InterpreteParser.ArrayAssignASTContext ctx) {
        VariableNode vn = tablesSingleton.variableTable.searchNode(ctx.ID().getText());

        if(vn == null){
            throw new AContextualException("El array no existe en el programa");
        }

        if(!vn.getIsArray()){
            throw new AContextualException("No se puede acceder a esa posicion, debido a que la variable " + vn.getId().getText() + " no es un array");
        }

        String positionType = (String) visit(ctx.expression(0));
        if(!positionType.equals("INT")){
            throw new AContextualException("Error, para poder  acceder a una posicion de un array se requiere que el valor sea entero");
        }

        if (ctx.expression(1) != null) {
            String assign = (String) visit(ctx.expression(1));
            if(!vn.getType().equals(assign)){
                throw new AContextualException("Error, a un array de tipo " + vn.getType() + " no se le pueden asignar cosas del tipo " + assign);
            }
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

        String typeObj = (String) visit(ctx.simpleExpression(0));
        UtilsAContextual utils = new UtilsAContextual();
        for (int i = 1; i <= ctx.simpleExpression().toArray().length - 1; i++) {

            Token relativeOP = (Token)visit(ctx.relacionalop(i - 1));
            String typeObj2 = (String) visit(ctx.simpleExpression(i));
            //52 equals, 57 dif, mayor 58, mi 59, menor 60, mei 61, and 68, and 2 69, or 70, 0r2 71

           switch (relativeOP.getType()){
               case 52:
               case 57:
                   if(!typeObj.equals(typeObj2)){
                       throw new AContextualException("Los tipos de datos no son compatibles para saber si son iguales ");
                   }
                   typeObj = "BOOLEAN";
                   break;
               case 58:
               case 59:
               case 60:
               case 61:
                   utils.validateOP(typeObj,typeObj2,"INT"," en las comparaciones");
                   typeObj = "BOOLEAN";
                   break;
               case 68:
               case 69:
               case 70:
               case 71:
                   typeObj = utils.validateOP(typeObj,typeObj2,"BOOLEAN"," en las comparaciones");
                   break;
               default:
                   throw new AContextualException("Excepcion en el defaul de expression");
           }
        }

        System.out.println(typeObj);
        return (Object) typeObj;
    }

    @Override
    public Object visitSimpleExpressionAST(InterpreteParser.SimpleExpressionASTContext ctx) {

        String typeObj = (String) visit(ctx.term(0));
        UtilsAContextual utils = new UtilsAContextual();
        for (int i = 1; i <= ctx.term().toArray().length - 1; i++) {
            Token additiveOP = (Token) this.visit(ctx.additiveop(i - 1));
            //53 suma ,54 resta ,70 or
            String typeObj2 =  (String) this.visit(ctx.term(i));
            if (additiveOP.getType() == 53) {
                if((typeObj.equals("STRING")) && (typeObj2.equals("STRING"))){
                    typeObj = utils.validateOP(typeObj, typeObj2, "STRING", "la suma");
                } else if((typeObj.equals("INT")) && (typeObj2.equals("INT"))){
                    typeObj = utils.validateOP(typeObj, typeObj2, "INT", "la suma");
                }else{
                    throw new AContextualException("Los tipos de datos no son compatibles en la suma" );
                }
            } else if (additiveOP.getType() == 54) {
                typeObj = utils.validateOP(typeObj, typeObj2, "INT", "una resta");
            } else if (additiveOP.getType() == 68) {
                typeObj = utils.validateOP(typeObj, typeObj2, "BOOLEAN", "el operador logico or");
            }
        }

        return (Object) typeObj;
    }

    @Override
    public Object visitTermAST(InterpreteParser.TermASTContext ctx) {

        Object obj = (Object) this.visit(ctx.factor(0));
        UtilsAContextual utils = new UtilsAContextual();
        String typeObj = utils.validateObj(obj);
        for (int i = 1; i <= ctx.factor().toArray().length - 1; i++) {

            Token multiplicativeOP = (Token) this.visit(ctx.multiplicativeop(i - 1));
            Object obj2 = this.visit(ctx.factor(i));
            String typeObj2 = utils.validateObj(obj2);
            //55,56,68
            if (multiplicativeOP.getType() == 55) {
                typeObj = utils.validateOP(typeObj, typeObj2, "INT", "una division");
            } else if (multiplicativeOP.getType() == 56) {
                typeObj =utils.validateOP(typeObj, typeObj2, "INT", "una multiplicacion");
            } else if (multiplicativeOP.getType() == 68) {
                typeObj = utils.validateOP(typeObj, typeObj2, "BOOLEAN", "el operador logico and");
            }
        }

        return (Object) typeObj;
    }

    @Override
    public Object visitLiteralFAST(InterpreteParser.LiteralFASTContext ctx) {
        return this.visit(ctx.literal());
    }

    @Override
    public Object visitIdFAST(InterpreteParser.IdFASTContext ctx) {

        ClassNode cn = tablesSingleton.classTable.searchNode(ctx.ID(0).getText());

        VariableNode vn = tablesSingleton.variableTable.searchNode(ctx.ID(0).getText());

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
        String returnType = "";
        for (int i = 0; i <= ctx.expression().toArray().length - 1; i++) {
            String type = (String) visit(ctx.expression(i));
            //53 suma, 54 resta 62 admiracion
            if(tokenOperator.getType() == 53 || tokenOperator.getType() == 54  ){
                if(type.equals("INT")){
                    returnType = "INT";
                }else{
                    throw new AContextualException("Error, esta operacion no se le puede aplicar a otros tipos de datos que no sean enteros");
                }
            }
            if(tokenOperator.getType() == 62 ){
                if(type.equals("BOOLEAN")){
                    returnType = "BOOLEAN";
                }else{
                    throw new AContextualException("Error, esta operacion no se le puede aplicar a otros tipos de datos que no sean booleanos");
                }
            }
        }

        return (Object) returnType;
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
        String cantIndex = (String) this.visit(ctx.expression());
        if (!cantIndex.equals("INT")) {
            throw new AContextualException("Al tamaño del array no se le puede asignar algo que no sea un entero");
        }
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


            if (paremeters.size() == fn.getParameterList().size()) {
                for (int i = 0; i < fn.getParameterList().size(); i++) {
                    String typeObj = (String) paremeters.get(i);
                    VariableNode parameter = fn.getParameterList().get(i);
                    String typeParameter = parameter.getType();
                    if(!typeObj.equals(typeParameter)){
                        throw new AContextualException("Error, el parametro enviado no corresonde al tipo  que espera la funcion");
                    }
                }
            } else {
                throw new AContextualException("La cantidad de parametros enviados no corresponden a la cantiad de parametros esperados por la funcion " + fn.getId().getText());
            }
        }else{
            if(fn.getParameterList().size() > 0){
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
        VariableNode vn = tablesSingleton.variableTable.searchNode(ctx.ID().getText());
        if (vn == null) {
            throw new AContextualException("El arreglo " + ctx.ID().getText() + " no existe");
        }
        if (!vn.getIsArray()) {
            throw new AContextualException("No es posible hacer una busqueda en la variable " + ctx.ID().getText() + " debido a que no es un array");
        }

        String position = (String) this.visit(ctx.expression());
        if (!position.equals("INT")) {
            throw new AContextualException("Para buscar en un array solo se puede con valores enteros");
        }
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

    @Override
    public Object visitCharLAST(InterpreteParser.CharLASTContext ctx) {
        return (Object) ctx.CHARLITERAL().getSymbol();
    }



}
