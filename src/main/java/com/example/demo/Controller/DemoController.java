package com.example.demo.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.DemoSvc;

@RestController
public class DemoController {

	
	@Autowired
	UserRepository userRepository;
	
	
	@Autowired
	DemoSvc demoSvc;
	
	@GetMapping(path = "/api/test")
	public String test() {
		return "Demo-1 controller test api working fine!!!!";
	}

	
	@GetMapping(path = "/api/users")
	public List<User> users() {
		
//return demoSvc.users();
		
		return userRepository.findAll();
		
		//return "users";
	}
	
	
	@PostMapping(path = "/api/addUser")
	public User addUser() {
		

		User user = new User();
		user.id = 5;
		user.first_Name="xyz";
		user.last_Name="abc";
		
		return userRepository.save(user);
		
		// userRepository.saveAll(userList);
		
		//return "users";
	}
}
