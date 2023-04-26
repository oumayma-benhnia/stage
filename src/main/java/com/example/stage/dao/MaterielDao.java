package com.example.stage.dao;

import com.example.stage.bean.Materiel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaterielDao extends JpaRepository<Materiel, Long> {
    Materiel findByReference(String reference);
    int deleteByReference(String reference);
}
