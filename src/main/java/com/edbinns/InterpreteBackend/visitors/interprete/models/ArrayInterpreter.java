package com.edbinns.InterpreteBackend.visitors.interprete.models;

import com.edbinns.InterpreteBackend.models.Node;
import com.edbinns.InterpreteBackend.models.Type;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;

import java.util.ArrayList;

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

    }

    @Override
    public String toString() {
        return null;
    }

    public void updateValue(int position, Object newValue){
        if(position <= getDataList().length){
            getDataList()[position] = newValue;
        }else{
            System.out.println("Mostrar error del tamaño de los arreglos");
        }
    }

}
