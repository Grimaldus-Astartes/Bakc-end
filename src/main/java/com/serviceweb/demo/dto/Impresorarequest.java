package com.serviceweb.demo.dto;

public class Impresorarequest {
    private int idFormImpreVideo;
    private int idEmpresa;
    private int idTelefonoAsignado;
    private String nombreUsuario;
    private int idRegion;
    private int idLocalidad;
    private int idArea;
    private int idEquipo;

    @Override
    public String toString() {
        return "Impresorarequest{" +
                "idFormImpreVideo=" + idFormImpreVideo +
                ", idEmpresa=" + idEmpresa +
                ", idTelefonoAsignado=" + idTelefonoAsignado +
                ", nombreUsuario='" + nombreUsuario + '\'' +
                ", idRegion=" + idRegion +
                ", idLocalidad=" + idLocalidad +
                ", idArea=" + idArea +
                ", idEquipo=" + idEquipo +
                '}';
    }

    public int getIdFormImpreVideo() {
        return idFormImpreVideo;
    }

    public void setIdFormImpreVideo(int idFormImpreVideo) {
        this.idFormImpreVideo = idFormImpreVideo;
    }

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public int getIdTelefonoAsignado() {
        return idTelefonoAsignado;
    }

    public void setIdTelefonoAsignado(int idTelefonoAsignado) {
        this.idTelefonoAsignado = idTelefonoAsignado;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public int getIdRegion() {
        return idRegion;
    }

    public void setIdRegion(int idRegion) {
        this.idRegion = idRegion;
    }

    public int getIdLocalidad() {
        return idLocalidad;
    }

    public void setIdLocalidad(int idLocalidad) {
        this.idLocalidad = idLocalidad;
    }

    public int getIdArea() {
        return idArea;
    }

    public void setIdArea(int idArea) {
        this.idArea = idArea;
    }

    public int getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(int idEquipo) {
        this.idEquipo = idEquipo;
    }
}
