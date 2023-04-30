package com.example.stage.ws;

import com.example.stage.bean.Remarque;
import com.example.stage.service.RemarqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
@RequestMapping("/api/v1/remarque")
public class RessourceWs {
    @Autowired
    private RemarqueService remarqueService;

    @GetMapping("/remarque/{remarque}")
    public Remarque findByRemarque(String remarque) {
        return remarqueService.findByRemarque(remarque);
    }

    @DeleteMapping("/remarque/{remarque}")
    public int deleteByRemarque(String remarque) {
        return remarqueService.deleteByRemarque(remarque);
    }

    @GetMapping("/")
    public List<Remarque> findAll() {
        return remarqueService.findAll();
    }
}
