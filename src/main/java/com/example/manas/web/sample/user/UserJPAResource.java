package com.example.manas.web.sample.user;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class UserJPAResource {
	@Autowired
	private UserRepository userRepo;

	//get all users function
	//we are going to Map it using /getallusers
	@GetMapping(path="/jpa/getallusers")
	public List<User> userFindAll()
	{
		return userRepo.findAll();
	}
	@GetMapping(path="jpa/User/{id}")
	public EntityModel<User> findOne(@PathVariable int  id)
	{
		Optional<User> user = userRepo.findById(id);
		if(!user.isPresent())
			throw new UserNotFoundException("No user Exist with id: "+id);
		EntityModel<User> resource = EntityModel.of(user.get());
		WebMvcLinkBuilder linkTo = linkTo(methodOn(this.getClass()).userFindAll());
		resource.add(linkTo.withRel("Link to all users"));
		return resource;
		
	}
}
