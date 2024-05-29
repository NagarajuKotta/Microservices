package com.kgn.client_service.controller;

import com.kgn.client_service.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clients")
public class ClientController {

    @Autowired
    ClientService clientService;

    @GetMapping("/{id}")
    public String getClientNameById(@PathVariable("id") int id){
        return clientService.getClientNameById(id);
    }
}
