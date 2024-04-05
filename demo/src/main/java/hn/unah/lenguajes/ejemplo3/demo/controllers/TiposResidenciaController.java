package hn.unah.lenguajes.ejemplo3.demo.controllers;

import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes.ejemplo3.demo.entities.TiposResidencia;
import hn.unah.lenguajes.ejemplo3.demo.services.implementations.TipoResidenciaServiceImpl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api")
public class TiposResidenciaController {
    
@Autowired
private TipoResidenciaServiceImpl tipoResidenciaServiceImpl;
    
    @PostMapping("/residencia/crear")
    public TiposResidencia CrearResidencia(@RequestBody TiposResidencia tiposResidencia) {
    return this.tipoResidenciaServiceImpl.CrearResidencia(tiposResidencia);
    }
    
}
