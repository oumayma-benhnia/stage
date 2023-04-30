package com.example.stage.ws;

import com.example.stage.bean.Collaborateur;
import com.example.stage.bean.Tache;
import com.example.stage.service.TacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping("/api/v1/tache")
public class TacheWs {
    @Autowired
    private TacheService tacheService;

    @GetMapping("/collaborateur/{collaborateur}")
    public Tache findByCollaborateur(Collaborateur collaborateur) {
        return tacheService.findByCollaborateur(collaborateur);
    }

   @DeleteMapping("/collaborateur/{collaborateur}")
    public int deleteByCollaborateur(Collaborateur collaborateur) {
        return tacheService.deleteByCollaborateur(collaborateur);
    }

    @GetMapping("/")
    public List<Tache> findAll() {
        return tacheService.findAll();
    }
}
