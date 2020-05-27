package com.tenperals.test.service;

import com.tenperals.test.model.State;
import com.tenperals.test.repository.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StateService {

    @Autowired
    StateRepository stateRepository;


    public List<State> getAllState(){
        return stateRepository.findAll();
    }
}
