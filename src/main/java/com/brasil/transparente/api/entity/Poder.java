package com.brasil.transparente.api.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "poder")
public class Poder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long poderId;

    private String namePoder;

    @OneToMany(mappedBy = "poder", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<Ministerio> listMinisterio;

    private double totalValueSpent;

    private double percentageOfTotal;

}
