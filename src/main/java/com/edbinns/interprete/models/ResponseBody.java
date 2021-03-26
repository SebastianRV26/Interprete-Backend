package com.edbinns.interprete.models;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.springframework.http.HttpStatus;

@JsonSerialize
public class ResponseBody<T> {
    
    private final HttpStatus statusCode;
    private final String message;
    private final T data;

    ResponseBody(HttpStatus statusCode, String message, T data) {
        this.statusCode = statusCode;
        this.message = message;
        this.data = data;
    }

    public HttpStatus getStatusCode() {
        return statusCode;
    }

    public String getMessage() {
        return message;
    }

    public T getData(){
        return  data;
    }

}
