package com.example.manas.web.sample.user;
import java.util.*;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
public class User {
	private Integer id;
	@Size(min=2)
	private String name;
	@Past
	private Date dob;
	public User(Integer id,String name,Date dob)
	{
		this.id=id;
		this.name=name;
		this.dob=dob;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirth() {
		return dob;
	}
	public void setBirth(Date dob) {
		this.dob = dob;
	}
}

