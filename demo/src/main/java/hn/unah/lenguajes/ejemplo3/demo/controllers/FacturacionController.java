package hn.unah.lenguajes.ejemplo3.demo.controllers;

import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes.ejemplo3.demo.entities.Facturacion;
import hn.unah.lenguajes.ejemplo3.demo.services.implementations.FacturacionServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api")
public class FacturacionController {
    
    @Autowired
    private FacturacionServiceImpl facturacionServiceImpl;

    @PostMapping("/facturacion/crear")
    public Facturacion CrearFacturacion(@RequestBody Facturacion facturacion) {
        return this.facturacionServiceImpl.CrearFacturacion(facturacion);
    }
    
}
