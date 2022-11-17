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
public class Rayon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idRayon;
    private String codeRayon;
    private String libelleRayon;

    @OneToMany(mappedBy = "Rayon")
    private List<Produit> produit;
}
