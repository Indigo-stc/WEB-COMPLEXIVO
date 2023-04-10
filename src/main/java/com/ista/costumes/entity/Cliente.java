package com.ista.costumes.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "cliente", uniqueConstraints = @UniqueConstraint(columnNames = {"cedula"}))
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCliente;
    @Pattern(regexp = "^[0-9]{10}$", message = "Please enter exactly 10 numbers")
    private String cedula;
    @NotEmpty(message = "Campo Obligatorio")
    private String nombre;
    @NotEmpty(message = "Campo Obligatorio")
    private String apellido;
    @NotEmpty(message = "Campo Obligatorio")
    private String direccion;
    @Column(columnDefinition = "BOOLEAN DEFAULT true")
    private Boolean estado;

    // Relations
    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Alquiler> alquileres;

}
