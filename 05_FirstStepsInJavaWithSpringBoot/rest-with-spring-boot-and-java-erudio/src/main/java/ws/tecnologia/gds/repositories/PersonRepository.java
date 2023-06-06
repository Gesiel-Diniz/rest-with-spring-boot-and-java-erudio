package ws.tecnologia.gds.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ws.tecnologia.gds.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long>{}