package com.example.stage.ws;

import com.example.stage.bean.Materiel;
import com.example.stage.service.MaterielService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/materiel")
public class MaterielWs {
    @Autowired
    private MaterielService materielService;

    @GetMapping("/reference/{reference}")
    public Materiel findByReference(@PathVariable String reference) {
        return materielService.findByReference(reference);
    }

    @DeleteMapping("/reference/{reference}")
    public int deleteByReference(@PathVariable String reference) {
        return materielService.deleteByReference(reference);
    }
    @GetMapping("/")
    public List<Materiel> findAll() {
        return materielService.findAll();
    }

    @GetMapping("/id/{id}")
    public Optional<Materiel> findById(@PathVariable Long id) {
        return materielService.findById(id);
    }

    @DeleteMapping("/id/{id}")
    public void deleteById(@PathVariable Long id) {
        materielService.deleteById(id);
    }

    @PostMapping("/")
    public int save(@RequestBody Materiel materiel) {
        return materielService.save(materiel);
    }
}
