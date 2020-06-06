package com.example.fullStuckAppli.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.fullStuckAppli.entities.Post;

public interface PostRepository extends JpaRepository<Post,Long> {

}
