package com.edbinns.interprete.visitors.analisis_contextual;

import com.edbinns.interprete.functions.ErrorListener;
import com.edbinns.interprete.visitors.analisis_contextual.models.Node;
import org.antlr.v4.runtime.Token;

import java.util.LinkedList;

public class IdentificationTable <T extends Node>{



    private int level = 0;

    public int getLevel() {
        return level;
    }

    private final LinkedList<T> table = new LinkedList<>();

    /**
     * Agrega un identificador a la Tabla
     */
    public void enter(T node) {
        table.addLast(node);
    }

    /**
     * Devuelve un identificador de la tabla. Retorna null
     * cuando el identificador no se encuentra en la tabla
     */
    public Token retrieve(String id) {
        Node s = searchNode(id);
        if (s != null) {
            return s.getId();
        }
        return null;
    }

    public T searchNode(String id) {
        for (int i = table.size() - 1; i >= 0; i--) {
            //System.out.println(symbols.get(i));
            if (table.get(i).getId().equals(id)) {
                return table.get(i);
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
        for (int i = table.size() - 1; i >= 0; i--) {
            // System.out.print(symbols.get(i) + " ");
            if (table.get(i).getLevel() == level) {
                table.remove(i);
            }
        }
        level--;
    }
    public void imprimir() {
        System.out.println("----- INICIO TABLA ------");
        for (int i = table.size() - 1; i >= 0; i--) {
            table.get(i).imprimir();
        }
        System.out.println("----- FIN TABLA ------");
    }

}
