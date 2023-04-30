package com.example.stage.ws;

import com.example.stage.bean.Client;
import com.example.stage.bean.Projet;
import com.example.stage.service.RemaqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/remarque")
public class RemarqueWs {
    @Autowired
    private RemaqueService remaqueService;

}
