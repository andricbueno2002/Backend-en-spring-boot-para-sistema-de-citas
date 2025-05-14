package com.example.demo.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.EspecialidadEntity;
import com.example.demo.Repository.EspecialidadDAO;
import com.example.demo.Service.EspecialidadService;

@Service
public class EspecialidadServiceImpl implements EspecialidadService {
    // Aquí puedes implementar los métodos definidos en UsuarioService
    // Por ejemplo:
    @Autowired
    private EspecialidadDAO especialidadDAO;// Asegúrate de que UsuarioRepository esté correctamente definido e importado

    @Override
    public List<EspecialidadEntity> getAllEspecialidades() {
        return especialidadDAO.findAll();
    }
    

}
