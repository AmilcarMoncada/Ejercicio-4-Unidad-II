package hn.unah.lenguajes.ejemplo3.demo.services.implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes.ejemplo3.demo.entities.Abonado;
import hn.unah.lenguajes.ejemplo3.demo.repositories.AbonadoRepository;
import hn.unah.lenguajes.ejemplo3.demo.repositories.TiposResidenciaRepository;
import hn.unah.lenguajes.ejemplo3.demo.services.AbonadoService;

@Service
public class AbonadoServiceImpl implements AbonadoService {

@Autowired
private AbonadoRepository abonadoRepository;

@Autowired 
private TiposResidenciaRepository tiposResidenciaRepository;


    @Override
    public Abonado CrearAbonado(Abonado abonado) {
     Abonado abonado2= this.abonadoRepository.save(abonado);
    int idAbonado = abonado2.getTiposResidencia().getIdTipoResidencia();
abonado2.setTiposResidencia(this.tiposResidenciaRepository.findById(idAbonado).get());
    return this.abonadoRepository.save(abonado2);    
    }

    @Override
    public String EliminarAbonado(String dni) {
       this.abonadoRepository.deleteById(dni);
       return "Abonado eliminado correctamente";
    }

    @Override
    public Abonado ObtenerAbonado(String dni) {
    return this.abonadoRepository.findById(dni).get();    
    }
    
}
