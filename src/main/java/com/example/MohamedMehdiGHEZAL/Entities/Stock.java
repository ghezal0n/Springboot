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
public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idStock;
    private int qteStock;
    private int qteMin;
    private String libelle;

    @OneToMany(mappedBy = "Stock")
    private List<Produit> produit;
}
