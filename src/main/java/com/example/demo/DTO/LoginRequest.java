package com.example.demo.DTO;

public class LoginRequest {
    private String correo;
    private String password;

    // Getters y setters
    public String getEmail() {
        return correo;
    }

    public void setEmail(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
