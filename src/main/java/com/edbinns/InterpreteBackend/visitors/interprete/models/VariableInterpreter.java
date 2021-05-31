package com.edbinns.InterpreteBackend.visitors.interprete.models;

import com.edbinns.InterpreteBackend.visitors.models.Node;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;

public class VariableInterpreter extends Node {

    private  Object value;
    private String type;

    public VariableInterpreter(Token id, int level, ParserRuleContext declCtx, Object value, String type) {
        super(id, level, declCtx);
        this.value = value;
        this.type = type;
    }

    public Object getValue() {
        return value;
    }

    public void updateValue(Object value) {
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }



    @Override
    public void imprimir() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        String message = "";

        if (getValue() != null) {
            message += "Nombre: " + getId().getText() + " - " + getLevel() + " - " + getType() + " - " + getValue().toString();
        } else {
            message += "Nombre: " + getId().getText() + " - " + getLevel() + " - " + getType();
        }
       return message;
    }

}
