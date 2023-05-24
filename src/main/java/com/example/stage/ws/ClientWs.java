package com.example.stage.ws;

import com.example.stage.bean.Client;
import com.example.stage.bean.Facture;
import com.example.stage.dao.ClientDao;
import com.example.stage.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/client")
public class ClientWs {
    @Autowired
    private ClientService clientService;
    @Autowired
    private ClientDao cleintDao;
    @GetMapping("/nom/{nom}")
    public Client findByNom(@PathVariable String nom) {
        return clientService.findByNom(nom);
    }
    @DeleteMapping("/nom/{nom}")
    public int deleteByNom(@PathVariable String nom) {
        return clientService.deleteByNom(nom );
    }
    @GetMapping("/")
    public List<Client> findAll() {
        return clientService.findAll();
    }
    @PostMapping("/")
    public int save(@RequestBody Client client) {
        return clientService.save(client);
    }
    @GetMapping("/id/{id}")
    public Optional<Client> findById( @PathVariable Long id) {
        return clientService.findById(id);
    }
    @DeleteMapping("/id/{id}")
    public void deleteById( @PathVariable Long id) {
        clientService.deleteById(id);
    }


    @PutMapping("/clients/{id}")
    public ResponseEntity<Client> updateClient(@PathVariable("id") Long id, @RequestBody Client client) {
        System.out.println("Update Client with ID = " + id + "...");

        Optional<Client> ClientInfo = cleintDao.findById(id);

        if (ClientInfo.isPresent()) {
            Client client1 = ClientInfo.get();

            client1.setNom(client1.getNom());
            client.setAdresse(client1.getAdresse());
            client1.setEmail(client1.getEmail());
            client1.setTelephone(client1.getTelephone());

            return new ResponseEntity<>(cleintDao.save(client1), HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    };
}
