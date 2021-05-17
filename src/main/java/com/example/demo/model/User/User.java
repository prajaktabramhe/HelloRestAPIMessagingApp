package com.example.demo.model.User;

public class User {

	private String FirstName;
	private String LastName;

	public User(User user)
	{
		this.FirstName = user.FirstName;
		this.LastName = user.LastName;
	}
	
	public void setfirstName(String FirstName)
	{
		this.FirstName = FirstName;
	}
	public String getFirstName() {
		// TODO Auto-generated method stub
		return FirstName;
	}

	public void setlastName(String LastName)
	{
		this.LastName = LastName;
	}
	public String getLastName() {
		// TODO Auto-generated method stub
		return LastName;
	}

}
