package com.serviceweb.demo.data;

import jakarta.persistence.*;

import javax.annotation.processing.Generated;

@Entity
@Table(name = "form_computadora")
public class Computadora {
    @Id
    @Column(name = "idFormComputadora")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idFormComputadora;
    @ManyToOne
    @JoinColumn(name = "idEmpresa")
    private CatalogValue idEmpresa;
    @ManyToOne
    @JoinColumn(name = "idTelefonoAsignado")
    private CatalogValue idTelefonoAsignado;
    @Column(name = "nombreUsuario")
    private String nombreUsuario;
    @ManyToOne
    @JoinColumn(name = "idRegion")
    private CatalogValue idRegion;
    @ManyToOne
    @JoinColumn(name = "idLocalidad")
    private CatalogValue idLocalidad;
    @ManyToOne
    @JoinColumn(name = "idArea")
    private CatalogValue idArea;
    @ManyToOne
    @JoinColumn(name = "idEquipo")
    private CatalogValue idEquipo;
    @Column(name = "modelo")
    private String modelo;

    @Override
    public String toString() {
        return "Computadora{" +
                "\nidFormComputadora=" + idFormComputadora +
                ",\n idEmpresa=" + idEmpresa +
                ",\n idTelefonoAsignado=" + idTelefonoAsignado +
                ",\n nombreUsuario='" + nombreUsuario + '\'' +
                ",\n idRegion=" + idRegion +
                ",\n idLocalidad=" + idLocalidad +
                ",\n idArea=" + idArea +
                ",\n idEquipo=" + idEquipo +
                ",\n modelo='" + modelo + '\'' +
                '}';
    }

    public int getIdFormComputadora() {
        return idFormComputadora;
    }

    public void setIdFormComputadora(int idFormComputadora) {
        this.idFormComputadora = idFormComputadora;
    }

    public CatalogValue getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(CatalogValue idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public CatalogValue getIdTelefonoAsignado() {
        return idTelefonoAsignado;
    }

    public void setIdTelefonoAsignado(CatalogValue idTelefonoAsignado) {
        this.idTelefonoAsignado = idTelefonoAsignado;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public CatalogValue getIdRegion() {
        return idRegion;
    }

    public void setIdRegion(CatalogValue idRegion) {
        this.idRegion = idRegion;
    }

    public CatalogValue getIdLocalidad() {
        return idLocalidad;
    }

    public void setIdLocalidad(CatalogValue idLocalidad) {
        this.idLocalidad = idLocalidad;
    }

    public CatalogValue getIdArea() {
        return idArea;
    }

    public void setIdArea(CatalogValue idArea) {
        this.idArea = idArea;
    }

    public CatalogValue getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(CatalogValue idEquipo) {
        this.idEquipo = idEquipo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
