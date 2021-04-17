package com.edbinns.interprete.visitors.analisis_contextual;

import java.util.LinkedList;

public class IdentificationTable {

    private int level = 0;
    private final LinkedList<Symbol> symbols = new LinkedList<>();

    /**
     * Agrega un identificador a la Tabla
     */
    public void enter(String id, String attr) {
        Symbol s = new Symbol(id, attr, level);
        symbols.add(s);
    }

    /**
     * Devuelve un identificador de la tabla. Retorna null
     * cuando el identificador no se encuentra en la tabla
     */
    public String retrieve(String id) {
        Symbol s = searchSymbol(id);
        if (s != null) {
            return s.attr;
        }
        return null;
    }

    public Symbol searchSymbol(String id) {
        for (int i = symbols.size() - 1; i >= 0; i--) {
            //System.out.println(symbols.get(i));
            if (symbols.get(i).id.equals(id)) {
                return symbols.get(i);
            }
        }
        return null;
    }

    /**
     * Agrega un nuevo nivel de identificadores a la tabla
     * El más “profundo”
     */
    public void openScope() {
        level++;
    }

    /**
     * Elimina el más profundo nivel de identificadores de la tabla.
     * Se borran todos los campos de la tabla asociados con el nivel
     */
    public void closeScope() {
        for (int i = symbols.size() - 1; i >= 0; i--) {
            // System.out.print(symbols.get(i) + " ");
            if (symbols.get(i).level == level) {
                symbols.remove(i);
            }
        }
        level--;
    }

}
