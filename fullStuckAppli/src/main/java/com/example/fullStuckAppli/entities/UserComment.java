package com.example.fullStuckAppli.entities;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity 
public class UserComment {
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private int idUserComment;
	private String firstname;
	private String lastname;
	private String email;

	@OneToMany(mappedBy = "utilisateur")
	private Collection<Comment> comments;

}
