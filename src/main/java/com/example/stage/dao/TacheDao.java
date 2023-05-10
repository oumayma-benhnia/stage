package com.example.stage.dao;

import com.example.stage.bean.Collaborateur;
import com.example.stage.bean.Ressource;
import com.example.stage.bean.Tache;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TacheDao extends JpaRepository<Tache, Long> {
    Tache findByCollaborateur(Collaborateur collaborateur);
    int deleteByCollaborateur(Collaborateur collaborateur);
    Optional<Tache> findById(Long idTache);
    void deleteById(Long idTache);
}
