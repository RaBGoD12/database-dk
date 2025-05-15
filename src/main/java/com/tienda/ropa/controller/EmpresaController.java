package com.tienda.ropa.controller;

import com.tienda.ropa.entity.Empresa;
import com.tienda.ropa.service.RUCService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/rucs")
public class EmpresaController {

    @Autowired
    private RUCService rucService;

    @PostMapping
    public Empresa crearRUC(@RequestBody Empresa ruc) {
        return rucService.agregarRUC(ruc);
    }

    @GetMapping("/{numeroRuc}")
    public Optional<Empresa> obtenerRUCPorNumero(@PathVariable String numeroRuc) {
        return rucService.buscarPorNumeroRUC(numeroRuc);
    }
}