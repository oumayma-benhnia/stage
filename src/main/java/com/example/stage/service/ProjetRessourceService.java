package com.example.stage.service;

import com.example.stage.bean.Projet;
import com.example.stage.bean.ProjetRessource;
import com.example.stage.bean.Ressource;
import com.example.stage.dao.ProjetRessourceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProjetRessourceService {
    @Autowired
    private ProjetRessourceDao projetRessourceDao;

    private List<ProjetRessource> projetRessources;

    public ProjetRessourceService() {
        projetRessources = new ArrayList<>();
    }

    public ProjetRessource findByProjet(Projet projet) {
        return projetRessourceDao.findByProjet(projet);
    }

    @Transactional
    public int deleteByProjet(Projet projet) {
        return projetRessourceDao.deleteByProjet(projet);
    }

    public List<ProjetRessource> findAll() {
        return projetRessourceDao.findAll();
    }

    public Optional<ProjetRessource> findById(Long id) {
        return projetRessourceDao.findById(id);
    }

    @Transactional
    public void deleteById(Long id) {
        projetRessourceDao.deleteById(id);
    }
    public int save(ProjetRessource projetRessource){
        if (findByProjet(projetRessource.getProjet()) != null) {
            return -1;
        }else{
            projetRessourceDao.save(projetRessource);
            return 1;
        }
    }
    public ProjetRessource getProjetRessourceById(int id) {
        for (ProjetRessource projetRessource : projetRessources) {
            if (projetRessource.getId() == id) {
                return projetRessource;
            }
        }
        return null;
    }


    public void updateProjetRessource(ProjetRessource projetRessource) {
        for (ProjetRessource pr : projetRessources) {
            if (pr.getId() == projetRessource.getId()) {
                pr.setProjet(projetRessource.getProjet());
                pr.setRessource(projetRessource.getRessource());
                pr.setQuantite(projetRessource.getQuantite());
                pr.setPrix(projetRessource.getPrix());
                // Mettre à jour d'autres attributs de ProjetRessource si nécessaire
                break;
            }
        }
    }


    public double calculerMontantTotal(ProjetRessource projetRessource) {
        double quantite = Double.parseDouble(projetRessource.getQuantite());
        double prix = projetRessource.getPrix();
        return quantite * prix;
    }

}
