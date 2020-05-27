package com.tenperals.test.rest;

import com.tenperals.test.model.Client;
import com.tenperals.test.model.SalesRepresentative;
import com.tenperals.test.service.SalesRepresentativeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SalesRepresentativeRest {

    @Autowired
    SalesRepresentativeService salesRepresentativeService;


    @GetMapping("/getSalesRepresentative")
    public List<SalesRepresentative> getAllState(){
        return salesRepresentativeService.getAllSalesRepresentatives();
    }

    @RequestMapping(value = "/saveSalesRe", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String saveUser(@RequestBody SalesRepresentative salesRepresentative) {
        try{
            if (salesRepresentativeService.saveSalesRepresentative(salesRepresentative) != null){
                return "Save Success";
            }else
                return "Error save salesRepresentative";
        } catch (Exception e) {
            e.printStackTrace();
            return  e.getMessage();
        }
    }
}
