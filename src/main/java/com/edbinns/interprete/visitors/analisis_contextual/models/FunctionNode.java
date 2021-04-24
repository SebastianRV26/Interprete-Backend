package com.edbinns.interprete.visitors.analisis_contextual.models;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;

import java.util.ArrayList;

public class FunctionNode extends Node {
    Type type;
    ArrayList<VariableNode> parameterList;


    public FunctionNode(Token id, int level, ParserRuleContext declCtx, Type type, ArrayList<VariableNode> parameterList ) {
        super(id, level, declCtx);
        this.type = type;
        this.parameterList = parameterList;

    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public ArrayList<VariableNode> getParameterList() {
        return parameterList;
    }

    public void setParameterList(ArrayList<VariableNode> parameterList) {
        this.parameterList = parameterList;
    }
}
