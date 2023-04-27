package com.example.stage.bean;

import javax.persistence.Entity;
import java.util.Date;

@Entity
public class Projet {
    private Long id ;
    private String nomProjet ;
    private  String type ;
    private double budget ;
    private String statut ;
    private Date dateDebut ;
    private Date dateFin ;
    private Date dateEstime ;
    private ProjetResource resource ;
    private Client client ;
    private ChefProjet chefProjet ;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public ProjetResource getResource() {
        return resource;
    }

    public void setResource(ProjetResource resource) {
        this.resource = resource;
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
}
