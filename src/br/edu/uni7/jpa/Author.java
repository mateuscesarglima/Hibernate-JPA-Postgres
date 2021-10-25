package br.edu.uni7.jpa;

import javax.persistence.*;
import java.util.*;

@Entity
public class Author {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String firstname;
	
	private String lastName;
	
	private int version;
	
	@ManyToMany
	@JoinTable(
			name="author_article",
			joinColumns = {@JoinColumn(name="author_id")},
			inverseJoinColumns = {@JoinColumn(name="article_id")}
			)
	private List<Article> articles = new ArrayList<Article>();

	@OneToOne
	private Address address;
	
	public Author(Long id, String firstname, String lastName, int version) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastName = lastName;
		this.version = version;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public List<Article> getArticles() {
		return articles;
	}

	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	
}
