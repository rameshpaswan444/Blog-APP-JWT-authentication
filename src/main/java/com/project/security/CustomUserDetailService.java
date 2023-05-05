package com.project.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.project.Repositories.UserRepo;
import com.project.entities.User;
import com.project.exceptions.ResourceNotFoundException;


@Service

public class CustomUserDetailService implements UserDetailsService{

	@Autowired
	private UserRepo userRepo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		//loading user from database by username
	User user=	this.userRepo.findByEmail(username).orElseThrow(()->new ResourceNotFoundException("User", "email:"+username,1));
		
		return user;
	}

}