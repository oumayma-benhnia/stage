package com.example.stage.dao;

import com.example.stage.bean.Projet;
import com.example.stage.bean.ProjetRessource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjetRessourceDao extends JpaRepository<ProjetRessource, Long> {
    ProjetRessource findByProjet(Projet projet);
    int deleteByProjet(Projet projet);
}
