package com.example.stage.ws;

import com.example.stage.bean.Collaborateur;
import com.example.stage.bean.Tache;
import com.example.stage.service.TacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/tache")
public class TacheWs {
    @Autowired
    private TacheService tacheService;

    @GetMapping("/collaborateur/{collaborateur}")
    public Tache findByCollaborateur(@RequestBody Collaborateur collaborateur) {
        return tacheService.findByCollaborateur(collaborateur);
    }

   @DeleteMapping("/collaborateur/{collaborateur}")
    public int deleteByCollaborateur(@RequestBody Collaborateur collaborateur) {
        return tacheService.deleteByCollaborateur(collaborateur);
    }

    @GetMapping("/")
    public List<Tache> findAll() {
        return tacheService.findAll();
    }

    @GetMapping("/idTache/{idTache}")
    public Optional<Tache> findById(@PathVariable Long idTache) {
        return tacheService.findById(idTache);
    }

    @DeleteMapping("/idTache/{idTache}")
    public void deleteById(@PathVariable Long idTache) {
        tacheService.deleteById(idTache);
    }

    @PostMapping("/")
    public int save(@RequestBody Tache tache) {
        return tacheService.save(tache);
    }
}
