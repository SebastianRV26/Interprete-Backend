package com.edbinns.InterpreteBackend.visitors.interprete;

import com.edbinns.InterpreteBackend.visitors.models.Node;

import java.util.LinkedList;

public class StoreData<T extends Node> {
    private LinkedList<T> store;
    private int level;
    public StoreData() {
        this.store = new LinkedList<T>();
        this.level = 0;
    }

    public int getLevel() {
        return level;
    }
    /**
     * Agrega un identificador a la Tabla
     */
    public void enter(T node) {
        store.addFirst(node);
    }

    /**
     * Agrega un nuevo nivel de identificadores a la tabla
     * El más “profundo”
     */
    public void openScope() {
        level++;
    }

    public T searchNode(String id) {
        for(T obj : store)
            if ((obj).getId().getText().equals(id))
                return (obj);
        return null;
    }
    /**
     * Elimina el más profundo nivel de identificadores de la tabla.
     * Se borran todos los campos de la tabla asociados con el nivel
     */
    public void closeScope() {
        store.removeIf(n -> (((T)n).getLevel() == level));
        level--;
    }

    public void imprimir() {
        System.out.println("----- INICIO ALMACEN ------");
        for (T t : store) {
            t.imprimir();
        }
        System.out.println("----- FIN ALMACEN ------");
    }

    public String showStore(String name){
        String message = "";
        message += "\n" + "----- Inicio de Almacen de " + name + " -----";
        for (T t : store) {
            message += "\n" + t.toString();
        }
        message += "\n" + "----- Fin de Almacen de  " + name + " -----";
        return message;
    }
}
