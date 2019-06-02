package com.hsi.resume.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hsi.resume.model.UserDetails;
import com.hsi.resume.repository.UserRepository;
@Service
public class UserService {

	@Autowired
	UserRepository repo;

	public UserDetails create(UserDetails sd) {
		return repo.save(sd);
	}

	public String login(String username, String password) {
		
		
		return null;
	}

}
