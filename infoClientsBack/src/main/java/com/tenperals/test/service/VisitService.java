package com.tenperals.test.service;

import com.tenperals.test.model.City;
import com.tenperals.test.model.Client;
import com.tenperals.test.model.Visist;
import com.tenperals.test.repository.CityRepository;
import com.tenperals.test.repository.ClientRepository;
import com.tenperals.test.repository.VisistRepository;
import com.tenperals.test.repository.VisistSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VisitService {

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private CityRepository cityRepository;

    @Autowired
    private VisistRepository visistRepository;


    public Visist registerVisit(Visist visist){
        Optional<Client> optionalClient = clientRepository.findById(visist.getClient().getId());
        if (optionalClient.isPresent()){
            visist.setVisitTotal(calculateVisistTotal(visist.getNet(), optionalClient.get().getVisitPercentage()));
            optionalClient.get().setAvaliableCredit(recalulateAvaliebleVisist(optionalClient.get().getAvaliableCredit(), visist.getVisitTotal()));
            clientRepository.save(optionalClient.get());
            return visistRepository.save(visist);
        }
        return null;
    }

    public List<Visist> getAllVisists(){
        return visistRepository.findAll();
    }

    private Long calculateVisistTotal(Long net, int percentageVisist){
        return net* percentageVisist;
    }

    private Long recalulateAvaliebleVisist(Long avaliableVisist, Long visistTotal){
        avaliableVisist = avaliableVisist -visistTotal;
        return avaliableVisist;
    }

    public List<Visist> getVisistByCity(City city){
        Specification<Visist> specification = VisistSpecification.hasVisitByCity(city.getId());
        return visistRepository.findAll(specification);
    }


}
