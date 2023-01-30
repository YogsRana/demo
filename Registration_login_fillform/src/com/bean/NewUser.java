package com.bean;

public class NewUser {
String username;
String password;


public NewUser() {
	}
public NewUser(String username, String password) {
	super();
}
@Override
public String toString() {
	return "NewUser [username=" + username + ", password=" + password + "]";
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

}
