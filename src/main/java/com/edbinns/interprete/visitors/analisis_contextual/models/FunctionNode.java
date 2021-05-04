package com.edbinns.interprete.visitors.analisis_contextual.models;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;

import java.util.ArrayList;
import java.util.LinkedList;

public class FunctionNode extends Node {
    String type;
    ArrayList<VariableNode> parameterList;
    Boolean returnArray;


    public FunctionNode(Token id, int level, ParserRuleContext declCtx, String type, ArrayList<VariableNode> parameterList, boolean returnArray) {
        super(id, level, declCtx);
        this.type = type;
        this.parameterList = parameterList;
        this.returnArray = returnArray;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ArrayList<VariableNode> getParameterList() {
        return parameterList;
    }

    public void setParameterList(ArrayList<VariableNode> parameterList) {
        this.parameterList = parameterList;
    }

    public boolean isReturnArray() {
        return returnArray;
    }

    public void setReturnArray(boolean returnArray) {
        this.returnArray = returnArray;
    }

    @Override
    public void imprimir() {
        System.out.println("Nombre: " + getId().getText() + " - " + getLevel() + " - " + (getType()));
        System.out.println("Parametros:");
        for (VariableNode vn : getParameterList()) {
            System.out.println("\t" + "Nombre: " + vn.getId().getText() + " - " + vn.getLevel() + " - " + vn.getType());

        }
    }

    public VariableNode searchParameters(String id) {
        for (VariableNode vn : getParameterList())
            if (vn.getId().getText().equals(id))
                return vn;
        return null;
    }
}
