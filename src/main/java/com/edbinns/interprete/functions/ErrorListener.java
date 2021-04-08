package com.edbinns.interprete.functions;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

public class ErrorListener extends BaseErrorListener {

    public static ErrorListener instance = null;

    public static ErrorListener getInstance() {
        if (instance == null) {
            instance = new ErrorListener();
        }
        return instance;
    }

    private boolean existError = false;
    private String messageError = "";

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        setExistError(true);
        if (recognizer instanceof generated.InterpreteParser)
            setMessageError("PARSER ERROR: " + msg);
        else if (recognizer instanceof generated.InterpreteScanner)
            setMessageError("SCANNER ERROR: " + msg);
        else
            setMessageError("Error: " + msg);
        System.out.println(getMessageError());
        System.out.println( "Error: "+ msg);
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
