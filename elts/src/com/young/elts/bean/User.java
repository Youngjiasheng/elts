package com.young.elts.bean;

import java.io.Serializable;

public class User implements Serializable {
	private int id;
	private String name ;
	private String avatar;
	private String password;
	private String phone;
	private String email;
	
	public User(){
		
	}
	public User(int id, String name,String avatar,String password,String phone,String email){
		this.id=id;
		this.name=name;
		this.avatar=avatar;
		this.password=password;
		this.phone=phone;
		this.email=email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", avatar=" + avatar
				+ ", password=" + password + ", phone=" + phone + ", email="
				+ email + "]";
	}
	
}
