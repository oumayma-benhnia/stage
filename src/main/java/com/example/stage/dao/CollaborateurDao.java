package com.example.stage.dao;

import com.example.stage.bean.Collaborateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CollaborateurDao extends JpaRepository<Collaborateur, Long> {
    Collaborateur findByCode(String code);
    int deleteByCode(String code);
    Optional<Collaborateur> findById(Long id);
    void deleteById(Long id);
}
