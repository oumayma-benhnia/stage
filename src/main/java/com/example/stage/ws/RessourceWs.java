package com.example.stage.ws;

import com.example.stage.bean.Remarque;
import com.example.stage.service.RemaqueService;
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
    private RemaqueService remaqueService;

    @GetMapping("/remarque/{remarque}")
    public Remarque findByRemarque(String remarque) {
        return remaqueService.findByRemarque(remarque);
    }

    @DeleteMapping("/remarque/{remarque}")
    public int deleteByRemarque(String remarque) {
        return remaqueService.deleteByRemarque(remarque);
    }

    @GetMapping("/")
    public List<Remarque> findAll() {
        return remaqueService.findAll();
    }
}
