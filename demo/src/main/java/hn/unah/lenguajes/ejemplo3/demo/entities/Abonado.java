package hn.unah.lenguajes.ejemplo3.demo.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table (name="abonado")
public class Abonado {
    
    @Id
    private String dni;

    private String nombre;

    private String apellido;

    private String telefono;

    @OneToOne
    @JoinColumn(name="idtiporesidencia", referencedColumnName = "idtiporesidencia")
    private TiposResidencia tiposResidencia;

    @OneToMany(mappedBy = "abonados", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Facturacion> facturacion;

}
