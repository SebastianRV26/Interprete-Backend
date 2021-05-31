package com.edbinns.InterpreteBackend.visitors.interprete.models;

import com.edbinns.InterpreteBackend.visitors.models.Node;
import com.edbinns.InterpreteBackend.visitors.analisis_contextual.utils.AContextualException;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;

public class ArrayInterpreter extends Node {

    private String type;
    private Object[] dataList;

    public ArrayInterpreter(Token id, int level, ParserRuleContext declCtx, String type, Object[] dataList) {
        super(id, level, declCtx);
        this.type = type;
        this.dataList = dataList;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Object[] getDataList() {
        return dataList;
    }

    public void setDataList( Object[] dataList) {
        this.dataList = dataList;
    }



    @Override
    public void imprimir() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        String message = "";

        String values = " -";
        if(getDataList() != null){
            values += " {";
            for (int i = 0; i < getDataList().length; i++) {
                if(i == 0){
                    if (getDataList()[i] != null){
                        values = values + "" + getDataList()[i].toString();
                    }else{
                        values = values + "null";
                    }
                }else{
                    if (getDataList()[i] != null){
                        values = values + ", " + getDataList()[i].toString();
                    }else{
                        values = values + ", null";
                    }
                }
            }
            values += "}";
        }else{
            values += " null";
        }

        message += "Nombre: " + getId().getText() + " - " + getLevel() + " - " + getType() + values ;
        return message;
    }

    public void updateValue(int position, Object newValue){
        if(position <= getDataList().length && position > -1){
            getDataList()[position] = newValue;
        }else{
            throw new AContextualException("Error, posicion fuera de rango");
        }
    }

}
