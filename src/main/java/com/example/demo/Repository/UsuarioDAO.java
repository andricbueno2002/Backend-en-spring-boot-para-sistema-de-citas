package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.UsuarioEntity;

@Repository

public interface UsuarioDAO extends JpaRepository<UsuarioEntity, Long> {
    // Aquí puedes agregar métodos personalizados si es necesario

    //JPQL
    List<UsuarioEntity> findByNombreContains(String parametro);

    //metodo con native query
    @Query(value = "Select * from usuario where nombre like %:parametro%",nativeQuery=true)
    List<UsuarioEntity> nombreContiene(String parametro);
    List<UsuarioEntity> findById(long parametro);
    List<UsuarioEntity> findByCorreo(String parametro);
    List<UsuarioEntity> findByPassword(String parametro);
    //crear usuario

    
}
