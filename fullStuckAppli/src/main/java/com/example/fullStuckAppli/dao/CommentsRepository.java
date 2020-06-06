package com.example.fullStuckAppli.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.fullStuckAppli.entities.Comment;

public interface CommentsRepository extends JpaRepository<Comment,Long> {

}
