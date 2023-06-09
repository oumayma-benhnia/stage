package com.example.stage.service;

import com.example.stage.bean.ChefProjet;
import com.example.stage.dao.ChefProjetDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

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

 public Optional<ChefProjet> findById(Long id) {
  return chefProjetDao.findById(id);
 }

 public void deleteById(Long id) {
  chefProjetDao.deleteById(id);
 }

 public int save(ChefProjet chefProjet){
  if (findByNom(chefProjet.getNom()) != null) {
   return -1;
  }else{
   chefProjetDao.save(chefProjet);
   return 1;
  }

 }



}
