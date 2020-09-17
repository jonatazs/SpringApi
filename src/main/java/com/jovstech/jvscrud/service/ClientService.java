package com.jovstech.jvscrud.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.jovstech.jvscrud.dao.ClientDao;
import com.jovstech.jvscrud.model.Client;


@Service
public class ClientService {
	
	@Autowired
	private ClientDao clientDao;
	

	
	public Client addClient(Client client) {
		return clientDao.save(client);
	}
	
	public List<Client> getAllClient(){
		return clientDao.findAll();
	}
	
	
	public Client getClientById(Long id) {
		
		Optional <Client> client= clientDao.findById(id);
		if(client.isPresent()) {
			return client.get(); 
		}else {
			return new Client (9999999999L, "Client don't exists");
		}
	}

}
