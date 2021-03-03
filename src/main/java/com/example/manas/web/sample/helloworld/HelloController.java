package com.example.manas.web.sample.helloworld;
import org.springframework.web.bind.annotation.*;
//controller 
@RestController
public class HelloController {

	//GET
	@GetMapping(path="/helloworld")
	public String helloworld()
	{
		return "Hello world";
	}
	//get hello-world-bean 
	@GetMapping(path="/hellobean")
	public Hellobean helloworldbean()
	{
		return new Hellobean("Hello world");
	}
}
