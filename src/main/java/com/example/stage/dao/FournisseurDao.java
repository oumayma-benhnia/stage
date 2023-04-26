package com.example.stage.dao;

import com.example.stage.bean.Fournisseur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FournisseurDao extends JpaRepository<Fournisseur, Long> {
    Fournisseur findBySociete(String societe);
    int deleteBySociete(String societe);
}
