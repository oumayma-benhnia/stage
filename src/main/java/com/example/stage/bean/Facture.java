package com.example.stage.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Facture {
    @Id
    oumayma-benhnia/stage
    private Long id ;
    private String libelle ;
    private String reference ;
    private double montant ;
    private Date dateEmission ;
}
