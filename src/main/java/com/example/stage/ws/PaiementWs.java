package com.example.stage.ws;

import com.example.stage.bean.Facture;
import com.example.stage.bean.Paiement;
import com.example.stage.service.PaiementService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/paiement")
public class PaiementWs {
    private PaiementService paiementService;
    @GetMapping("/facture/{facture}")
    public Paiement findByFacture(@RequestBody Facture facture) {
        return paiementService.findByFacture(facture);
    }
    @DeleteMapping("/facture/{facture}")
    public int deleteByFacture(@RequestBody Facture facture) {
        return paiementService.deleteByFacture(facture );
    }
    @GetMapping("/")
    public List<Paiement> findAll() {
        return paiementService.findAll();
    }
    @PostMapping("/")
    public int save(@RequestBody Paiement paiement) {
        return paiementService.save(paiement);
    }
    @GetMapping("/id/{id}")
    public Optional<Paiement> findById( @PathVariable Long id) {
        return paiementService.findById(id);
    }
    @DeleteMapping("/id/{id}")
    public void deleteById( @PathVariable Long id) {
        paiementService.deleteById(id);
    }
}
