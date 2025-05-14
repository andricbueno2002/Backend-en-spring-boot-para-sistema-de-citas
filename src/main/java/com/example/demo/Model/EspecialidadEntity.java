package com.example.demo.Model;

import java.util.List;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
@Table(name = "Especialidades")
public class EspecialidadEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String nombre;
    @OneToMany(mappedBy = "especialidad",cascade = CascadeType.ALL)
    private List<UsuarioEntity> usuarios; // Relación con UsuarioEntity (si es necesario)

    
}
