package com.example.fullStuckAppli.dao;

import com.example.fullStuckAppli.entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface AuthorRepository extends JpaRepository<Author, Long> {
}
