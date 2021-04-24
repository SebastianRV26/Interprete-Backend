package com.edbinns.interprete.visitors.analisis_contextual.models;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;

import java.util.ArrayList;

public class ClassNode extends  Node {

    ArrayList<VariableNode> attrList;

    public ClassNode(Token id, int level, ParserRuleContext declCtx, ArrayList<VariableNode> attrList) {
        super(id, level, declCtx);
        this.attrList = attrList;
    }

    public ArrayList<VariableNode> getAttrList() {
        return attrList;
    }

    public void setAttrList(ArrayList<VariableNode> attrList) {
        this.attrList = attrList;
    }
}
