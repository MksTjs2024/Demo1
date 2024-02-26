package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.entity.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.repository.UserRepository;

@Service
public class DemoSvc {
	
	@Autowired
	UserRepository userRepository;
	
	public String users()
	{
	User user;
	String userName;
	System.out.println("in users svc class");
	
	 int size = userRepository.findAll().size();
		
	 System.out.println("in users svc class::"+size);
	
		return "userName";

}
}
