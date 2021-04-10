package com.edbinns.interprete.controller;

import com.edbinns.interprete.functions.InterpreterFunctions;
import com.edbinns.interprete.models.ResponseBody;
import com.google.gson.Gson;
import org.apache.tomcat.util.json.JSONParser;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class InterpreterController {

    InterpreterFunctions interpreterFunctions = new InterpreterFunctions();
    /*
    Aqui se declaran los endpoints y se llaman las funciones de la clase InterpreterFunctions
     */

    @GetMapping("/")
    public String homePage(){
        return "Home page";
    }

    @CrossOrigin(allowedHeaders =
            {"Orgin", "X-Requested-With", "Content-Type", "Accept", "Authorization"},
            methods = {RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT,
                    RequestMethod.DELETE}
    )
    @GetMapping("/validateSnippet")
    public ResponseBody<java.io.Serializable> validateSnippet(@RequestParam(value = "snippet") String snippet) throws JSONException {
        if((snippet == null) || (snippet.isEmpty()) || (snippet.isBlank()) ){
            return new ResponseBody<>(HttpStatus.NOT_FOUND.value(), "Failed", "El snippet esta vacio");
        }
        System.out.println(snippet);
        ArrayList<String> responses = interpreterFunctions.validateSnippet(snippet);

        if(responses.get(0).equals("error")){
            return new ResponseBody<>(HttpStatus.NOT_ACCEPTABLE.value(), "Failed", responses.get(1));
        }else{
            return new ResponseBody<>(HttpStatus.OK.value(), "Success",responses.get(1)) ;
        }
    }
}
