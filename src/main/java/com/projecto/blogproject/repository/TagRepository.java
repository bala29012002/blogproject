package com.projecto.blogproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projecto.blogproject.model.Tag;

@Repository
public interface TagRepository extends JpaRepository<Tag, Long>{

}
