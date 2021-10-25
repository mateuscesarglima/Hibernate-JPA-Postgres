package br.edu.uni7.jpa;

import java.util.Properties;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DatabaseGen {
	public static void main(String[] args) {
		 Properties config = new Properties();
		config.put("hibernate.hbm2ddl.auto", "create");

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("uni7-pu", config);
		EntityManager em = factory.createEntityManager();

		em.getTransaction().begin();
		
		Address address1 = new Address(null,"Rua Carlos Chagas 813", "Fortaleza","Ceara","60541-704");
		em.persist(address1);
		Address address2 = new Address(null,"Rua Oliveira paiva 123", "Fortaleza","Ceara","23233-123");
		em.persist(address2);
		Address address3 = new Address(null,"Avenida Washington Soares 333", "Fortaleza","Ceara","6123-704");
		em.persist(address3);
		Address address4 = new Address(null,"Rua das carnaubas 123", "Fortaleza","Ceara","12312304");
		em.persist(address4);
		
		Author author1 = new Author(null,"Mateus Cesar","G de Lima", 1);
		em.persist(author1);
		
		Author author2 = new Author(null,"Felipe Cesar","G de Lima", 2);
		em.persist(author2);
		
		Author author3 = new Author(null,"Rodrigo Oliveira","G de Lima", 3);
		em.persist(author3);
		
		Author author4 = new Author(null,"Paulo Cesar","G de Lima", 4);
		em.persist(author4);
		
		
		
		Company comp1 = new Company(null,"Teuszin's company", 2004000, 1);
		em.persist(comp1);
		
		Company comp2 = new Company(null,"filipin's company", 2000500, 2);
		em.persist(comp2);
		
		Company comp3 = new Company(null,"rodriguin's company", 2060000, 3);
		em.persist(comp3);
		
		Company comp4 = new Company(null,"adriana's company", 2000700, 4);
		em.persist(comp4);
		
		
		Magazine magazine1 = new Magazine(null,"1n2","ISTOÈ1",12650,2,2);
		em.persist(magazine1);
		
		Magazine magazine2 = new Magazine(null,"1n3","ISTOÈ2",12550,3,3);
		em.persist(magazine2);
		
		Magazine magazine3 = new Magazine(null,"1n4","ISTOÈ3",12450,5,4);
		em.persist(magazine3);
		
		Magazine magazine4 = new Magazine(null,"1n5","ISTOÈ4",12520,6,5);
		em.persist(magazine4);
		
		
		Article article1 = new Article(null,"sei nao",(byte) 2, 2);
		em.persist(article1);
		
		Article article2 = new Article(null,"sei nao",(byte) 2, 2);
		em.persist(article2);
		
		Article article3 = new Article(null,"sei nao",(byte) 2, 2);
		em.persist(article3);
		
		Article article4 = new Article(null,"sei nao",(byte) 2, 2);
		em.persist(article4);
		
		author1.getArticles().add(article1);
		author2.getArticles().add(article2);
		author3.getArticles().add(article3);
		author4.getArticles().add(article4);
		
		author1.setAddress(address1);
		author2.setAddress(address2);
		author3.setAddress(address3);
		author4.setAddress(address4);
		
		magazine1.getArticles().add(article1);
		magazine2.getArticles().add(article2);
		magazine3.getArticles().add(article3);
		magazine4.getArticles().add(article4);
		
		article1.setMagazine(magazine1);
		article2.setMagazine(magazine2);
		article3.setMagazine(magazine3);
		article4.setMagazine(magazine4);
		
		address1.setAuthor(author1);
		address2.setAuthor(author2);
		address3.setAuthor(author3);
		address4.setAuthor(author4);
		
		comp1.getMagazines().add(magazine1);
		comp2.getMagazines().add(magazine2);
		comp3.getMagazines().add(magazine3);
		comp4.getMagazines().add(magazine4);
		
		magazine1.setCompany(comp1);
		magazine2.setCompany(comp2);
		magazine3.setCompany(comp3);
		magazine4.setCompany(comp4);
		
		comp1.setAddress(address1);
		comp2.setAddress(address2);
		comp3.setAddress(address3);
		comp4.setAddress(address4);
		

		
		em.getTransaction().commit();
		
		
		em.close();
		factory.close();
	}
}

