package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.Service.UsuarioService;

import java.util.Map;

import com.example.demo.DTO.UsuarioRespuesta;
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
@RequestMapping("/api/usuarios") 
public class UsuarioController {
    // Aquí puedes definir los métodos que necesitas para el controlador de Usuario
    // Por ejemplo:
    @Autowired
    private UsuarioService usuarioService; // Asegúrate de que UsuarioService esté correctamente definido e importado
    //metodo get para obtener todos los clientes
    @GetMapping(value="",produces=MediaType.APPLICATION_JSON_VALUE)
    public List<UsuarioEntity> getMethodName() {
       return usuarioService.getAllUsuarios();
    }
    //metodo get para obtener un cliente por id
    @GetMapping(value="/{id}",produces=MediaType.APPLICATION_JSON_VALUE)
    public List<UsuarioEntity> getClienteById(@PathVariable() Long id) {
        return usuarioService.getUsuarioById(id);
    }
    @PostMapping
    public UsuarioEntity crear(@RequestBody UsuarioEntity usuario) {
        return usuarioService.crearUsuario(usuario);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        usuarioService.eliminar(id);
    }
    @GetMapping(value="/correo/{email}",produces=MediaType.APPLICATION_JSON_VALUE)
    public List<UsuarioEntity> getUsuarioByCorreo(@PathVariable String email) {
        return usuarioService.FindbyCorreo(email);
    }
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody Map<String, String> credentials) {
        String correo = credentials.get("correo");
        String password = credentials.get("password");

        UsuarioEntity usuario = usuarioService.validarUsuario(correo, password);
        
        if (usuario != null) {
            UsuarioRespuesta respuesta = new UsuarioRespuesta();
            respuesta.setId(usuario.getId());
            respuesta.setNombre(usuario.getNombre());
            respuesta.setApellido(usuario.getApellido());
            respuesta.setRol(usuario.getRol()); 
            return ResponseEntity.ok(respuesta);
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(null);
        }

    }
}
