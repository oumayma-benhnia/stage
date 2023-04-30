package com.example.stage.service;

import com.example.stage.bean.Facture;
import com.example.stage.dao.FactureDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class FactureService {
    @Autowired
    private FactureDao factureDao ;
    public Facture findByReference (String reference  ){

        return factureDao.findByReference(reference );
    }
    public List<Facture> findAll(){
        return factureDao.findAll();
    }
    @Transactional
    public int deleteByReference (String reference ){
        return factureDao.deleteByReference(reference);
    }
}
