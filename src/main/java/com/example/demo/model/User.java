package com.example.demo.model;

import java.util.Arrays;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name="users" ,uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class User {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;

private String email;
private String password;
private String role;
private String fullname;
private String phoneNumber;
@Lob
@Column(columnDefinition = "MEDIUMBLOB")
private byte[] image;


public User() {
	super();
}


public User(String email, String password, String role, String fullname, String phoneNumber, byte[] image) {
	super();
	this.email = email;
	this.password = password;
	this.role = role;
	this.fullname = fullname;
	this.phoneNumber = phoneNumber;
	this.image = image;
}


public long getId() {
	return id;
}


public void setId(long id) {
	this.id = id;
}


public String getEmail() {
	return email;
}


public void setEmail(String email) {
	this.email = email;
}


public String getPassword() {
	return password;
}


public void setPassword(String password) {
	this.password = password;
}


public String getRole() {
	return role;
}


public void setRole(String role) {
	this.role = role;
}


public String getFullname() {
	return fullname;
}


public void setFullname(String fullname) {
	this.fullname = fullname;
}


public String getPhoneNumber() {
	return phoneNumber;
}


public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}


public byte[] getImage() {
	return image;
}


public void setImage(byte[] image) {
	this.image = image;
}


@Override
public String toString() {
	final int maxLen = 10;
	return "User [id=" + id + ", email=" + email + ", password=" + password + ", role=" + role + ", fullname="
			+ fullname + ", phoneNumber=" + phoneNumber + ", image="
			+ (image != null ? Arrays.toString(Arrays.copyOf(image, Math.min(image.length, maxLen))) : null) + "]";
}




}
