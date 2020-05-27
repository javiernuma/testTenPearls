package com.tenperals.test.service;

import com.tenperals.test.model.SalesRepresentative;
import com.tenperals.test.repository.SalesRepresentativeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalesRepresentativeService {

    @Autowired
    SalesRepresentativeRepository salesRepresentativeRepository;

    public SalesRepresentative saveSalesRepresentative(SalesRepresentative salesRepresentative){
        return salesRepresentativeRepository.save(salesRepresentative);
    }

    public List<SalesRepresentative> getAllSalesRepresentatives(){
        return salesRepresentativeRepository.findAll();
    }
}
