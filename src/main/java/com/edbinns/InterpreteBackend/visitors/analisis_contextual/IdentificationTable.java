package com.edbinns.InterpreteBackend.visitors.analisis_contextual;

import com.edbinns.InterpreteBackend.visitors.models.Node;
import org.antlr.v4.runtime.Token;

import java.util.LinkedList;

public class IdentificationTable <T extends Node>{

    private int level;
    public IdentificationTable() {
        this.level = 0;
    }

    public LinkedList<T> getTable() {
        return table;
    }

    public int getLevel() {
        return level;
    }

    private final LinkedList<T> table = new LinkedList<>();

    /**
     * Agrega un identificador a la Tabla
     */
    public void enter(T node) {
        table.addFirst(node);
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
        for(T obj : table)
            if ((obj).getId().getText().equals(id))
                return (obj);
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
        table.removeIf(n -> (((T)n).getLevel() == level));
        level--;
    }
    public void imprimir() {
        System.out.println("----- INICIO TABLA ------");
        for (T t : table) {
            t.imprimir();
        }
        System.out.println("----- FIN TABLA ------");
    }
    public String showTable(String name){
        String message = "";
        message += "\n" + "----- Inicio de tabla " + name + " -----";
        for (T t : table) {
            message += "\n" + t.toString();
        }
        message += "\n" + "----- Fin de tabla " + name + " -----";
        return message;
    }



}
