package com.edbinns.InterpreteBackend.visitors.interprete;

import com.edbinns.InterpreteBackend.generated.InterpreteParser;
import com.edbinns.InterpreteBackend.visitors.analisis_contextual.TablesSingleton;
import com.edbinns.InterpreteBackend.visitors.analisis_contextual.models.FunctionNode;
import com.edbinns.InterpreteBackend.visitors.analisis_contextual.models.VariableNode;
import com.edbinns.InterpreteBackend.visitors.interprete.models.ArrayInterpreter;
import com.edbinns.InterpreteBackend.visitors.interprete.models.ClassInterpreter;
import com.edbinns.InterpreteBackend.visitors.interprete.models.FunctionInterpreter;
import com.edbinns.InterpreteBackend.visitors.interprete.models.VariableInterpreter;
import org.antlr.v4.runtime.CommonToken;

import java.util.ArrayList;

public class StoresSingleton {
    public static StoresSingleton instance = null;

    public static StoresSingleton getInstance() {
        if (instance == null) {
            instance = new StoresSingleton();
        }
        return instance;
    }

    public StoreData<VariableInterpreter> variableStore;
    public StoreData<ClassInterpreter> classStore;
    public StoreData<FunctionInterpreter> functionsStore;
    public StoreData<ArrayInterpreter> arrayStore;
    public StoresSingleton() {
        this.classStore = new StoreData<>();
        this.variableStore = new StoreData<>();
        this.functionsStore =  new StoreData<>();
        this.arrayStore =  new StoreData<>();
    }

    public void destroySingleton(){
        instance = null;
    }
}
