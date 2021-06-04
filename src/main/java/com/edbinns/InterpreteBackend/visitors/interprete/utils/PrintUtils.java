package com.edbinns.InterpreteBackend.visitors.interprete.utils;

import com.edbinns.InterpreteBackend.visitors.interprete.StoresSingleton;

import java.util.ArrayList;

public class PrintUtils {

    private ArrayList<String> printList;
    public static PrintUtils instance = null;

    public static PrintUtils getInstance() {
        if (instance == null) {
            instance = new PrintUtils();
        }
        return instance;
    }

    public PrintUtils() {
        this.printList = new ArrayList<>();
    }

    public ArrayList<String> getValue() {
        return printList;
    }

    public void setValue(String value) {
        printList.add(value);
    }

    public String println(){
        String message = "";
        for (String str: printList) {
            message += "\n " + str;
        }
        return  message;
    }
    public void destroySingleton(){
        instance = null;
    }
}
