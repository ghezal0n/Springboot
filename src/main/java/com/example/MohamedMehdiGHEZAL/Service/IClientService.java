package com.example.MohamedMehdiGHEZAL.Service;

import com.example.MohamedMehdiGHEZAL.Entities.Client;

import java.util.List;

public interface IClientService {

    List<Client> retrieveAllClients();
    Client addClient(Client c);
    void deleteClient(Long id);
    Client updateClient(Client c);
    Client retrieveClient(Long id);


}
