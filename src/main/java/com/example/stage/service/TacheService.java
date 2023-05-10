package com.example.stage.service;

import com.example.stage.bean.Collaborateur;
import com.example.stage.bean.Ressource;
import com.example.stage.bean.Tache;
import com.example.stage.dao.TacheDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class TacheService {
    @Autowired
    private TacheDao tacheDao;

    public Tache findByCollaborateur(Collaborateur collaborateur) {
        return tacheDao.findByCollaborateur(collaborateur);
    }
    @Transactional
    public int deleteByCollaborateur(Collaborateur collaborateur) {
        return tacheDao.deleteByCollaborateur(collaborateur);
    }

    public List<Tache> findAll() {
        return tacheDao.findAll();
    }

    public Optional<Tache> findById(Long idTache) {
        return tacheDao.findById(idTache);
    }

    @Transactional
    public void deleteById(Long idTache) {
        tacheDao.deleteById(idTache);
    }
    public int save(Tache tache){
        if (findByCollaborateur(tache.getCollaborateur()) != null) {
            return -1;
        }else{
            tacheDao.save(tache);
            return 1;
        }
    }
}
