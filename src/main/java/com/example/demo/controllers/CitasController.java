package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.CitaEntity;
import com.example.demo.Service.CitasService;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api/citas")
public class CitasController {
    @Autowired
    private CitasService citasService;
    @GetMapping(value="",produces=MediaType.APPLICATION_JSON_VALUE)
    public List<CitaEntity> getMethodName() {
       return citasService.getAllCitas();
    }
    



}
