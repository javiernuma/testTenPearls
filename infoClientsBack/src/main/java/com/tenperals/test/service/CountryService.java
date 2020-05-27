package com.tenperals.test.service;

import com.tenperals.test.model.Country;
import com.tenperals.test.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

    @Autowired
    CountryRepository countryRepository;


    public List<Country> getAllCountry(){
        return countryRepository.findAll();
    }


}
