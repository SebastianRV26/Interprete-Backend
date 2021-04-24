package com.edbinns.interprete.visitors.analisis_contextual.models;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;

import java.util.LinkedList;

public class VariableNode extends Node {

    String type;
    Token value;

    public VariableNode(Token token, int level, ParserRuleContext declCtx, String type, Token value) {
        super(token, level, declCtx);
        this.type = type;
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Token getValue() {
        return value;
    }

    public void setValue(Token value) {
        this.value = value;
    }

    @Override
    public void imprimir() {
        System.out.println("Nombre: " + getId().getText() + " - " + getLevel() + " - " + (getType()));
    }
}
