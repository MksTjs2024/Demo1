package com.example.demo.entity;

import org.hibernate.annotations.IdGeneratorType;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.ToString;

@Entity
@Data
@ToString
@Table(name = "users")
@Getter
public class User {
	
	@Id
	public int id;
	public String first_Name;
	public String last_Name;

}
