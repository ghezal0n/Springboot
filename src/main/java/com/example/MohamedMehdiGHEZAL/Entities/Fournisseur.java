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
public class Fournisseur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long idFournisseur;
    private String codeFournisseur;
    private String libelleFournisseur;

    @ManyToMany(mappedBy = "fournisseur")
    private List<Produit> produit;
}
