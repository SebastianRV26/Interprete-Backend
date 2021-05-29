package com.edbinns.InterpreteBackend.visitors.interprete.models;

import com.edbinns.InterpreteBackend.models.Node;
import com.edbinns.InterpreteBackend.visitors.analisis_contextual.models.VariableNode;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;

import java.util.ArrayList;

public class FunctionInterpreter extends Node {

    private ArrayList<VariableInterpreter> parameterList;
    private Object returnValue;
    private String type;

    public FunctionInterpreter(Token id, int level, ParserRuleContext declCtx, ArrayList<VariableInterpreter> parameterList, Object returnValue, String type) {
        super(id, level, declCtx);
        this.parameterList = parameterList;
        this.returnValue = returnValue;
        this.type = type;
    }

    public Object getReturnValue() {
        return returnValue;
    }

    public void setReturnValue(Object returnValue) {
        this.returnValue = returnValue;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ArrayList<VariableInterpreter> getParameterList() {
        return parameterList;
    }

    public void setParameterList(ArrayList<VariableInterpreter> parameterList) {
        this.parameterList = parameterList;
    }

    @Override
    public void imprimir() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        String message = "";

        message += "Nombre: " + getId().getText() + " - " + getLevel() + " - " + getType();
        if (getParameterList().size() > 0) {
            message += "\n Parametros:";
            for (VariableInterpreter vn : getParameterList()) {
                message += "\n\t" + vn.toString();
            }
        }

        return message;
    }

    public void updateValue(String id, Object value){
        for (VariableInterpreter parameter: getParameterList()){
            if(parameter.getId().getText().equals(id))
                parameter.updateValue(value);
        }
    }
}
