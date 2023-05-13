package com.example.stage.service;

import com.example.stage.bean.Facture;
import com.example.stage.dao.FactureDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

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
    public int save(Facture facture){
        if (findByReference(facture.getReference()) != null) {
            return -1;
        }else{
           factureDao.save(facture);
            return 1;
        }
    }

    public Optional<Facture> findById(Long id) {
        return factureDao.findById(id);
    }

    public void deleteById(Long id) {
        factureDao.deleteById(id);
    }
}
