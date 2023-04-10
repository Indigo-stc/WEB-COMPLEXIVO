package com.ista.costumes.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "disfraz")
public class Disfraz {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDisfraz;
    private String codigo;
    private String descripcion;
    private Double precio;
    private String tipo;

    // Relations
    @OneToMany(mappedBy = "disfraz", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Alquiler> alquileres;

}
