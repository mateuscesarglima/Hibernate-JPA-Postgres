package br.edu.uni7.jpa;

import javax.persistence.*;
import java.util.*;

@Entity
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String street;
	
	private String city;
	
	private String state;
	
	private String zip;
	
	//O mappedBy � para indicar qual � o lado inverso ou n�o dominante da rela��o.
	@OneToOne(mappedBy="address", cascade= CascadeType.ALL)
	private Author author;
	
	@OneToOne(mappedBy="address",cascade=CascadeType.ALL)
	private Company company;

	public Address(Long id, String street, String city, String state, String zip) {
		super();
		this.id = id;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}


	
	
}
