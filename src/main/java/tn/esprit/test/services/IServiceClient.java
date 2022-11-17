package tn.esprit.test.services;

import tn.esprit.test.entities.Client;

import java.util.List;

public interface IServiceClient {
    public List<Client> retrieveAllClients();
    public Client addClient(Client c);
    public void deleteClient(Long id);
    public Client updateClient(Client c);
    public Client retrieveClient(Long id);
}
