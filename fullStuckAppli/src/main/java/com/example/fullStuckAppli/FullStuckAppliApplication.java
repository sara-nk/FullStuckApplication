package com.example.fullStuckAppli;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.fullStuckAppli.dao.AuthorRepository;
import com.example.fullStuckAppli.dao.CommentsRepository;
import com.example.fullStuckAppli.dao.PostRepository;
import com.example.fullStuckAppli.dao.UserCommentsRepository;
import com.example.fullStuckAppli.entities.Author;
import com.example.fullStuckAppli.entities.Comment;
import com.example.fullStuckAppli.entities.Post;
import com.example.fullStuckAppli.entities.UserComment;

@SpringBootApplication
public class FullStuckAppliApplication implements CommandLineRunner {

	@Autowired
	private AuthorRepository authorRepository;
	
	@Autowired
	private PostRepository postRepository;
	
	@Autowired
	private CommentsRepository commentsRepository;
	
	@Autowired
	private UserCommentsRepository userCommentsRepository;
	
	
	public static void main(String[] args) {
		SpringApplication.run(FullStuckAppliApplication.class, args);
	}
	
	@Override
	public void run(String... args0) throws Exception{
	// Insert an Author 
		Author a1 = new Author("Sara", "Nazik", "sr@gmail.com", "0611223344", "https://start.spring.io/", "188 Zoubayer Casablanca", "Capgemini","","Marocaine");
		Author a2 = new Author("Souka", "Nazik", "sk@gmail.com", "0611223355", "https://start.spring.io/", "188 Zoubayer Casablanca", "Capgemini","","Marocaine");
		authorRepository.save(a1);
		authorRepository.save(a2);
		
		Post post1 = new Post("Fisrt Projet", "to provide or to reject the blind are welcome option to find", new Date(), a1);		
		Post post2 = new Post("Second Projet", "to provide or to reject the blind are welcome option to find", new Date(), a1);
		postRepository.save(post1);
		postRepository.save(post2);
		
		UserComment user1 = new UserComment("user1", "user2","user1@gmail.com");
		userCommentsRepository.save(user1);
		
		Comment com1 = new Comment("Ce POst est tres interssent", new Date() , post1,user1);
		commentsRepository.save(com1);		
		}

}
