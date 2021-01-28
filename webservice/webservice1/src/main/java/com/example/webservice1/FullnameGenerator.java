package com.example.webservice1;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Path("/fullname")
@RestController
@RequestMapping(path="/fullname")
public class FullnameGenerator {

//	@GET
//	@Produces(MediaType.TEXT_PLAIN)
	
	@GetMapping("/generate/{firstName}/{lastName}")
	public String generate(@PathVariable("firstName") String firstName, String LastName) {
		return firstName+LastName;
	}
	
	
	
	
}
