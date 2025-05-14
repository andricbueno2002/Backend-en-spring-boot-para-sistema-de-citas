package com.example.demo.Model;
import java.sql.Date;
import java.util.List;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
@Table(name = "Citas")
public class CitaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "pacienteid", nullable = false)
    private UsuarioEntity paciente; // Relación con UsuarioEntity

    @ManyToOne
    @JoinColumn(name = "medicoid", nullable = false)
    private UsuarioEntity medico; // Relación con EspecialidadEntity

    @Column(name = "Fechahora", length = 100)
    private Date fechaHora;
    //estado de la cita
    @Column(nullable = false, length = 20)
    private String estado; // "Pendiente", "Confirmada", "Cancelada", etc.
    //motivo de la cita
    @Column(nullable = false, length = 255)
    private String motivo; // Motivo de la cita
    


    // Otros atributos y métodos según sea necesario

}
