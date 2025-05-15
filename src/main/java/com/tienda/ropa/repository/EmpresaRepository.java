package com.tienda.ropa.repository;

import com.tienda.ropa.entity.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
    Optional<Empresa> findByNumeroRuc(String numeroRuc);
}

