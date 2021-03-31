package com.edbinns.interprete.controller;

import com.edbinns.interprete.models.ResponseBody;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class InterpreterController {

    /*
    Aqui se declaran los endpoints y se llaman las funciones de la clase InterpreterFunctions
     */

    @GetMapping("/")
    public String homePage(){
        return "Home page";
    }

    @GetMapping("/validateSnippet")
    public ResponseBody<java.io.Serializable> validateSnippet(@RequestParam(value = "snippet") String snippet) {
        if((snippet == null) || (snippet.isEmpty()) || (snippet.isBlank()) ){
            return new ResponseBody<>(HttpStatus.NOT_FOUND, "Failed", "El snippet esta vacio");
        }
        if((snippet.endsWith("}")) || (snippet.endsWith(";")) ){
            ///llamar a la funcion que haga algo con el snippet XD
            return new ResponseBody<>(HttpStatus.ACCEPTED, "success", "Aqui se devulve lo que devuelva la funcion");
        }else if(snippet.endsWith("{")){
            ///llamar a la funcion que haga algo con el snippet XD
            return new ResponseBody<>(HttpStatus.NOT_ACCEPTABLE, "Failed", "El snippet esta incompleto");

        }else{
            return new ResponseBody<>(HttpStatus.NOT_ACCEPTABLE, "Failed", "El snippet enviado es invalido");
        }
    }
}
