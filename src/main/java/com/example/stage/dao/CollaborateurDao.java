package com.example.stage.dao;

import com.example.stage.bean.Collaborateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CollaborateurDao extends JpaRepository<Collaborateur, Long> {
    Collaborateur findByCode(String code);
    int deleteByCode(String code);
}
