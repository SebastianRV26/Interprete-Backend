package com.edbinns.interprete.visitors.analisis_contextual.models;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;

import java.util.ArrayList;
import java.util.LinkedList;

public class VariableNode extends Node {

    String type;
    Token value;
    Boolean isArray;
//    ArrayListL<>

    public VariableNode(Token token, int level, ParserRuleContext declCtx, String type, Token value, boolean isArray) {
        super(token, level, declCtx);
        this.type = type;
        this.value = value;
        this.isArray = isArray;
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
    public Boolean getIsArray() {
        return isArray;
    }

    public void setiSArray(Boolean array) {
        isArray = array;
    }
    @Override
    public void imprimir() {
        if(getIsArray()){

            if(getValue() != null){
                System.out.println("Nombre: " + getId().getText() + " - " + getLevel() + " - " + getType() + "[]" + " - " + getValue().getText());
            }else{
                System.out.println("Nombre: " + getId().getText() + " - " + getLevel() + " - " + getType() + "[]" );
            }
        }else{
            if(getValue() != null){
                System.out.println("Nombre: " + getId().getText() + " - " + getLevel() + " - " + getType() + " - " + getValue().getText());
            }else{
                System.out.println("Nombre: " + getId().getText() + " - " + getLevel() + " - " + getType() );
            }

        }

    }
}
