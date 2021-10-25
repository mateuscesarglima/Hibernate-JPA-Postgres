package br.edu.uni7.jpa;

import javax.persistence.*;
import java.util.*;

@Entity
public class Article {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String title;
	
	private byte content;
	
	private int version;
	
	@ManyToMany(mappedBy="articles", cascade=CascadeType.ALL)
	private List<Author> authors = new ArrayList<Author>();
	
	@ManyToOne
	@JoinColumn(name="magazine_id", referencedColumnName="id")
	private Magazine magazine;

	public Article(Long id, String title, byte content, int version) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.version = version;

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public byte getContent() {
		return content;
	}

	public void setContent(byte content) {
		this.content = content;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public List<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}

	public Magazine getMagazine() {
		return magazine;
	}

	public void setMagazine(Magazine magazine) {
		this.magazine = magazine;
	}


	

	
}
