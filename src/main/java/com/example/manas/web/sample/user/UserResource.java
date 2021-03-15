package com.example.manas.web.sample.user;
import static  org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static  org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;


import java.util.*;

import javax.validation.Valid;

import java.lang.*;

@RestController
public class UserResource {
	@Autowired
	private UserDao service;

	//get all users function
	//we are going to Map it using /getallusers
	@GetMapping(path="/getAllUsers")
	public List<User> userFindAll(){
		return service.userreturnAll();
	}
	@GetMapping(path="/get/{id}")
	public EntityModel<User> findOne(@PathVariable int id){
		User user = service.FindUser(id);
		if(user==null)
			throw new UserNotFoundException("No user Exist with id: "+id);
		EntityModel<User> resource = EntityModel.of(user);
		WebMvcLinkBuilder linkTo = linkTo(methodOn(this.getClass()).userfindall());
		resource.add(linkTo.withRel("Link to all users"));
		return resource;
		
	}
	@DeleteMapping(path="/user/{id}")
	public User deleteUser(@PathVariable int id){
		User user = service.deleteUser(id);
		if(user==null)
		{
			throw new UserNotFoundException("No user exist with id: "+id);
		}
		return user;
	}
	@PostMapping(path="/user")
	public ResponseEntity<Object> createUser(@Valid @RequestBody User user){
		User savedUser = service.adduser(user);
		return ResponseEntity.created(ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
			.buildAndExpand(savedUser.getId()).toUri()).build();
	}
}
