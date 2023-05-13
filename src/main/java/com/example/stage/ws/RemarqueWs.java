package com.example.stage.ws;

import com.example.stage.bean.Facture;
import com.example.stage.bean.Remarque;
import com.example.stage.service.RemarqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/remarque")
public class RemarqueWs {
    @Autowired
    private RemarqueService remarqueService;
    @GetMapping("/remarque/{remarque}")
    public Remarque findByRemarque(@PathVariable String remarque) {
        return remarqueService.findByRemarque(remarque);
    }
    @DeleteMapping("/remarque/{remarque}")
    public int deleteByRemarque(@PathVariable String remarque) {
        return remarqueService.deleteByRemarque(remarque);
    }
    @GetMapping("/")
    public List<Remarque> findAll() {
        return remarqueService.findAll();
    }
    @PostMapping("/")
    public int save(@RequestBody Remarque remarque) {
        return remarqueService.save(remarque);
    }
    @GetMapping("/id/{id}")
    public Optional<Remarque> findById( @PathVariable Long id) {
        return remarqueService.findById(id);
    }
    @DeleteMapping("/id/{id}")
    public void deleteById(Long id) {
        remarqueService.deleteById(id);
    }
}
