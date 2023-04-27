package com.example.stage.bean;



import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Remarque {
    @Id     @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;
    @DateTimeFormat(pattern = "dd/mm/yyyy")
    private Date dateTime ;
    private String remarque ;
    @OneToMany
    private List<Projet> projets ;

    public List<Projet> getProjets() {
        return projets;
    }

    public void setProjets(List<Projet> projets) {
        this.projets = projets;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public String getRemarque() {
        return remarque;
    }

    public void setRemarque(String remarque) {
        this.remarque = remarque;
    }
}
