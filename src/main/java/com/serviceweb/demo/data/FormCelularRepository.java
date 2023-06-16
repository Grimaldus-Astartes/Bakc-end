package com.serviceweb.demo.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FormCelularRepository extends JpaRepository<Celular, Integer> {

}
