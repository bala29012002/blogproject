package com.projecto.blogproject.model;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tbl_tag")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tag {

	
	public Tag(String tagName) {
		this.tagName = tagName;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "tag_name" , nullable = false, unique = true)
	private String tagName;
	
	@ManyToMany(mappedBy = "tag")
	private Set<Post> posts = new HashSet<Post>();
}
