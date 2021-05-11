package com.edbinns.InterpreteBackend.visitors.analisis_contextual;

import com.edbinns.InterpreteBackend.generated.InterpreteParser;
import com.edbinns.InterpreteBackend.visitors.analisis_contextual.models.ClassNode;
import com.edbinns.InterpreteBackend.visitors.analisis_contextual.models.FunctionNode;
import com.edbinns.InterpreteBackend.visitors.analisis_contextual.models.VariableNode;
import org.antlr.v4.runtime.CommonToken;

import java.util.ArrayList;

public class TablesSingleton {
    public static TablesSingleton instance = null;

    public static TablesSingleton getInstance() {
        if (instance == null) {
            instance = new TablesSingleton();
        }
        return instance;
    }

    public IdentificationTable<VariableNode> variableTable;
    public IdentificationTable<ClassNode> classTable;
    public IdentificationTable<FunctionNode> functionsTable ;

    public TablesSingleton() {
        this.classTable = new IdentificationTable<>();
        this.variableTable = new IdentificationTable<>();
        this.functionsTable = new IdentificationTable<>();

        ArrayList<VariableNode> paramentersChar = new ArrayList();
        paramentersChar.add(new VariableNode(new CommonToken(InterpreteParser.ID,"i"),1,null,"INT",null,false));
        FunctionNode chr = new FunctionNode( new CommonToken(InterpreteParser.ID,"chr"),0,null,"CHAR", paramentersChar, false);

        this.functionsTable.enter(chr);


        ArrayList<VariableNode> paramentersOrd = new ArrayList();
        paramentersOrd.add(new VariableNode(new CommonToken(InterpreteParser.ID,"ch"),1,null,"CHAR",null,false));
        FunctionNode ord = new FunctionNode( new CommonToken(InterpreteParser.ID,"ord"),0,null,"INT", paramentersOrd, false );
        this.functionsTable.enter(ord);


        ArrayList<VariableNode> paramentersLen = new ArrayList();
        paramentersLen.add(new VariableNode(new CommonToken(InterpreteParser.ID,"a"),1,null,"STRING",null,false));
        FunctionNode len = new FunctionNode( new CommonToken(InterpreteParser.ID,"len"),0,null,"INT", paramentersLen, false );
        this.functionsTable.enter(len);
    }

    public void destroySingleton(){
        instance = null;
    }
}
