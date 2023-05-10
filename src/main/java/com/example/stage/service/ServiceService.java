package com.example.stage.service;

import com.example.stage.bean.Ressource;
import com.example.stage.dao.ServiceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class ServiceService {
    @Autowired
    private ServiceDao serviceDao;

    public Optional<com.example.stage.bean.Service> findById(Long id) {
        return serviceDao.findById(id);
    }

    @Transactional
    public void deleteById(Long id) {
        serviceDao.deleteById(id);
    }

    public List<com.example.stage.bean.Service> findAll() {
        return serviceDao.findAll();
    }
    public int save(com.example.stage.bean.Service service){
        if (findById(service.getId()) != null) {
            return -1;
        }else{
            serviceDao.save(service);
            return 1;
        }
    }
}
