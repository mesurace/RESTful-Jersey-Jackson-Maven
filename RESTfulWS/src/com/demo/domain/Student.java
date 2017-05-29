package com.demo.domain;

public class Student {
	private String firstName;
	private String secondName;
	private String address;
	private String email;

	public Student(String firstName, String secondName, String address, String email) {
		super();
		this.firstName = firstName;
		this.secondName = secondName;
		this.address = address;
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public String getAddress() {
		return address;
	}

	public String getEmail() {
		return email;
	}

}
