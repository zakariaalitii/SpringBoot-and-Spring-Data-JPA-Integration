package com.example.demo.service;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.demo.dao.PeopleManagementDao;
import com.example.demo.entities.Person;

@Service
public class PeopleManagementService {

	@Autowired
	private PeopleManagementDao peopleManagementDao;

	public void updatePersonEmailById(int id, String newEmail) {
		peopleManagementDao.updatePersonEmailById(id, newEmail);
	}

	/*public List<Person> findByLastNameorFirstName(String lastName, String firstName) {
		// TODO Auto-generated method stub
		return peopleManagementDao.findByLastNameorFirstName(lastName, firstName);
	}
	

	public List<Person> findByLastName(String lastName, PageRequest pageRequest) {
		// TODO Auto-generated method stub
		return peopleManagementDao.findByLastName(lastName, pageRequest);
	}

	public CompletableFuture<Person> findByEmail(String email) {
		// TODO Auto-generated method stub
		return peopleManagementDao.findByEmail(email);
	}

	public List<Person> getPersonsInfoByLastName(String lastName) {
		return peopleManagementDao.getPeronInfoByLastName(lastName);
	}

	public List<Person> getpersonInfoByFirstNameAndEmial(String firstName, String email) {
		return peopleManagementDao.findByFirstNameAndEmail(firstName, email);
	}*/
	
	
	
	
	/*
	public Person createPerson(Person person1) {
		// TODO Auto-generated method stub
		return peopleManagementDao.save(person1);
	}
	public Iterable<Person> createPersons(List<Person> personList) {
		Iterable<Person> list = peopleManagementDao.saveAll(personList);
		return list;
	}
	public Iterable<Person> getPersonByIds(List<Integer> ids) {
		return peopleManagementDao.findAllById(ids);
	}
	public void deletePersonEntity(Person person) {
		peopleManagementDao.delete(person);
		
	}
	public void updatePesonEmailByid(int id, String newEmail) {
		Person person1 = null;
		Optional<Person> person=peopleManagementDao.findById(id);
		if(id==person1.getId()) {
			person1.setEmail(newEmail);
		}
		peopleManagementDao.save(person1);
		
	}
    */
}
