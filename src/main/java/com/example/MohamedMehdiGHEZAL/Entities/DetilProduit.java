package com.example.MohamedMehdiGHEZAL.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class DetilProduit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idDetailProduit;
    private Date dateCreation;
    private Date dateDerniereModification;

    @Enumerated(EnumType.STRING)
    CategorieProduit categorieProduit;

    @ManyToOne
    private Produit prodiut;


}
