package com.newyeah.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.newyeah.entity.Users;
import com.newyeah.service.UserService;

@Configuration
@RestController
@EnableAutoConfiguration
public class UserControl {
	
	@Autowired
	UserService service ;
	
	@RequestMapping("/list")
	List<Users> list(String name,String pwd) {
		return service.queryUsers() ;
	}
}
