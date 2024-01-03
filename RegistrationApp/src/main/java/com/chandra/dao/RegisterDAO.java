package com.chandra.dao;

import com.chandra.model.Users;

public interface RegisterDAO {
	
	public int register(Users user);
	public String login(Users user);
	public String forgot(String userName,String type);

}
