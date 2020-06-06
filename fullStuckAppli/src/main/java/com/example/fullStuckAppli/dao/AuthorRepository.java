package com.example.fullStuckAppli.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.fullStuckAppli.entities.Author;

public interface AuthorRepository extends JpaRepository<Author,Long> {

}
