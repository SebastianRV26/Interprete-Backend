package com.edbinns.InterpreteBackend.visitors.analisis_contextual.utils;

public class AContextualErrorListener {
    public static AContextualErrorListener instance = null;

    public static AContextualErrorListener getInstance() {
        if (instance == null) instance = new AContextualErrorListener();
        return instance;
    }

    private boolean existError = false;
    private String messageError = "";

    public void sendError(String messageError) {
        setMessageError(messageError);
        setExistError(true);
    }
    public boolean getExistError() {
        return existError;
    }

    public void setExistError(boolean value){
        this.existError = value;
    }

    public String getMessageError() {
        return messageError;
    }

    public void setMessageError(String messageError) {
        this.messageError = messageError;
    }
}
