package com.edbinns.interprete.visitors.analisis_contextual;

public class Symbol {
    String id;
    String attr;
    int level;

    public Symbol(String id, String attr, int level) {
        this.id = id;
        this.attr = attr;
        this.level = level;
    }
}
