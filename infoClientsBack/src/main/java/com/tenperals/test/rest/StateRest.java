package com.tenperals.test.rest;

import com.tenperals.test.model.State;
import com.tenperals.test.service.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StateRest {

    @Autowired
    StateService stateService;


    @GetMapping("/states")
    public List<State> getAllState(){
        return stateService.getAllState();
    }
}
