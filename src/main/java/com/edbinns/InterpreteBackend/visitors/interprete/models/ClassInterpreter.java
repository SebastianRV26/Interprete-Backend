package com.edbinns.InterpreteBackend.visitors.interprete.models;

import com.edbinns.InterpreteBackend.models.Node;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;

import java.util.ArrayList;

public class ClassInterpreter extends Node {

    private ArrayList<VariableInterpreter> attrList;

    public ClassInterpreter(Token id, int level, ParserRuleContext declCtx, ArrayList<VariableInterpreter> attrList) {
        super(id, level, declCtx);
        this.attrList = attrList;
    }

    public ArrayList<VariableInterpreter> getAttrList() {
        return attrList;
    }

    public void setAttrList(ArrayList<VariableInterpreter> attrList) {
        this.attrList = attrList;
    }

    @Override
    public void imprimir() {

    }

    @Override
    public String toString() {
        return null;
    }

    public void updateValue(String id, Object value){
        for (VariableInterpreter parameter: getAttrList()){
            if(parameter.getId().getText().equals(id))
                parameter.updateValue(value);
        }
    }
}
