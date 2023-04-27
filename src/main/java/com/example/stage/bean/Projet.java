package com.example.stage.bean;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Projet {
    @Id     @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;
    private String nomProjet ;
    private  String type ;
    private double budget ;
    private String statut ;
    private Date dateDebut ;
    private Date dateFin ;
    private Date dateEstime ;
    @ManyToOne
    private ProjetRessource ressource ;
    @ManyToOne
    private Client client ;
    @ManyToOne
    private ChefProjet chefProjet ;
    public String getNomProjet() {
        return nomProjet;
    }

    public void setNomProjet(String nomProjet) {
        this.nomProjet = nomProjet;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public Date getDateEstime() {
        return dateEstime;
    }

    public void setDateEstime(Date dateEstime) {
        this.dateEstime = dateEstime;
    }


    public ProjetRessource getRessource() {
        return ressource;
    }

    public void setRessource(ProjetRessource ressource) {
        this.ressource = ressource;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public ChefProjet getChefProjet() {
        return chefProjet;
    }

    public void setChefProjet(ChefProjet chefProjet) {
        this.chefProjet = chefProjet;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}

