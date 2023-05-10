package com.example.stage.dao;


import com.example.stage.bean.Ressource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RessourceDao extends JpaRepository<Ressource, Long> {
    Ressource findByType(String type);
    int deleteByType(String type);
    Optional<Ressource> findById(Long id);
    void deleteById(Long id);
}
