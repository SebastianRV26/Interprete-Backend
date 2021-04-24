package com.edbinns.interprete.visitors.analisis_contextual.models;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;

import java.util.ArrayList;
import java.util.LinkedList;

public class ClassNode extends  Node{

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

    @Override
    public void imprimir(){
        System.out.println("Nombre: " + getId().getText() + " - " + getLevel() );
        System.out.println("Atributos:");
        for(VariableNode vn: getAttrList()){
            System.out.println("\t"+ "Nombre: " + vn.getId().getText() + " - " + vn.getLevel() + " - " + vn.getType());

        }
    }
}
