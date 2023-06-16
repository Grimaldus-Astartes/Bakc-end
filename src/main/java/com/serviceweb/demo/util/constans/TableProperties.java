package com.serviceweb.demo.util.constans;

public enum TableProperties {
    EMPRESA("idEmpresa"),
    TELEFONO("idTelefonoAsignado"),
    USUARIO("nombreUsuario"),
    REGION("idRegion"),
    LOCALIDAD("idLocalidad"),
    AREA("idArea"),
    EQUIPO("idEquipo"),
    MODELO("modelo");
    final String label;

    TableProperties(java.lang.String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
