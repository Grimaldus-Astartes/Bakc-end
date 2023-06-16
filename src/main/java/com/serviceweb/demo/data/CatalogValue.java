package com.serviceweb.demo.data;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "catalog_value")
public class CatalogValue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCatalogValue")
    private Integer idCatalogValue;
    @Column(name = "idCatalog")
    private String  idCatalog;
    @Column(name = "value")
    private String value;

    @Override
    public String toString() {
        return "CatalogValue{" +
                "idCatalogValue=" + idCatalogValue +
                ", idCatalog='" + idCatalog + '\'' +
                ", value='" + value + '\'' +
                '}';
    }

    public int getIdCatalogValue() {
        return idCatalogValue;
    }

    public void setIdCatalogValue(int idCatalogValue) {
        this.idCatalogValue = idCatalogValue;
    }

    public String getIdCatalog() {
        return idCatalog;
    }

    public void setIdCatalog(String idCatalog) {
        this.idCatalog = idCatalog;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
