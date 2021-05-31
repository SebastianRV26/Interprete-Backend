package com.edbinns.InterpreteBackend.visitors.interprete.utils;

public class ReturnUtils {
    private boolean flag;
    private Object value;

    public ReturnUtils(boolean flag, Object value) {
        this.flag = flag;
        this.value = value;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
