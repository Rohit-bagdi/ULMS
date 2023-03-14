package com.in.OLS.controller;

import java.util.List;
import java.util.Optional;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.in.OLS.Dao.BookRepo;
import com.in.OLS.entity.BookInfo;
//import com.in.OLS.entity.Users;

@RestController()
public class LoginController {



	 
	
	
	@GetMapping("/USer")
	public String sds()
	{
	//List<String> hgjhg = userRepo.findByUserAndPassword("Rohit","Rohit");
		return "ggjh";
	}
	

}
