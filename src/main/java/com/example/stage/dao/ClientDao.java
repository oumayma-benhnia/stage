package com.example.stage.dao;

import com.example.stage.bean.Client;
import com.example.stage.bean.Collaborateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClientDao  extends JpaRepository<Client,Long> {
Client findByNom(String nom);
 int deleteByNom(String nom );
 Optional<Client> findById(Long id);
 void deleteById(Long id);


}
