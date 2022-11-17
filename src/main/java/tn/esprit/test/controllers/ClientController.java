package tn.esprit.test.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.test.entities.Client;
import tn.esprit.test.services.IServiceClient;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {
    @Autowired
    IServiceClient iServiceClient;

    @GetMapping("getAll")
    public List<Client> retrieveAllClients(){
        return iServiceClient.retrieveAllClients();
    }
    @PostMapping("/add")
    public Client addClient(@RequestBody Client c){
        return iServiceClient.addClient(c);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteClient(@PathVariable Long id){
        iServiceClient.deleteClient(id);
    }
    @PutMapping("/update")
    public Client updateClient(@RequestBody Client c){
        return iServiceClient.updateClient(c);
    }

    public Client retrieveClient(Long id){
        return iServiceClient.retrieveClient(id);
    }
}
