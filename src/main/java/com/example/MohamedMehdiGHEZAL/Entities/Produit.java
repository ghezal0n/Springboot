package com.example.MohamedMehdiGHEZAL.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idProduit;
    private String codeProduit;
    private String libelleProduit;
    private float prixUnitaire;

    @OneToOne
    private DetilProduit detailProduit;

    @ManyToOne
    private Stock stock;

    @ManyToOne
    private Rayon rayon;

    @ManyToMany
    private List<Fournisseur> fournisseur;

    @OneToMany(mappedBy = "produit")
    private List<DetailFacture> detailFactures;

}
