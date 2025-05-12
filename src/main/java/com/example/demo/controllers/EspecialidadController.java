package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.EspecialidadService;
import com.example.demo.Service.UsuarioService;

import java.util.Map;

import com.example.demo.DTO.UsuarioRespuesta;
import com.example.demo.Model.EspecialidadEntity;
import com.example.demo.Model.UsuarioEntity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
@RestController
@RequestMapping("/api/especialidades") 
public class EspecialidadController {
    // Aquí puedes agregar los métodos para manejar las solicitudes HTTP
    // por ejemplo, un método para obtener todas las especialidades
    // o un método para crear una nueva especialidad.
    // Puedes usar @GetMapping, @PostMapping, etc. según sea necesario
    @Autowired
    private EspecialidadService especialidadService;
    @GetMapping(value="",produces=MediaType.APPLICATION_JSON_VALUE)
    public List<EspecialidadEntity> getMethodName() {
       return especialidadService.getAllEspecialidades();
    }




}
