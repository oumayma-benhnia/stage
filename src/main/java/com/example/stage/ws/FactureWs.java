package com.example.stage.ws;

import com.example.stage.bean.Facture;
import com.example.stage.service.FactureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/facture")
public class FactureWs {
    @Autowired
    private FactureService factureService;
    @GetMapping("/reference/{reference}")
    public Facture findByReference(@PathVariable String reference) {
        return factureService.findByReference(reference);
    }
    @DeleteMapping("/reference/{reference}")
    public int deleteByReference(@PathVariable String reference) {
        return factureService.deleteByReference(reference );
    }
    @GetMapping("/")
    public List<Facture> findAll() {
        return factureService.findAll();
    }

}
