package com.example.stage.ws;

import com.example.stage.bean.Facture;
import com.example.stage.bean.Projet;
import com.example.stage.service.ProjetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/projet")
public class ProjetWs {
    @Autowired
    private ProjetService projetService;
    @GetMapping("/nomProjet/{nomProjet}")
    public Projet findByNomProjet(@PathVariable String nomProjet) {
        return projetService.findByNomProjet(nomProjet);
    }
    @DeleteMapping("/nomProjet/{nomProjet}")
    public int deleteByNomProjet(@PathVariable String nomProjet) {
        return projetService.deleteByNomProjet(nomProjet);
    }
    @GetMapping("/")
    public List<Projet> findAll() {
        return projetService.findAll();
    }
    @PostMapping("/")
    public int save(@RequestBody Projet projet) {
        return projetService.save(projet);
    }

}
