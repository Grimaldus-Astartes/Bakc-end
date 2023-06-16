package com.serviceweb.demo.data;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "form_impre_video")
public class Impresora {
    @Id
    @Column(name = "idFormImpreVideo")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idFormImpreVideo;
    @ManyToOne
    @JoinColumn(name = "idEmpresa", referencedColumnName = "idCatalogValue")
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

    @Override
    public String toString() {
        return "Impresora{" +
                "\nidFormImpreVideo=" + idFormImpreVideo +
                ",\n idEmpresa=" + idEmpresa +
                ",\n idTelefonoAsignado=" + idTelefonoAsignado +
                ",\n nombreUsuario='" + nombreUsuario + '\'' +
                ",\n idRegion=" + idRegion +
                ",\n idLocalidad=" + idLocalidad +
                ",\n idArea=" + idArea +
                ",\n idEquipo=" + idEquipo +
                '}';
    }

    public int getIdFormImpreVideo() {
        return idFormImpreVideo;
    }

    public void setIdFormImpreVideo(int idFormImpreVideo) {
        this.idFormImpreVideo = idFormImpreVideo;
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
