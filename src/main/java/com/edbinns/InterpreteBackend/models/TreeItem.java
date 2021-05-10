package com.edbinns.InterpreteBackend.models;

import java.util.ArrayList;

public class TreeItem {
    private String text;
    private int value;
    private ArrayList<TreeItem> children;

    public TreeItem(String text, int value) {
        this.text = text;
        this.value = value;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public ArrayList<TreeItem> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<TreeItem> children) {
        this.children = children;
    }
}
