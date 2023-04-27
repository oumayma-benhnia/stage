package com.example.stage.bean;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Projet {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;
    private String nomProjet ;
    private  String type ;
    private double budget ;
    private String statut ;
    @DateTimeFormat(pattern = "dd/mm/yyyy")
    private Date dateDebut ;
    @DateTimeFormat(pattern = "dd/mm/yyyy")
    private Date dateFin ;
    @DateTimeFormat(pattern = "dd/mm/yyyy")
    private Date dateEstime ;

    @ManyToMany
    private List<ProjetRessource> projetRessources;
    @ManyToOne
    private Client client ;

    public List<ProjetRessource> getProjetRessources() {
        return projetRessources;
    }

    public void setProjetRessources(List<ProjetRessource> projetRessources) {
        this.projetRessources = projetRessources;
    }

    @ManyToOne
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
