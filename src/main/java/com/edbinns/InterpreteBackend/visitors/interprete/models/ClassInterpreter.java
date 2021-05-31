package com.edbinns.InterpreteBackend.visitors.interprete.models;

import com.edbinns.InterpreteBackend.visitors.models.Node;
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
        System.out.println(toString());
    }

    @Override
    public String toString() {
        String message = "";
        message += "Nombre: " + getId().getText() + " - " + getLevel() ;
        if(getAttrList().size() >0){
            message += "\nAtributos:";
            for(VariableInterpreter vn: getAttrList()){
                message += "\n\t"+ vn.toString();

            }
        }

        return message;
    }

    public void updateValue(String id, Object value){
        VariableInterpreter parameter = searchAttr(id);
        parameter.updateValue(value);
    }

    public VariableInterpreter searchAttr(String id){
        for (VariableInterpreter parameter: getAttrList()){
            if(parameter.getId().getText().equals(id))
                return parameter;
        }
        return null;
    }
}
