package com.edbinns.interprete;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {


    @GetMapping("/")
    public String homePage(){
        return "Home page";
    }
}
