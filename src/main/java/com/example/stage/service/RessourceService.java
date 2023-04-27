package com.example.stage.service;

import com.example.stage.bean.Ressource;
import com.example.stage.dao.RessourceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RessourceService {
    @Autowired
    private RessourceDao ressourceDao;

    public Ressource findByType(String type) {
        return ressourceDao.findByType(type);
    }

    public int deleteByType(String type) {
        return ressourceDao.deleteByType(type);
    }

    public List<Ressource> findAll() {
        return ressourceDao.findAll();
    }
}