package com.example.fullStuckAppli.entities;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Author {

	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private int idAuthor;
	private String firstname;
	private String lastname;
	private String email;
	private String phone;
	private String webSite;
	private String address;
	private String company;
	private String photo;
	private String nationality;
	
	@OneToMany(mappedBy="author")
	private Collection<Post> posts;
	
	
	
	
}
