package com.edbinns.InterpreteBackend.visitors.interprete.models;

import com.edbinns.InterpreteBackend.models.Node;
import com.edbinns.InterpreteBackend.visitors.analisis_contextual.models.VariableNode;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;

import java.util.ArrayList;

public class FunctionInterpreter extends Node {

    private ArrayList<Object> parameterList;
    private Object returnValue;
    private String type;

    public FunctionInterpreter(Token id, int level, ParserRuleContext declCtx, ArrayList<Object> parameterList, Object returnValue, String type) {
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

    public ArrayList<Object> getParameterList() {
        return parameterList;
    }

    public void setParameterList(ArrayList<Object> parameterList) {
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
            for (Object vn : getParameterList()) {
                if(vn instanceof VariableInterpreter){
                    VariableInterpreter variable = (VariableInterpreter) vn;
                    message += "\n\t" + variable.toString();
                }
                if(vn instanceof ArrayInterpreter){
                    ArrayInterpreter variable = (ArrayInterpreter) vn;
                    message += "\n\t" + variable.toString();
                }
            }
        }

        return message;
    }

    public void updateValue(String id, Object value){

        for (int i = 0; i <getParameterList().size() ; i++) {
            Object parameter = getParameterList().get(i);
            if (parameter instanceof VariableInterpreter) {
                VariableInterpreter variable = (VariableInterpreter) parameter;
                if (variable.getId().getText().equals(id))
                    variable.updateValue(value);
            }else if(parameter instanceof ArrayInterpreter){
                ArrayInterpreter variable = (ArrayInterpreter) parameter;
                if (variable.getId().getText().equals(id)){
                    variable.setDataList((java.lang.Object[]) value);
                    getParameterList().add(i,variable);
                }
            }
        }
    }


}
