package com.example.stage.dao;

import com.example.stage.bean.Ressource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RessourceDao extends JpaRepository<Ressource, Long> {
    Ressource findByType(String type);
    int deleteByType(String type);
}
