package com.example.demo.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import org.springframework.stereotype.Service;
import com.example.demo.Model.UsuarioEntity;
import com.example.demo.Service.UsuarioService;
import com.example.demo.Repository.UsuarioDAO;


@Service
public class UsuarioServiceImpl implements UsuarioService {
    // Aquí puedes implementar los métodos definidos en UsuarioService
    // Por ejemplo:
    @Autowired
    private UsuarioDAO usuarioDAO; // Asegúrate de que UsuarioRepository esté correctamente definido e importado
    @Override
    public List<UsuarioEntity> getAllUsuarios() {
        return usuarioDAO.findAll();
    }
    @Override
    public List<UsuarioEntity> getUsuarioById(long id) {
        return usuarioDAO.findById(id);
    }
    // @Override crear usuario
    public UsuarioEntity crearUsuario(UsuarioEntity usuario) {
        return usuarioDAO.save(usuario);
    }
    public void eliminar(Long id) {
        usuarioDAO.deleteById(id);
    }
    public List<UsuarioEntity> FindbyCorreo(String email) {
        return usuarioDAO.findByCorreo(email);
    }
    //findbypassword
    public List<UsuarioEntity> findByPassword(String password) {
        return usuarioDAO.findByPassword(password);
    }
    //override de validar correo y contraseña
    @Override
    public UsuarioEntity validarUsuario(String correo, String password) {
        List<UsuarioEntity> usuarios = usuarioDAO.findByCorreo(correo);
        if (usuarios.isEmpty()) {
            return null; // No se encontró el usuario
        }
        UsuarioEntity usuario = usuarios.get(0);
        if (usuario.getPassword().equals(password)) {
            if (usuario.getRol().equals("paciente")) {
                return usuario;
            }
        }
        return null; // Retorna null si no se cumplen las condiciones
    }
}
