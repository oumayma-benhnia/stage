package com.example.stage.bean;



import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Tache {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idTache;
    private String nom;
    private String description;
    @DateTimeFormat(pattern = "dd/mm/yyyy")
    private Date date_debut;
    @DateTimeFormat(pattern = "dd/mm/yyyy")
    private Date date_fin;
    @DateTimeFormat(pattern = "dd/mm/yyyy")
    private Date duree;
    @ManyToOne
    private Collaborateur collaborateur;

    public Long getIdTache() {
        return idTache;
    }

    public void setIdTache(Long idTache) {
        this.idTache = idTache;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate_debut() {
        return date_debut;
    }

    public void setDate_debut(Date date_debut) {
        this.date_debut = date_debut;
    }

    public Date getDate_fin() {
        return date_fin;
    }

    public void setDate_fin(Date date_fin) {
        this.date_fin = date_fin;
    }

    public Date getDuree() {
        return duree;
    }

    public void setDuree(Date duree) {
        this.duree = duree;
    }

    public Collaborateur getCollaborateur() {
        return collaborateur;
    }

    public void setCollaborateur(Collaborateur collaborateur) {
        this.collaborateur = collaborateur;
    }
}
