package com.example.stage.ws;

import com.example.stage.bean.Projet;
import com.example.stage.bean.ProjetRessource;
import com.example.stage.service.ProjetRessourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/projetRessource")
public class ProjetRessourceWs {
    @Autowired
    private ProjetRessourceService projetRessourceService;

    @GetMapping("/projet/{projet}")
    public ProjetRessource findByProjet(@RequestBody Projet projet) {
        return projetRessourceService.findByProjet(projet);
    }

    @DeleteMapping("/projet/{projet}")
    public int deleteByProjet(@RequestBody Projet projet) {
        return projetRessourceService.deleteByProjet(projet);
    }

    @GetMapping("/")
    public List<ProjetRessource> findAll() {
        return projetRessourceService.findAll();
    }

    @GetMapping("/id/{id}")
    public Optional<ProjetRessource> findById(@PathVariable Long id) {
        return projetRessourceService.findById(id);
    }

    @DeleteMapping("/id/{id}")
    public void deleteById(@PathVariable Long id) {
        projetRessourceService.deleteById(id);
    }

    @PostMapping("/")
    public int save(@RequestBody ProjetRessource projetRessource) {
        return projetRessourceService.save(projetRessource);
    }
}
