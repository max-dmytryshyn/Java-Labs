package ua.lviv.iot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.lviv.iot.exeptions.IdProvidedWhileCreationException;
import ua.lviv.iot.saws.models.Saw;
import ua.lviv.iot.services.SawService;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping(path = "/saws")
public class SawController {

    @Autowired
    private SawService sawService;


    @GetMapping
    public ResponseEntity<List<Saw>> getSaws() {
        return ResponseEntity.ok(sawService.getSaws());
    }
    
    @GetMapping(path = "/{id}")
    public ResponseEntity getSawById(@PathVariable Integer id) {
        try {
            Saw existingSaw = sawService.getSawById(id);
            return ResponseEntity.ok(existingSaw);
        }

        catch (NoSuchElementException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity createSaw(@RequestBody Saw saw) {
       try {
           return ResponseEntity.ok(sawService.createSaw(saw));
        }

       catch (IdProvidedWhileCreationException e) {
           return ResponseEntity.status(400).body(e.getMessage());
       }
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity updateSawById(@PathVariable Integer id, @RequestBody Saw saw) {
        try {
            return ResponseEntity.ok(sawService.updateSawById(id, saw));
        }

        catch (NoSuchElementException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @CrossOrigin
    @DeleteMapping(path = "/{id}")
    public ResponseEntity deleteSawById(@PathVariable Integer id) {
        try {
            Saw existingSaw = sawService.getSawById(id);
            return ResponseEntity.ok(sawService.deleteSawById(id));
        }

        catch (NoSuchElementException e) {
            return ResponseEntity.notFound().build();
        }
    }
}
