package com.example.stage.dao;

import com.example.stage.bean.Collaborateur;
import com.example.stage.bean.Projet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProjetDao extends JpaRepository<Projet,Long> {
Projet findByNomProjet(String nomProjet );
int deleteByNomProjet(String nomProjet );
    Optional<Projet> findById(Long id);
    void deleteById(Long id);

}
