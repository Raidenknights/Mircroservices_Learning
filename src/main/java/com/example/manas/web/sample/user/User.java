package com.example.manas.web.sample.user;
import java.util.*;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
public class User {
	private Integer id;
	@Size(min=2)
	private String name;
	@Past
	private Date birth;
	User(Integer id,String name,Date birth)
	{
		super();
		this.id=id;
		this.name=name;
		this.birth=birth;
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
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
}
