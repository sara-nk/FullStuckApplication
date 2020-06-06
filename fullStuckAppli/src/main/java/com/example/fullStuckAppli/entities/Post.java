package com.example.fullStuckAppli.entities;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Post {
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private int idPost;	
	private String title;
	private String body;
	
	@Temporal(TemporalType.DATE)
	private Date date;
	
	
	@ManyToOne
	private Author author;
	
	@OneToMany(mappedBy ="post")
	private Collection<Comment> comments;
}
