package com.tienda.ropa.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Cliente extends Comprador {
    @Column(unique = true)
    private String dni;

    private String nombre;
    private String apellido;

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}