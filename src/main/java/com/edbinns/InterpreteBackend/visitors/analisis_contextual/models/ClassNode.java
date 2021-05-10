package com.edbinns.InterpreteBackend.visitors.analisis_contextual.models;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;

import java.util.ArrayList;

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
        System.out.println(toString());
    }

    @Override
    public String toString() {
        String message = "";
        message += "Nombre: " + getId().getText() + " - " + getLevel() ;
        if(getAttrList().size() >0){
            message += "\nAtributos:";
            for(VariableNode vn: getAttrList()){
                message += "\n\t"+ vn.toString();

            }
        }

        return message;
    }

    public VariableNode search(String id){
        for(VariableNode obj : getAttrList())
            if ((obj).getId().getText().equals(id))
                return (obj);
        return null;
    }
}
