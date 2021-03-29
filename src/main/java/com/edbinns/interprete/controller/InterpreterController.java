package com.edbinns.interprete.controller;

import com.edbinns.interprete.models.ResponseBody;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@RestController
public class InterpreterController {

    /*
    Aqui se declaran los endpoints y se llaman las funciones de la clase InterpreterFunctions
     */

    @GetMapping("/")
    public String homePage(){
        return "Home page";
    }

//    @GetMapping("/scanner")
//    public ResponseBody<java.io.Serializable> scanner(@RequestParam(value = "snippet") String snippet) {
//        return null;
//    }
}
