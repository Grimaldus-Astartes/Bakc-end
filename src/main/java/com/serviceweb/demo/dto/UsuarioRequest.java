package com.serviceweb.demo.dto;

public class UsuarioRequest {
    private String nombreUsuario;
    private String password;

    @Override
    public String toString() {
        return "UsuarioRequest{" +
                "nombreUsuario='" + nombreUsuario + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
