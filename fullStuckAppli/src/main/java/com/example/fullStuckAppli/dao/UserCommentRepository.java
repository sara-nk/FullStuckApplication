
package com.example.fullStuckAppli.dao;

import com.example.fullStuckAppli.entities.UserComment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface UserCommentRepository extends JpaRepository<UserComment, Long> {
}
