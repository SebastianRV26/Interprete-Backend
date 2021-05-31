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

        ArrayList<Object> paramentersChar = new ArrayList();
        paramentersChar.add(new VariableInterpreter(new CommonToken(InterpreteParser.ID,"i"),1,null,0,"INT"));
        FunctionInterpreter chr = new FunctionInterpreter( new CommonToken(InterpreteParser.ID,"chr"),0,null, paramentersChar,null ,"CHAR");
        this.functionsStore.enter(chr);

        ArrayList<Object> paramentersOrd = new ArrayList();
        paramentersOrd.add(new VariableInterpreter(new CommonToken(InterpreteParser.ID,"ch"),1,null,'\0',"CHAR"));
        FunctionInterpreter ord = new FunctionInterpreter( new CommonToken(InterpreteParser.ID,"ord"),0,null, paramentersOrd,null ,"INT");
        this.functionsStore.enter(ord);

        ArrayList<Object> paramentersLen = new ArrayList();
        paramentersLen.add(new VariableInterpreter(new CommonToken(InterpreteParser.ID,"a"),1,null,"","STRING"));
        FunctionInterpreter len = new FunctionInterpreter( new CommonToken(InterpreteParser.ID,"len"),0,null, paramentersLen,null ,"INT");
        this.functionsStore.enter(len);
    }

    public void destroySingleton(){
        instance = null;
    }
}
