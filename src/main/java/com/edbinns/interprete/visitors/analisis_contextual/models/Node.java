package com.edbinns.interprete.visitors.analisis_contextual.models;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;

import java.util.LinkedList;

public abstract class Node {
    //El id es el nombre
    Token id;
    int level;
    ParserRuleContext declCtx;

    public Node(  Token id, int level, ParserRuleContext declCtx) {
        this.id = id;
        this.declCtx = declCtx;
        this.level = level;
    }

    public Token getId() {
        return id;
    }

    public void setId(Token id) {
        this.id = id;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public ParserRuleContext getDeclCtx() {
        return declCtx;
    }

    public abstract void imprimir();
    public abstract String toString();

    public void setDeclCtx(ParserRuleContext declCtx) {
        this.declCtx = declCtx;
    }

}
