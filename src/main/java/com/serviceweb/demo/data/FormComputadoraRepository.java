package com.serviceweb.demo.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormComputadoraRepository extends JpaRepository<Computadora, Integer> {
}
