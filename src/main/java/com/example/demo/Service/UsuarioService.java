package com.example.demo.Service;
import java.util.List;
import com.example.demo.Model.UsuarioEntity;

public interface UsuarioService {
    // Aquí puedes definir los métodos que necesitas para el servicio de Usuario
    // Por ejemplo:
    List<UsuarioEntity> getAllUsuarios();
    List<UsuarioEntity> getUsuarioById(long id);
    // @Override crear usuario
    UsuarioEntity crearUsuario(UsuarioEntity usuario);
    void eliminar(Long id);
    // Método para buscar usuario por correo electrónico
    List<UsuarioEntity> FindbyCorreo(String email);
    // Método para buscar usuario por contraseña
    List<UsuarioEntity> findByPassword(String password);
    // Método para validar usuario por correo y contraseña
    UsuarioEntity validarUsuario(String correo, String password);
}