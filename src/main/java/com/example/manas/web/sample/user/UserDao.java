package com.example.manas.web.sample.user;

import org.springframework.stereotype.Component;
import java.util.*;
@Component
public class UserDao {
	private static List<User> users = new ArrayList<>();
	private static int usercount=3;
	static {
		users.add(new User(1,"adam",new Date()));
		users.add(new User(2,"lulia", new Date()));
		users.add(new User(3,"Simi Chutia", new Date()));
	}
	public List userreturnAll()
	{
		return users;
	}
	public User FindUser(int id)
	{
		for(User user:users)
		{
			if(user.getId()==id)
				return user;
		}
		return null;
	}
	public User adduser(User user)
	{
		if(user.getId()==null)
		{
			user.setId(++usercount);
		}
		users.add(user);
		return user;
	}
	public User deleteUser(int id)
	{
		Iterator<User> itr = users.iterator();
		while(itr.hasNext())
		{
			User user = itr.next();
			if(id==user.getId())
			{
				itr.remove();
				return user;
			}
		}
		return null;
	}
	
	
}
