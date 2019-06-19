package com.teachersapp.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;

public class Teacher {

	private static int _id;
	
	private int id;
	
	@NotEmpty @Size(min = 3)
	private String name;
	
	@Email
	private String email;

	public int getId() {
		return id;
	}

	public Teacher() {
		this.id = _id++;
	}

	public Teacher(String name, String email) {
		this();
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
