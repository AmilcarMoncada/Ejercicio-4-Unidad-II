package hn.unah.lenguajes.ejemplo3.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import hn.unah.lenguajes.ejemplo3.demo.entities.Abonado;

@Repository
public interface AbonadoRepository extends CrudRepository<Abonado, String> {
    
}
