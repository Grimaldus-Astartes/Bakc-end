package com.serviceweb.demo.data;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface CatalogRepository extends JpaRepository<CatalogValue, Integer> {
    Optional<CatalogValue> findByIdCatalogValueAndIdCatalog(Integer idCatalogValue, String idCatalog);
}
