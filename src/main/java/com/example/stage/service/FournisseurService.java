package com.example.stage.service;

import com.example.stage.bean.Fournisseur;
import com.example.stage.bean.Ressource;
import com.example.stage.dao.FournisseurDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class FournisseurService {
    @Autowired
    private FournisseurDao fournisseurDao;

    public Fournisseur findBySociete(String societe) {
        return fournisseurDao.findBySociete(societe);
    }

    @Transactional
    public int deleteBySociete(String societe) {
        return fournisseurDao.deleteBySociete(societe);
    }

    public List<Fournisseur> findAll() {
        return fournisseurDao.findAll();
    }

    public Optional<Fournisseur> findById(Long id) {
        return fournisseurDao.findById(id);
    }

    @Transactional
    public void deleteById(Long id) {
        fournisseurDao.deleteById(id);
    }
    public int save(Fournisseur fournisseur){
        if (findBySociete(fournisseur.getSociete()) != null) {
            return -1;
        }else{
            fournisseurDao.save(fournisseur);
            return 1;
        }
    }
}
