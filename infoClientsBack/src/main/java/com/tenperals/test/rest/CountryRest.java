package com.tenperals.test.rest;

import com.tenperals.test.model.Country;
import com.tenperals.test.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CountryRest {

    @Autowired
    CountryService countryService;


    @GetMapping("/countrys")
    public List<Country> getAllCountry(){
        return countryService.getAllCountry();
    }
}
