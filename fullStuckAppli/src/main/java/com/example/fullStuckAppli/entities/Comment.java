package com.example.fullStuckAppli.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Comment {

	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private int idComment;
	private String body;
	
	@Temporal(TemporalType.TIME)
	private Date date;
	
	@ManyToOne
	private Post post;
	
	@ManyToOne
	private UserComment utilisateur;
}
