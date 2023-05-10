package com.example.stage.dao;

import com.example.stage.bean.Collaborateur;
import com.example.stage.bean.Fournisseur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FournisseurDao extends JpaRepository<Fournisseur, Long> {
    Fournisseur findBySociete(String societe);
    int deleteBySociete(String societe);
    Optional<Fournisseur> findById(Long id);
    void deleteById(Long id);
}
