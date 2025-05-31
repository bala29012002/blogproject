package com.projecto.blogproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projecto.blogproject.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{

}
