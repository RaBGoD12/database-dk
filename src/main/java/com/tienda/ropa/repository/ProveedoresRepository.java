package com.tienda.ropa.repository;

import com.tienda.ropa.entity.Proveedores;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProveedoresRepository extends JpaRepository<Proveedores, Long> { // se cambió de DistribuidorRepository
    Optional<Proveedores> findByNombre(String nombre);
}
