package com.in.OLS.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.in.OLS.Dao.UserRepo;
import com.in.OLS.entity.User;
import com.in.OLS.exception.ResourseNotFoundException;

@Service
public class CustomUserDetailService implements UserDetailsService {

	@Autowired
	private UserRepo userRepo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		User user = userRepo.findByUsername(username).orElseThrow(() ->new ResourseNotFoundException("Login","Username",username));
		
	
		return user;
	}

}
