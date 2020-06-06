package com.example.fullStuckAppli.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.fullStuckAppli.entities.UserComment;

public interface UserCommentsRepository extends JpaRepository<UserComment,Long> {

}
