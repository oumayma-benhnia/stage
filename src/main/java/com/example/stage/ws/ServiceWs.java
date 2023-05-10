package com.example.stage.ws;

import com.example.stage.bean.Service;
import com.example.stage.service.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/service")
public class ServiceWs {
    @Autowired
    private ServiceService serviceService;

    @GetMapping("/id/{id}")
    public Optional<Service> findById(@PathVariable Long id) {
        return serviceService.findById(id);
    }

    @DeleteMapping("/idTache/{idTache}")
    public void deleteById(@PathVariable Long id) {
        serviceService.deleteById(id);
    }

    @GetMapping("/")
    public List<Service> findAll() {
        return serviceService.findAll();
    }

    @PostMapping("/")
    public int save(@RequestBody Service service) {
        return serviceService.save(service);
    }
}
