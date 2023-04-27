package com.example.stage.service;

import com.example.stage.bean.Materiel;
import com.example.stage.dao.MaterielDao;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
}
