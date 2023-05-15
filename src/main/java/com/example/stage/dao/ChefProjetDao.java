package com.example.stage.dao;

import com.example.stage.bean.ChefProjet;
import com.example.stage.bean.Collaborateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ChefProjetDao extends JpaRepository<ChefProjet,Long> {
ChefProjet findByNom(String nom );
int deleteByNom(String nom);
    Optional<ChefProjet> findById(Long id);
    void deleteById(Long id);

}
