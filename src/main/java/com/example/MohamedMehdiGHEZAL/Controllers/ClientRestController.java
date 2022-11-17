package com.example.MohamedMehdiGHEZAL.Controllers;

import com.example.MohamedMehdiGHEZAL.Entities.Client;
import com.example.MohamedMehdiGHEZAL.Service.IClientService;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class ClientRestController {
    @Autowired
    IClientService iClientService;

    @GetMapping("retrieveAllClient")
    public List<Client> retrieveAllClients(){
        return iClientService.retrieveAllClients();
    }
    @PostMapping("/AddClient")
    public Client addClient(Client c){
        return iClientService.addClient(c);
    }
    @DeleteMapping("DeleteEtuiant/{id}")
    public void deleteClient(@PathVariable long id){iClientService.deleteClient(id);
    }
    @PostMapping("UpdateClient")
    public Client updateClient(Client c){return  iClientService.updateClient(c); }
}
