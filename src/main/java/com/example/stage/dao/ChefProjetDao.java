package com.example.stage.dao;

import com.example.stage.bean.ChefProjet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChefProjetDao extends JpaRepository<ChefProjet,Long> {
ChefProjet findByNom(String nom );
int deleteByNom(String nom);


}
