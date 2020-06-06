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
	private Long idComment;
	private String body;
	
	@Temporal(TemporalType.TIME)
	private Date date;
	
	@ManyToOne
	private Post post;
	
	@ManyToOne
	private UserComment utilisateur;

	public Long getIdComment() {
		return idComment;
	}

	public void setIdComment(Long idComment) {
		this.idComment = idComment;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}

	public UserComment getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(UserComment utilisateur) {
		this.utilisateur = utilisateur;
	}

	public Comment(String body, Date date, Post post, UserComment utilisateur) {
		super();
		this.body = body;
		this.date = date;
		this.post = post;
		this.utilisateur = utilisateur;
	}
	
	
}
