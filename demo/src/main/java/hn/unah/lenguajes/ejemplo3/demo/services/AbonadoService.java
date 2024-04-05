package hn.unah.lenguajes.ejemplo3.demo.services;

import hn.unah.lenguajes.ejemplo3.demo.entities.Abonado;

public interface AbonadoService {
    
    public Abonado CrearAbonado (Abonado abonado);
    
    public String EliminarAbonado(String dni);

    public Abonado ObtenerAbonado(String dni);
    
}
