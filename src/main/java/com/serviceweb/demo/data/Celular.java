package com.serviceweb.demo.data;

import jakarta.persistence.*;


@Entity
@Table(name = "form_celular")
public class Celular {
    @Id
    @Column(name = "idFormCelular")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idFormCelular;
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
    private String modelo;

    @Override
    public String toString() {
        return "Celular{" +
                "idFormCelular=" + idFormCelular +
                ", idEmpresa=" + idEmpresa +
                ", idTelefonoAsignado=" + idTelefonoAsignado +
                ", nombreUsuario='" + nombreUsuario + '\'' +
                ", idRegion=" + idRegion +
                ", idLocalidad=" + idLocalidad +
                ", idArea=" + idArea +
                ", idEquipo=" + idEquipo +
                ", modelo='" + modelo + '\'' +
                '}';
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getIdFormCelular() {
        return idFormCelular;
    }

    public void setIdFormCelular(int idFormCelular) {
        this.idFormCelular = idFormCelular;
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
}
