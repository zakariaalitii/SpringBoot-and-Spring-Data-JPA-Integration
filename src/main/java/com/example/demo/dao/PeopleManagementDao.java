package com.example.demo.dao;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.scheduling.annotation.Async;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entities.Person;

public interface PeopleManagementDao extends CrudRepository<Person, Integer> {

	@Transactional
	@Modifying(clearAutomatically=true)
	@Query(value="UPDATE Person set email=:newEmail WHERE id=:personId")
	void updatePersonEmailById(@Param("personId")int id, 
			                   @Param("newEmail")String newEmail);

	
	
	/*@Query(value="SELECT p FROM Person p WHERE p.firstName=:firstname AND p.lastName=:lastname")
	List<Person> findByLastNameorFirstName(@Param("lastname")String lastName, 
										  @Param("firstname")String firstName);

	List<Person> findByLastName(String lastName, Pageable  pageable);

	@Async
	CompletableFuture<Person> findByEmail(String email);

	@Query(value="SELECT p FROM Person p WHERE p.lastName=?1")
	
	@Query(value = "SELECT * FROM Person WHERE last_name = ?1", nativeQuery = true)
	List<Person> getPeronInfoByLastName(String lastName);
	
	@Query(value="SELECT p FROM Person p WHERE p.firstName=?1 AND email=?2")
	
	@Query(value="SELECT * FROM Person Person WHERE firstName=?1 AND email=?2", nativeQuery = true)
	List<Person> findByFirstNameAndEmail(String firstName, String email);*/
	
	
	
	
	//List<Person> findByLastName(String lastName);
}
