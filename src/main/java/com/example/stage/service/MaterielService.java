package com.example.stage.service;

import com.example.stage.bean.Materiel;
import com.example.stage.bean.Ressource;
import com.example.stage.dao.MaterielDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class MaterielService {
    @Autowired
    private MaterielDao materielDao;

    public Materiel findByReference(String reference) {
        return materielDao.findByReference(reference);
    }

    @Transactional
    public int deleteByReference(String reference) {
        return materielDao.deleteByReference(reference);
    }

    public List<Materiel> findAll() {
        return materielDao.findAll();
    }

    public Optional<Materiel> findById(Long id) {
        return materielDao.findById(id);
    }

    @Transactional
    public void deleteById(Long id) {
        materielDao.deleteById(id);
    }
    public int save(Materiel materiel){
        if (findByReference(materiel.getReference()) != null) {
            return -1;
        }else{
            materielDao.save(materiel);
            return 1;
        }
    }
}
