package hn.unah.lenguajes.ejemplo3.demo.controllers;

import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes.ejemplo3.demo.entities.Abonado;
import hn.unah.lenguajes.ejemplo3.demo.services.implementations.AbonadoServiceImpl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api")
public class AbonadoController {
    
@Autowired
private AbonadoServiceImpl abonadoServiceImpl;

    @PostMapping("/abonado/crear")
    public Abonado CrearAbonado(@RequestBody Abonado abonado){
        return this.abonadoServiceImpl.CrearAbonado(abonado);
    }

    @DeleteMapping("/abonado/eliminar/{id}")
    public String EliminarAbonado(@PathVariable String dni){
        return this.abonadoServiceImpl.EliminarAbonado(dni);
    }

    @GetMapping("/abonado/obtener")
    public Abonado ObtenerAbonado(@RequestParam String dni) {
        return this.abonadoServiceImpl.ObtenerAbonado(dni);
    }
    
    
}
