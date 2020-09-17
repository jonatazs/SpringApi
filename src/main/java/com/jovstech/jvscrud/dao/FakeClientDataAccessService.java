/*package com.jovstech.jvscrud.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.jovstech.jvscrud.model.Client;


//@Repository("fakeDao")
public class FakeClientDataAccessService implements ClientDao{

	
	
	private static List<Client> DB = new ArrayList<>();
	
	
	
	@Override
	public int insertClient(UUID id, Client client) {
		DB.add(new Client(id, client.getName()));
		return 1;
	}



	@Override
	public List<Client> selectAllClient() {
		DB.add(new Client(new UUID(123, 1), "João"));
		return DB;
	}



	@Override
	public Optional<Client> selectClientById(UUID id) {
		// TODO Auto-generated method stub
		return DB.stream().filter(client -> client.getId().equals(id))
				.findFirst();
				
	}



	@Override
	public int deleteClientById(UUID id) {
		// TODO Auto-generated method stub
		return 0;
	}



	@Override
	public int updateClientById(UUID id, Client client) {
		// TODO Auto-generated method stub
		return 0;
	}

@Override
	public int addClient(Client client) {
		// TODO Auto-generated method stub
		return ClientDao.super.addClient(client);
	}

}
*/
