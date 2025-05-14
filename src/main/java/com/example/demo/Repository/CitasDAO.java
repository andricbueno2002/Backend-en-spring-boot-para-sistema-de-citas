package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.CitaEntity;

public interface CitasDAO extends JpaRepository<CitaEntity, Long> {


    
}
