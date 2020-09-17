package com.jovstech.jvscrud.api;

import java.util.List;
//import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.jovstech.jvscrud.model.Client;
import com.jovstech.jvscrud.service.ClientService;



@RequestMapping("client")
@RestController
public class ClientController {

	@Autowired
	private ClientService clientService;

	
	@PostMapping
	public void addClient(@RequestBody Client client) {
		clientService.addClient(client);
	}
	
	@GetMapping
	public List<Client> getAllClient() {
		return clientService.getAllClient();
	}
	
	@GetMapping(path = "{id}")
	public Client getClientById(@PathVariable("id") Long id) {
		return clientService.getClientById(id);
	}

}
