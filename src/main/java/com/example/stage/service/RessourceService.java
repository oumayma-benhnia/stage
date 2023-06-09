package com.example.stage.service;

import com.example.stage.bean.Ressource;
import com.example.stage.dao.RessourceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class RessourceService {
    @Autowired
    private RessourceDao ressourceDao;

    public Ressource findByType(String type) {
        return ressourceDao.findByType(type);
    }
    @Transactional
    public int deleteByType(String type) {
        return ressourceDao.deleteByType(type);
    }

    public List<Ressource> findAll() {
        return ressourceDao.findAll();
    }

    public Optional<Ressource> findById(Long id) {
        return ressourceDao.findById(id);
    }

    @Transactional
    public void deleteById(Long id) {
        ressourceDao.deleteById(id);
    }

    public int save(Ressource ressource){
        if (findByType(ressource.getType()) != null) {
            return -1;
        }else{
            ressourceDao.save(ressource);
            return 1;
        }
    }
}
