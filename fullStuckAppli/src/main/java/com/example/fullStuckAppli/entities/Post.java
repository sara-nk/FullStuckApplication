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
	private Long idPost;	
	private String title;
	private String body;
	
	@Temporal(TemporalType.DATE)
	private Date date;
	
	
	@ManyToOne
	private Author author;
	
	@OneToMany(mappedBy ="post")
	private Collection<Comment> comments;

	
	public Post(String title, String body, Date date, Author author) {
		super();
		this.title = title;
		this.body = body;
		this.date = date;
		this.author = author;
	}

	public Long getIdPost() {
		return idPost;
	}

	public void setIdPost(Long idPost) {
		this.idPost = idPost;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public Collection<Comment> getComments() {
		return comments;
	}

	public void setComments(Collection<Comment> comments) {
		this.comments = comments;
	}
	
	
	
}
