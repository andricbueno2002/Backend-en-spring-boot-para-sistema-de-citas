package com.example.demo.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.CitaEntity;
import com.example.demo.Repository.CitasDAO;
import com.example.demo.Service.CitasService;
@Service
public class CitasServiceImpl implements CitasService {
    // Inyección de dependencias
    @Autowired
    private CitasDAO citasDAO; // Asegúrate de que CitasDAO esté correctamente definido e importado
    @Override
    public List<CitaEntity> getAllCitas() {
        return citasDAO.findAll();
    }
    

    
}
