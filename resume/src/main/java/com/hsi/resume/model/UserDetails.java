package com.hsi.resume.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="usermodel")
public class UserDetails {
	@Id
	private String id;
	private String username;
	private String password;
	private int mobile_Number;
	private String email_id;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public int getMobile_Number() {
		return mobile_Number;
	}
	public void setMobile_Number(int mobile_Number) {
		this.mobile_Number = mobile_Number;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	@Override
	public String toString() {
		return "UserDetails [id=" + id + ", username=" + username + ", password=" + password + ", mobile_Number="
				+ mobile_Number + ", email_id=" + email_id + "]";
	}
	
	
}
	
	


