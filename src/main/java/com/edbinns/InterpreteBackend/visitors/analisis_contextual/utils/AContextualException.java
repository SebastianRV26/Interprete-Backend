package com.edbinns.InterpreteBackend.visitors.analisis_contextual.utils;

public class AContextualException extends RuntimeException {

    private String mensaje;

    public AContextualException(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String getMessage() {
        return this.mensaje;
    }


}
