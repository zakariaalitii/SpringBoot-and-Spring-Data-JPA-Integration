package com.example.demo.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name = "person_table")
@DynamicUpdate
/*  @NamedQueries(value = { 
		@NamedQuery(name = "Person.getPeronInfoByLastName", query = "SELECT p FROM Person p WHERE p.lastName=?1"),
		@NamedQuery(name = "Person.findByFirstNameAndEmail", query = "SELECT p FROM Person p WHERE p.firstName=?1 AND email=?2")
		
})*/
/*@NamedNativeQueries(value = { 
		@NamedNativeQuery (name = "Person.getPeronInfoByLastName", query="SELECT * FROM person_table  WHERE lastName=?1", resultClass = Person.class),
		@NamedNativeQuery (name = "Person.findByFirstNameAndEmail", query="SELECT * FROM person_table  WHERE firstName=?1 AND email=?2", resultClass = Person.class)

		})
*/

public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="person_id")
	private int id;
	
	@Column(name="first_name", length=60, nullable = false)
	private String firstName;
	
	@Column(name="last_name", length=60, nullable = false)
	private String lastName;
	
	@Column(name="email", unique=true)
	private String email;
	
	 @Column(name="creation_Date")
	private Date creationDate;

	 
	 public Person() {
			
		}
	 
	public Person( String firstName, String lastName, String email, Date creationDate) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.creationDate = creationDate;
	}

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmail() {
		return email;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", creationDate=" + creationDate + "]";
	}
	 
	 
}
