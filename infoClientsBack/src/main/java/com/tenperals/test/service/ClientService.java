package com.tenperals.test.service;

import com.tenperals.test.model.Client;
import com.tenperals.test.repository.CityRepository;
import com.tenperals.test.repository.ClientRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private CityRepository cityRepository;


    public List<Client> getAllClients(){
        return clientRepository.findAll();
    }

    public  Client saveClient(Client client) throws Exception{
         return clientRepository.save(client);
    }

    public Client updateClient(Client client){
        Optional<Client> opClient =clientRepository.findById(client.getId());
        if (opClient.isPresent()){
            Client client1 = opClient.get();
            BeanUtils.copyProperties(client, client1);
            clientRepository.save(client1);

            return client1;
        }
        return null;
    }



    public String deleteClient(Long id){
        Optional<Client> opClient =clientRepository.findById(id);
        opClient.ifPresent(client -> clientRepository.delete(client));
        return "Exito";
    }
}
