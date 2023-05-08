package com.example.stage.service;

import com.example.stage.bean.Client;
import com.example.stage.dao.ClientDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ClientService {
@Autowired
private ClientDao clientDao ;
public Client findByNom (String nom ){
    return clientDao.findByNom(nom);
}
@Transactional
    public int deleteByNom (String nom ){
    return clientDao.deleteByNom(nom);
}
public List<Client> findAll(){
    return clientDao.findAll();
}

    public int save(Client client){
        if (findByNom(client.getNom()) != null) {
            return -1;
        }else{
            clientDao.save(client);
            return 1;
        }
    }


}
