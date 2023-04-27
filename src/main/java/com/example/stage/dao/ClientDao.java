package com.example.stage.dao;

import com.example.stage.bean.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientDao  extends JpaRepository<Client,Long> {
Client findByNom(String nom);
 int deleteByNom(String nom );



}
