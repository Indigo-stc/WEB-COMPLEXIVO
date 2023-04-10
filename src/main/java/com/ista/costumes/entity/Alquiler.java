package com.ista.costumes.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "alquiler", uniqueConstraints = @UniqueConstraint(columnNames = {"numAlquiler"}))
public class Alquiler {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAlquiler;
    private String numAlquiler;
    @Temporal(TemporalType.DATE)
    private Date fechaPrestamo;
    @Temporal(TemporalType.DATE)
    private Date fechaDevolucion;
    private String comentario;
    private Long cantidad;
    private Double total;

    // Relations

    @ManyToOne
    @JoinColumn(name = "idCliente", referencedColumnName = "idCliente")
    private Cliente cliente;
    @ManyToOne
    @JoinColumn(name = "idDisfraz", referencedColumnName = "idDisfraz")
    private Disfraz disfraz;

}
