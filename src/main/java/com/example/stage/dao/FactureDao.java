package com.example.stage.dao;

import com.example.stage.bean.Facture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FactureDao extends JpaRepository<Facture,Long> {
Facture findByReference (String reference );
int deleteByReference(String reference);



}
