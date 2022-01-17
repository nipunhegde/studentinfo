package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table

public class Student {
	@Id
	private int id;
	private String name;
	private String gender;
	private int age;
	private String subjecttaken;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSubjecttaken() {
		return subjecttaken;
	}
	public void setSubjecttaken(String subjecttaken) {
		this.subjecttaken = subjecttaken;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + ", subjecttaken="
				+ subjecttaken + "]";
	}


}
