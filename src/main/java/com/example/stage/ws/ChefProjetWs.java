package com.example.stage.ws;

import com.example.stage.bean.ChefProjet;
import com.example.stage.bean.Facture;
import com.example.stage.service.ChefProjetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/chefProjet")
public class ChefProjetWs {
  @Autowired
  private ChefProjetService chefProjetService;
    @GetMapping("/nom/{nom}")
    public ChefProjet findByNom(@PathVariable String nom ) {
        return chefProjetService.findByNom(nom);
    }
    @DeleteMapping("/nom/{nom}")
    public int deleteByNom(@PathVariable String nom) {
        return chefProjetService.deleteByNom(nom);
    }
    @GetMapping("/")
    public List<ChefProjet> findAll() {
        return chefProjetService.findAll();
    }



}
