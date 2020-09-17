package com.jovstech.jvscrud.dao;

/*import java.util.List;
import java.util.Optional;
import java.util.UUID;
*/
import org.springframework.data.jpa.repository.JpaRepository;

import com.jovstech.jvscrud.model.Client;


public interface ClientDao extends JpaRepository<Client, Long >{

}



/*public interface ClientDao {

	int insertClient(UUID id, Client client);
	
	default int insertClien(Client client) {
		UUID id = UUID.randomUUID();
		return insertClient(id, client);
	}
	
	
	
	List<Client> selectAllClient();
	
	
	Optional<Client> selectClientById(UUID id);

	int deleteClientById(UUID id);
	
	
	int updateClientById(UUID id, Client client);
}
*/