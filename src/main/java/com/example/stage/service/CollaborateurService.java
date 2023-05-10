package com.example.stage.service;

import com.example.stage.bean.Collaborateur;

import com.example.stage.dao.CollaborateurDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

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

    public Optional<Collaborateur> findById(Long id) {
        return collaborateurDao.findById(id);
    }

    @Transactional
    public void deleteById(Long id) {
        collaborateurDao.deleteById(id);
    }
    public int save(Collaborateur collaborateur){
        if (findByCode(collaborateur.getCode()) != null) {
            return -1;
        }else{
            collaborateurDao.save(collaborateur);
            return 1;
        }
    }
}
