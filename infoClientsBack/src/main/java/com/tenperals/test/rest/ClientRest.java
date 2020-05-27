package com.tenperals.test.rest;

import com.tenperals.test.model.Client;
import com.tenperals.test.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClientRest {

    @Autowired
    ClientService clientService;


    @RequestMapping(value = "/saveClient", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String saveUser(@RequestBody Client client) {
        try{
            if (clientService.saveClient(client) != null){
                return "Save Success";
            }else
                return "Error save Client";
        } catch (Exception e) {
            e.printStackTrace();
            return  e.getMessage();
        }
    }

    @RequestMapping(value = "/updateClient", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Client updateUser(@RequestBody Client client) {

        return clientService.updateClient(client);
    }

    @RequestMapping(value = "/deleteClient", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String deleteUser(@RequestBody Client client) {

        return clientService.deleteClient(client.getId());
    }
    @GetMapping("/clients")
    public List<Client> getAllClients(){
        return clientService.getAllClients();
    }
}
