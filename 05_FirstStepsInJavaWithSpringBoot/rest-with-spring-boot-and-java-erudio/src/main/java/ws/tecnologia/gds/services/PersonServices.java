package ws.tecnologia.gds.services;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ws.tecnologia.gds.exceptions.ResourceNotFoundException;
import ws.tecnologia.gds.model.Person;
import ws.tecnologia.gds.repositories.PersonRepository;

@Service
public class PersonServices {
	
	private Logger logger = Logger.getLogger(PersonServices.class.getName());

	@Autowired
	PersonRepository repository;
	
	public List<Person> findAll() {
		
		logger.info("Finding one person!");
		
		return repository.findAll();
	}
	
	public Person findById(Long id) {
			
		logger.info("Finding one person!");
		
		return repository.findById(id).orElseThrow(()-> new ResourceNotFoundException("No records found for this ID!"));
	}
	
	public Person create(Person person) {
		
		logger.info("Create one person!");
		
		return repository.save(person);
	}
	
	public Person update(Person person) {
		
		logger.info("Update one person!");
		
		var entity = repository.findById(person.getId()).orElseThrow(()-> new ResourceNotFoundException("No records found for this ID!"));
		
		entity.setFirstName(person.getFirstName());
		entity.setLastName(person.getLastName());
		entity.setAddress(person.getAddress());
		entity.setGender(person.getGender());
		
		return repository.save(entity);
	}
	
	public void delete(Long id) {
		
		logger.info("Update one person!");
		
		var entity = repository.findById(id).orElseThrow(()-> new ResourceNotFoundException("No records found for this ID!"));
		
		repository.delete(entity);
	}
}
