package com.example.stage.service;

import com.example.stage.bean.Projet;
import com.example.stage.dao.ProjetDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class ProjetService {
    @Autowired
private ProjetDao projetDao;
public Projet findByNomProjet (String nomProjet){
    return projetDao.findByNomProjet(nomProjet );
}
@Transactional
public int deleteByNomProjet (String nomProjet){
    return projetDao.deleteByNomProjet(nomProjet);
}
public List< Projet >findAll(){
    return projetDao.findAll();
}
    public int save(Projet projet){
        if (findByNomProjet(projet.getNomProjet()) != null) {
            return -1;
        }else{
           projetDao.save(projet);
            return 1;
        }
    }

    public Optional<Projet> findById(Long id) {
        return projetDao.findById(id);
    }

    public void deleteById(Long id) {
        projetDao.deleteById(id);
    }
}
