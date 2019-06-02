package com.hsi.resume.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.hsi.resume.model.UserDetails;
import com.hsi.resume.service.UserService;

@RestController
public class UserController {
@Autowired
UserService service;

@RequestMapping(value=("/registration"),method=RequestMethod.POST)
public String registration(@RequestBody UserDetails sd) {
	service.create(sd);
	return "registration done successfully";
	
}
@RequestMapping(value=("/login"),method=RequestMethod.GET)
public String login(@PathVariable String username, String password) {
	return service.login(username, password);
	
}
	

}
