package com.example.stage.service;

import com.example.stage.bean.Facture;
import com.example.stage.bean.Paiement;
import com.example.stage.dao.PaiementDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class PaiementService {
    @Autowired
    private PaiementDao paiementDao ;
    public Paiement findByFacture (Facture facture){
        return paiementDao.findByFacture(facture);
    }
    public List <Paiement> findAll(){
        return paiementDao.findAll();

    }
    @Transactional
    public int deleteByFacture (Facture facture){
        return paiementDao.deleteByFacture(facture);
    }
}
