package com.example.demo.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserDTO implements Serializable {
	private static final long serialVersionUID=1L;
	public Number id;
	public String firstName;
	public  String secondName;

}
