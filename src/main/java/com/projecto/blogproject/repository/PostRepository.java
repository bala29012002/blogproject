package com.projecto.blogproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projecto.blogproject.model.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

}
