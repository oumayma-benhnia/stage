package com.example.stage.service;

import com.example.stage.bean.Remarque;
import com.example.stage.dao.RemarqueDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class RemarqueService {
    @Autowired
    private RemarqueDao remarqueDao;

    public Remarque findByRemarque(String remarque) {
        return remarqueDao.findByRemarque(remarque);
    }
@Transactional
    public int deleteByRemarque(String remarque) {
        return remarqueDao.deleteByRemarque(remarque);
    }

    public List<Remarque> findAll() {
        return remarqueDao.findAll();
    }
    public int save(Remarque remarque){
        if (findByRemarque(remarque.getRemarque()) != null) {
            return -1;
        }else{
            remarqueDao.save(remarque);
            return 1;
        }
    }
}
