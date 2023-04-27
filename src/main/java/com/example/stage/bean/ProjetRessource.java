package com.example.stage.bean;

import javax.persistence.*;
import java.util.List;
@Entity

public class ProjetRessource {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String quantite;
    private double prix;
    @ManyToOne
    private Projet projet;
    @ManyToMany
    private List<Ressource> ressources;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuantite() {
        return quantite;
    }

    public void setQuantite(String quantite) {
        this.quantite = quantite;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public Projet getProjet() {
        return projet;
    }

    public void setProjet(Projet projet) {
        this.projet = projet;
    }

    public List<Ressource> getRessource() {
        return ressources;
    }

    public void setRessource(List<Ressource> ressources) {
        this.ressources = ressources;
    }
}
