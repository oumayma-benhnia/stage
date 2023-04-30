package com.example.stage.ws;


import com.example.stage.bean.Collaborateur;
import com.example.stage.service.CollaborateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api/v1/collaborateur")
public class CollaborateurWs {
    @Autowired
    private CollaborateurService collaborateurService;
    @GetMapping("/code/{code}")
    public Collaborateur findByCode(@PathVariable String code) {
        return collaborateurService.findByCode(code);
    }

    @DeleteMapping("/code/{code}")
    public int deleteByCode(@PathVariable String code) {
        return collaborateurService.deleteByCode(code);
    }

    @GetMapping("/")
    public List<Collaborateur> findAll() {
        return collaborateurService.findAll();
    }
}
