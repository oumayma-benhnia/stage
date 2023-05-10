package com.example.stage.ws;


import com.example.stage.bean.Collaborateur;
import com.example.stage.service.CollaborateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

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

    @GetMapping("/id/{id}")
    public Optional<Collaborateur> findById(@PathVariable Long id) {
        return collaborateurService.findById(id);
    }

    @DeleteMapping("/id/{id}")

    public void deleteById(@PathVariable Long id) {
        collaborateurService.deleteById(id);
    }

    @PostMapping("/")
    public int save(@RequestBody Collaborateur collaborateur) {
        return collaborateurService.save(collaborateur);
    }
}
