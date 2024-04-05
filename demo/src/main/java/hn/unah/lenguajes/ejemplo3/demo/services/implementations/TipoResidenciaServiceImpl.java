package hn.unah.lenguajes.ejemplo3.demo.services.implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes.ejemplo3.demo.entities.TiposResidencia;
import hn.unah.lenguajes.ejemplo3.demo.repositories.TiposResidenciaRepository;
import hn.unah.lenguajes.ejemplo3.demo.services.TipoResidenciaService;

@Service
public class TipoResidenciaServiceImpl implements TipoResidenciaService {

@Autowired
private TiposResidenciaRepository tiposResidenciaRepository;


    @Override
    public TiposResidencia CrearResidencia(TiposResidencia tiposResidencia) {
        return this.tiposResidenciaRepository.save(tiposResidencia);
    }
    
}
