package com.example.stage.service;

import com.example.stage.bean.ChefProjet;
import com.example.stage.dao.ChefProjetDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ChefProjetService {
 @Autowired
 private ChefProjetDao chefProjetDao;
 public ChefProjet findByNom (String nom){
  return chefProjetDao.findByNom(nom);
 }
 @Transactional
 public int deleteByNom (String nom){
  return chefProjetDao.deleteByNom(nom);
 }
 public List<ChefProjet> findAll(){ return chefProjetDao.findAll();}




}
