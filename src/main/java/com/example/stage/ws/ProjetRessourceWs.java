package com.example.stage.ws;

import com.example.stage.bean.Projet;
import com.example.stage.bean.ProjetRessource;
import com.example.stage.service.ProjetRessourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/projetRessource")
public class ProjetRessourceWs {
    @Autowired
    private ProjetRessourceService projetRessourceService;

    @GetMapping("/projet/{projet}")
    public ProjetRessource findByProjet(Projet projet) {
        return projetRessourceService.findByProjet(projet);
    }

    @DeleteMapping("/projet/{projet}")
    public int deleteByProjet(Projet projet) {
        return projetRessourceService.deleteByProjet(projet);
    }

    @GetMapping("/")
    public List<ProjetRessource> findAll() {
        return projetRessourceService.findAll();
    }
}
