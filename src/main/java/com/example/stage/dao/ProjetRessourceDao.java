package com.example.stage.dao;


import com.example.stage.bean.Projet;
import com.example.stage.bean.ProjetRessource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProjetRessourceDao extends JpaRepository<ProjetRessource, Long> {
    ProjetRessource findByProjet(Projet projet);
    int deleteByProjet(Projet projet);
    Optional<ProjetRessource> findById(Long id);
    void deleteById(Long id);
}
