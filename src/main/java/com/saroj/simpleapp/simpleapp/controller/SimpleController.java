package com.saroj.simpleapp.simpleapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

    @RequestMapping(value = {"/get"})
    public String getHello(){
        return "Hello from Simple Controller";

    }

    @RequestMapping(value = {"/bye"})
    public String getPrescription(){
        return "Bye Bye";

    }
}
