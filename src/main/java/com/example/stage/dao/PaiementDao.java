package com.example.stage.dao;

import com.example.stage.bean.Facture;
import com.example.stage.bean.Paiement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaiementDao extends JpaRepository<Paiement ,Long> {
Paiement findByFacture(Facture facture);
int deleteByFacture(Facture facture );



}
