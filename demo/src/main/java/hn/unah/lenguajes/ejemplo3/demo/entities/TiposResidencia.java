package hn.unah.lenguajes.ejemplo3.demo.entities;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="tiposresidencia")
public class TiposResidencia {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idtiporesidencia")
    private int idTipoResidencia;

    private String descripcion;
    
    @Column(name="preciokw")
    private Double precioKw;

    @OneToOne(mappedBy = "tiposResidencia")
    private Abonado abonado;

}
