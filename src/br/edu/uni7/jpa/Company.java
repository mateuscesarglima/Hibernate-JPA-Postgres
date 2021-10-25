package br.edu.uni7.jpa;

import javax.persistence.*;
import java.util.*;

@Entity
public class Company {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	private double revenue;
	
	private int version;
	
	@OneToOne
	private Address address;
	
	@OneToMany(mappedBy = "company")
	private List<Magazine> magazines = new ArrayList<Magazine>();

	public Company(Long id, String name, double revenue, int version) {
		super();
		this.id = id;
		this.name = name;
		this.revenue = revenue;
		this.version = version;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getRevenue() {
		return revenue;
	}

	public void setRevenue(double revenue) {
		this.revenue = revenue;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Magazine> getMagazines() {
		return magazines;
	}

	public void setMagazines(List<Magazine> magazines) {
		this.magazines = magazines;
	}


	
	
}
