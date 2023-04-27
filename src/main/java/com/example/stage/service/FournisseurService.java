package com.example.stage.service;

import com.example.stage.bean.Fournisseur;
import com.example.stage.dao.FournisseurDao;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
}
