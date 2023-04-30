package com.example.stage.service;

import com.example.stage.bean.Projet;
import com.example.stage.bean.Remarque;
import com.example.stage.dao.RemarqueDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class RemaqueService {
    @Autowired
    private RemarqueDao remarqueDao;

    public Remarque findByProjets(Projet projet) {
        return remarqueDao.findByProjets(projet);
    }
@Transactional
    public int deleteByProjets(Projet projet) {
        return remarqueDao.deleteByProjets(projet);
    }

    public List<Remarque> findAll() {
        return remarqueDao.findAll();
    }
}
