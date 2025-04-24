package com.projecto.blogproject.model;

import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

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
@Table(name="tbl_user")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
	
	public User(String name, String email, String password, String createdBy) {
		this.name = name;
		this.email = email;
		this.password = password;
		this.createdBy = createdBy;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "user_name", nullable = false)
	private String name;
	
	@Column(name = "user_email", nullable = false)
	private String email;
	
	@Column(name = "password", nullable = false)
	private String password;
	
	@CreationTimestamp
	@Column(name = "created_date", nullable = false)
	private Date createdDate;
	
	@UpdateTimestamp
	@Column(name = "modified_date", nullable = false)
	private Date modifiedDate;
	
	@Column(name = "createdBy" , nullable = true)
	private String createdBy;
}
