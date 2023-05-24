package com.example.stage.bean;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Facture {
    @Id     @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id ;
    private String libelle ;
    private String reference ;
    private double montant ;
    @OneToMany
    private List<Paiement> paiements;
    @DateTimeFormat(pattern = "dd/mm/yyyy")
    private Date dateEmission ;
    @DateTimeFormat(pattern = "dd/mm/yyyy")
    private Date dateEcheance ;
    @ManyToOne
    private  Comptable comptable ;

    public Paiement getPaiement() {
        return paiement;
    }

    public void setPaiement(Paiement paiement) {
        this.paiement = paiement;
    }

    @ManyToOne
    private Paiement paiement;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public Date getDateEmission() {
        return dateEmission;
    }

    public void setDateEmission(Date dateEmission) {
        this.dateEmission = dateEmission;
    }

    public Date getDateEcheance() {
        return dateEcheance;
    }

    public void setDateEcheance(Date dateEcheance) {
        this.dateEcheance = dateEcheance;
    }

    public Comptable getComptable() {
        return comptable;
    }

    public void setComptable(Comptable comptable) {
        this.comptable = comptable;
    }



    // Autres attributs et méthodes de la classe Facture

    public List<Paiement> getPaiements() {
        return paiements;
    }

    public void setPaiements(List<Paiement> paiements) {
        this.paiements = paiements;
    }
}
