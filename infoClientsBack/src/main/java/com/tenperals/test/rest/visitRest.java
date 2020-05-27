package com.tenperals.test.rest;

import com.tenperals.test.model.City;
import com.tenperals.test.model.Visist;
import com.tenperals.test.service.VisitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class visitRest {

    @Autowired
    VisitService visitService;

    @PostMapping(path = "/visists/city", consumes = "application/json", produces = "application/json")
    public List<Visist> getAllVisitsByCity(@RequestBody City city){
        return visitService.getVisistByCity(city);
    }

    @PostMapping(path = "/saveVisit/", consumes = "application/json", produces = "application/json")
    public Visist saveVisit(@RequestBody Visist visist){
        return visitService.registerVisit(visist);
    }

    @GetMapping(path = "/visits")
    public List<Visist> getAllVisits(){
        return visitService.getAllVisists();
    }
}
