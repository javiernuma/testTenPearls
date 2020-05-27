package com.tenperals.test.rest;

import com.tenperals.test.model.City;
import com.tenperals.test.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class CityRest {
    @Autowired
    CityService cityService;


    @GetMapping("/citys")
    public List<City> getAllCitys(){
        return cityService.getAllCitys();
    }
}
