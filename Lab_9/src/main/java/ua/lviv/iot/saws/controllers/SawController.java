package ua.lviv.iot.saws.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.lviv.iot.saws.models.Saw;
import ua.lviv.iot.saws.services.SawService;

import java.util.List;

@RestController
@RequestMapping(path = "/saws")
public class SawController {

    @Autowired
    private SawService sawService;

    @GetMapping(path = "/{id}")
    public ResponseEntity<Saw> getSawById(@PathVariable Integer id){
        Saw existing_saw = sawService.getSawById(id);
        if(existing_saw != null){
            return ResponseEntity.ok(existing_saw);
        }
        else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping
    public List<Saw> getSaws(){
        return sawService.getSaws();
    }

    @PostMapping
    public Saw createSaw(@RequestBody Saw saw){
        return sawService.createSaw(saw);
    }

    @PutMapping(path = "{id}")
    public ResponseEntity<Saw> updateSawById(@PathVariable Integer id, @RequestBody Saw saw){
        Saw existing_saw = sawService.getSawById(id);
        if(existing_saw != null){
            sawService.updateSawById(id, saw);
            return ResponseEntity.ok(saw);
        }
        else {
            return ResponseEntity.notFound().build();
        }
    }

}
