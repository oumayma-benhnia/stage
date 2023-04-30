package com.example.stage.dao;

import com.example.stage.bean.Projet;
import com.example.stage.bean.Remarque;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RemarqueDao extends JpaRepository<Remarque,Long > {
Remarque findByRemarque (String remarque);
int deleteByRemarque (String remarque);



}
