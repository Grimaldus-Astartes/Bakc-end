package com.serviceweb.demo.dto;

public class LoginResponse {
    private String nombreUsuario;
    private String nombre;
    private String Appellido;

    @Override
    public String toString() {
        return "LoginResponse{" +
                "nombreUsuario='" + nombreUsuario + '\'' +
                ", nombre='" + nombre + '\'' +
                ", Appellido='" + Appellido + '\'' +
                '}';
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAppellido() {
        return Appellido;
    }

    public void setAppellido(String appellido) {
        Appellido = appellido;
    }
}
