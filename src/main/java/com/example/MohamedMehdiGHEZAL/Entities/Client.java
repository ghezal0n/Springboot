package com.example.MohamedMehdiGHEZAL.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idClient;
    private String nom;
    private String prenom;
    private Date dateNaissance;
    private String email;
    private String password;

    @Enumerated(EnumType.STRING)
    CategorieClient categorieClient;

    @Enumerated(EnumType.STRING)
    Profession profession;

    @OneToMany (mappedBy = "client")
    private List<Facture> facture;

}
