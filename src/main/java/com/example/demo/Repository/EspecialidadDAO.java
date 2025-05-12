package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.EspecialidadEntity;

@Repository
public interface EspecialidadDAO extends JpaRepository<EspecialidadEntity, Long> {

    // Aquí puedes agregar métodos personalizados si es necesario
    //JPQL
    List<EspecialidadDAO> findByNombreContains(String parametro);




    
}
