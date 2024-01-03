package com.chandra.model;

public class Users {
	
	public int userId;
	public String userName;
	public String passWord;
	public String type;
	
	public Users() {}

	public Users(int userId, String userName, String passWord, String type) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.passWord = passWord;
		this.type = type;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public String toString() {
		return userId+"\t"+userName+"\t"+passWord+"\t"+type;
	}
	

}
