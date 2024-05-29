package com.kgn.client_service.service;

import com.kgn.client_service.entity.ClientEntity;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ClientService {

    public List<ClientEntity> getClients(){

        ClientEntity clientEntity1 = new ClientEntity(1,"MBRDI");
        ClientEntity clientEntity2 = new ClientEntity(2,"Dell");
        ClientEntity clientEntity3 = new ClientEntity(3,"SAP");
        return Arrays.asList(clientEntity3,clientEntity1,clientEntity2);

    }
    public String getClientNameById(int id){
        return getClients().stream().filter(c->c.getClientId()==id).findFirst().get().getClientName();
    }
}
