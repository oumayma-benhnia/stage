package com.example.stage.ws;


import com.example.stage.bean.Ressource;

import com.example.stage.service.RessourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping("/api/v1/ressource")
public class RessourceWs {
    @Autowired
    private RessourceService ressourceService;

    @GetMapping("/type/{type}")
    public Ressource findByType(String type) {
        return ressourceService.findByType(type);
    }

    @DeleteMapping("/type/{type}")
    public int deleteByType(String type) {
        return ressourceService.deleteByType(type);
    }

    @GetMapping("/")
    public List<Ressource> findAll() {
        return ressourceService.findAll();
    }
    @PostMapping("/")
    public int save(@RequestBody Ressource ressource) {
        return ressourceService.save(ressource);
    }
}
