package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaController {

    @GetMapping(value="/hola")
    public String sayHola() {
        return "Hola, Mundo!";
    }
}