package com.example.stage.service;

import com.example.stage.bean.Projet;
import com.example.stage.bean.ProjetRessource;
import com.example.stage.dao.ProjetRessourceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjetRessourceService {
    @Autowired
    private ProjetRessourceDao projetRessourceDao;

    public ProjetRessource findByProjet(Projet projet) {
        return projetRessourceDao.findByProjet(projet);
    }

    public int deleteByProjet(Projet projet) {
        return projetRessourceDao.deleteByProjet(projet);
    }

    public List<ProjetRessource> findAll() {
        return projetRessourceDao.findAll();
    }
}
