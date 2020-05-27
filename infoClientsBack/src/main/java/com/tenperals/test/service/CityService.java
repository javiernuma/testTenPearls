package com.tenperals.test.service;

import com.tenperals.test.model.City;
import com.tenperals.test.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {

    @Autowired
    CityRepository cityRepository;


    public List<City> getAllCitys(){
        return cityRepository.findAll();
    }
}
