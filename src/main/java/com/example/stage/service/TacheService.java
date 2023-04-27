package com.example.stage.service;

import com.example.stage.bean.Collaborateur;
import com.example.stage.bean.Tache;
import com.example.stage.dao.TacheDao;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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


}
