package com.example.stage.ws;

import com.example.stage.bean.Fournisseur;
import com.example.stage.service.FournisseurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api/v1/fournisseur")
public class FournisseurWs {
    @Autowired
    private FournisseurService fournisseurService;

    @GetMapping("/societe/{societe}")
    public Fournisseur findBySociete(@PathVariable String societe) {
        return fournisseurService.findBySociete(societe);
    }

    @DeleteMapping("/societe/{societe}")
    public int deleteBySociete(@PathVariable String societe) {
        return fournisseurService.deleteBySociete(societe);
    }

    @GetMapping("/")
    public List<Fournisseur> findAll() {
        return fournisseurService.findAll();
    }
}
