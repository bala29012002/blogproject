package com.projecto.blogproject.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tbl_category")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Category {
	
	
	
	public Category(String categoryName) {
		this.categoryName = categoryName;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "category_name", nullable = false, unique = true)
	private String categoryName;
}
