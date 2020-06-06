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
	private Long idUserComment;
	private String firstname;
	private String lastname;
	private String email;

	@OneToMany(mappedBy = "utilisateur")
	private Collection<Comment> comments;

	public UserComment() {
	}

	public UserComment(Long idUserComment, String firstname, String lastname, String email) {
		this.idUserComment = idUserComment;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
	}

	public Long getIdUserComment() {
		return idUserComment;
	}

	public void setIdUserComment(Long idUserComment) {
		this.idUserComment = idUserComment;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Collection<Comment> getComments() {
		return comments;
	}

	public void setComments(Collection<Comment> comments) {
		this.comments = comments;
	}
}
