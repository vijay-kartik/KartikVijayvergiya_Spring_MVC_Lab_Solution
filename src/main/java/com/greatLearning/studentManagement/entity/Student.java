package com.greatLearning.studentManagement.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column
	private String name;
	
	@Column
	private String department;
	
	@Column
	private String country;
	
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
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String dept) {
		this.department = dept;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
	public Student(String name, String department, String country) {
			
		this.name = name;
		this.department = department;
		this.country = country;
	}
	
	public Student()
	{
		
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", department" + department + ", country=" + country + "]";
	}
}










