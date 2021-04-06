package com.edbinns.interprete.models;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.springframework.http.HttpStatus;


public class ResponseBody<T> {
    
    private final int statusCode;
    private final String message;
    private final T data;

    public ResponseBody(int statusCode, String message, T data) {
        this.statusCode = statusCode;
        this.message = message;
        this.data = data;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public String getMessage() {
        return message;
    }

    public T getData(){
        return  data;
    }

}
