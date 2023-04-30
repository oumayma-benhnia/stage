package com.example.stage.ws;

import com.example.stage.bean.Materiel;
import com.example.stage.service.MaterielService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

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

    public List<Materiel> findAll() {
        return materielService.findAll();
    }
}
