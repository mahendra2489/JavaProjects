package com.org.demo.demo.Model;

public class User {

	private String id;
	private String name;
	private String mobileNo;
	
	
	public User() {
		
	}
	
	public User(String id, String name, String mobileNo) {
		super();
		this.id = id;
		this.name = name;
		this.mobileNo = mobileNo;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	
}
