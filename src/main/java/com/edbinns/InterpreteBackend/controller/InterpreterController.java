package com.edbinns.InterpreteBackend.controller;

import com.edbinns.InterpreteBackend.functions.InterpreterFunctions;
import com.edbinns.InterpreteBackend.visitors.analisis_contextual.TablesSingleton;
import com.edbinns.InterpreteBackend.visitors.interprete.StoresSingleton;
import com.edbinns.InterpreteBackend.visitors.interprete.utils.PrintUtils;
import org.json.JSONException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.edbinns.InterpreteBackend.models.ResponseBody;
import java.io.Serializable;
import java.util.ArrayList;

@RestController
public class InterpreterController {

    InterpreterFunctions interpreterFunctions = new InterpreterFunctions();
    /*
    Aqui se declaran los endpoints y se llaman las funciones de la clase InterpreterFunctions
     */

    @GetMapping("/")
    public String homePage(){
        return "Proyecto Compiladores";
    }

    @CrossOrigin(allowedHeaders =
            {"Orgin", "X-Requested-With", "Content-Type", "Accept", "Authorization"},
            methods = {RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT,
                    RequestMethod.DELETE}
    )
    @GetMapping("/validateSnippet")
    public ResponseBody<Serializable> validateSnippet(@RequestParam(value = "snippet") String snippet) throws JSONException {
        if((snippet == null) || (snippet.isEmpty()) || (snippet.isBlank()) ){
            return new ResponseBody<>(HttpStatus.NOT_FOUND.value(), "Failed", "El snippet esta vacio");
        }
        System.out.println("snippet " + snippet);
        if(snippet.equals("cls")){
            TablesSingleton ts = TablesSingleton.getInstance();
            ts.destroySingleton();
            StoresSingleton ss = StoresSingleton.getInstance();
            ss.destroySingleton();

            return  new ResponseBody<>(HttpStatus.NOT_ACCEPTABLE.value(), "Failed", "Memoria limpia");
        }else{
            snippet = snippet.replace("!!!", "+");
            System.out.println(snippet);
            ArrayList<String> responses = interpreterFunctions.validateSnippet(snippet);

            if(responses.get(0).equals("error")){
                return new ResponseBody<>(HttpStatus.NOT_ACCEPTABLE.value(), "Failed", responses.get(1));
            }else{
                return new ResponseBody<>(HttpStatus.OK.value(), "Success",responses.get(1)) ;
            }
        }
    }
}
