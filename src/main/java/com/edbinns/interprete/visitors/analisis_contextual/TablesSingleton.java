package com.edbinns.interprete.visitors.analisis_contextual;

import com.edbinns.interprete.visitors.analisis_contextual.models.ClassNode;
import com.edbinns.interprete.visitors.analisis_contextual.models.FunctionNode;
import com.edbinns.interprete.visitors.analisis_contextual.models.VariableNode;

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
    }
}
