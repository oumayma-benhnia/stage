package com.example.stage.dao;

import com.example.stage.bean.Projet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjetDao extends JpaRepository<Projet,Long> {
Projet findByNomProjet(String nomProjet );
int deleteByNomProjet(String nomProjet );



}
