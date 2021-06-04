package com.edbinns.InterpreteBackend.models;


public class Message {
    private String finalMessage;
    private String printMessage;

    public Message(String finalMessage, String printMessage) {
        this.finalMessage = finalMessage;
        this.printMessage = printMessage;
    }

    public String getFinalMessage() {
        return finalMessage;
    }

    public void setFinalMessage(String finalMessage) {
        this.finalMessage = finalMessage;
    }

    public String getPrintMessage() {
        return printMessage;
    }

    public void setPrintMessage(String printMessage) {
        this.printMessage = printMessage;
    }
}
