package hn.unah.lenguajes.ejemplo3.demo.entities;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="facturacion")
public class Facturacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idfacturacion")
    private int idFacturacion;

    @Column(name="fechafacturacion")
    private LocalDate fechaFacturacion;
    
    @ManyToOne
    @JoinColumn(name ="dni", referencedColumnName = "dni")
    @JsonBackReference
    private Abonado abonados;

    @Column(name="kwsconsumidos")
    private Double kwsConsumidos;

    @Column(name="totalfacturacion")
    private Double TotalFacturacion;
}

