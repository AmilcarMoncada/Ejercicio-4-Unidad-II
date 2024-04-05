package hn.unah.lenguajes.ejemplo3.demo.services.implementations;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes.ejemplo3.demo.entities.Abonado;
import hn.unah.lenguajes.ejemplo3.demo.entities.Facturacion;
import hn.unah.lenguajes.ejemplo3.demo.entities.TiposResidencia;
import hn.unah.lenguajes.ejemplo3.demo.services.FacturacionService;
import hn.unah.lenguajes.ejemplo3.demo.repositories.FacturacionRepository;

@Service
public class FacturacionServiceImpl implements FacturacionService{

@Autowired
private FacturacionRepository FacturacionRepository;


    @Override
    public Facturacion CrearFacturacion(Facturacion facturacion) {
       Facturacion FacturacionCorrespondiente = this.FacturacionRepository.save(facturacion);
        Abonado AbonadoCorrespondiente =FacturacionCorrespondiente.getAbonados();
        TiposResidencia ResidenciaCorrespondiente= AbonadoCorrespondiente.getTiposResidencia();
        FacturacionCorrespondiente.setFechaFacturacion(LocalDate.now());
        FacturacionCorrespondiente.setTotalFacturacion(FacturacionCorrespondiente.getKwsConsumidos()*ResidenciaCorrespondiente.getPrecioKw());
        return this.FacturacionRepository.save(FacturacionCorrespondiente);
    }
    
}
