package com.example.stage.service;

import com.example.stage.bean.Collaborateur;
import com.example.stage.dao.CollaborateurDao;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollaborateurService {
    @Autowired
    private CollaborateurDao collaborateurDao;

    public Collaborateur findByCode(String code) {
        return collaborateurDao.findByCode(code);
    }

    @Transactional
    public int deleteByCode(String code) {
        return collaborateurDao.deleteByCode(code);
    }

    public List<Collaborateur> findAll() {
        return collaborateurDao.findAll();
    }
}
