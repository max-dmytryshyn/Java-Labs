package ua.lviv.iot.saws.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.lviv.iot.saws.models.*;
import ua.lviv.iot.saws.services.SawService;

import java.util.List;

@RestController
@RequestMapping(path = "/saws")
public class SawController {

    @Autowired
    private SawService sawService;

    @GetMapping(path = "/{id}")
    public Saw getSawById(@PathVariable Integer id){
        return sawService.getSawById(id);
    }

    @GetMapping
    public List<Saw> getSaws(){
        return sawService.getSaws();
    }
}
