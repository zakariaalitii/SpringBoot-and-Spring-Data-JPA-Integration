package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.scheduling.annotation.EnableAsync;

import com.example.demo.entities.Person;
import com.example.demo.service.PeopleManagementService;
//@EnableAsync
@SpringBootApplication
public class PeopleManagementSpringBootDataAppApplication implements CommandLineRunner{

	@Autowired
	private PeopleManagementService peopleManagementService;
	
	public static void main(String[] args) {
		SpringApplication.run(PeopleManagementSpringBootDataAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		int id= 137;
		String newEmail = "z@gamil.com";
				
		peopleManagementService.updatePersonEmailById(id, newEmail);
		
		//List<Person>  lsit = peopleManagementService.findByLastNameorFirstName("dev", "ana");
		//lsit.forEach(System.out::println);
		//System.out.println(lsit);
		//CompletableFuture<Person> completableFuture =peopleManagementService.findByEmail("zakari@gmail.com");
		//Person person =completableFuture.get(20, TimeUnit.SECONDS);
		//System.out.println("Person : "+person);
		//List<Person> list = peopleManagementService.findByLastName("dev", new PageRequest(0, 4, Direction.ASC, "firstName"));
		//createPerson();
		//createPersons();
		//getPersonByIds();
		//deletePersonEntity();
		//updatePesonEmailByid();
		
		//getPersonsInfoByLastName();
		//getpersonInfoByFirstNameAndEmial();
	}

	/*private void getpersonInfoByFirstNameAndEmial() {
		List<Person> personList = peopleManagementService.getpersonInfoByFirstNameAndEmial("Barry", "zakaria@gmail.com");
		personList.forEach(System.out::println);
	}

	private void getPersonsInfoByLastName() {
		List<Person> personList = peopleManagementService.getPersonsInfoByLastName("dev");
		personList.forEach(System.out::println);
	}

	private void updatePesonEmailByid() {
		peopleManagementService.updatePesonEmailByid(134,"zakariaalitix@gmail.com");
	}

	private void deletePersonEntity() {
		Person person = new Person();
		person.setId(132);
		peopleManagementService.deletePersonEntity(person);
	}

	private void getPersonByIds() {
		List<Integer> ids = new ArrayList<>();
		ids.add(132);
		ids.add(134);
		ids.add(20);
		Iterable<Person> personsList = peopleManagementService.getPersonByIds(ids);
		personsList.forEach(System.out::println);
	}

	private void createPersons() {
		List<Person> personList = Arrays.asList(new Person("ana", "Johnson","zakari@gmail.com", 
												new Date()), new Person("tu", "Johnson","yassine@gmail.com", new Date()));
		
		Iterable<Person> createPersons = peopleManagementService.createPersons(personList);
		for(Person person : createPersons) {
			System.out.println("sssssssssssssssssssss"+createPersons);
		}
		
	}

	private void createPerson() {
		Person person1 = new Person("Alit", "zakaria", "zakariaalti76@gmail.com", new Date());
		Person personDb = peopleManagementService.createPerson(person1);
		System.out.println(personDb);
	}
   */
}
