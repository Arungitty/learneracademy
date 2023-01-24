package com.simplilearn1;

import java.util.List;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.ManyToMany;

import javax.persistence.Table;



@Entity

@Table(name="student")
public class Student {
     

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	 
	@Column(name="student_id")
	 private int Student_id;

	@Column(name="first_name")
	 private String firstName;

	@Column(name="last_name")
	 private String lastName;
    
	

	@ManyToMany(mappedBy="student",cascade=CascadeType.ALL)
	@ElementCollection(targetClass=Student.class)
	List<Student>students;
	
	
	public int getId() {
		return Student_id;
	}


	public void setId(int id) {
		this.Student_id = id;
	}



	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	

	public int getStudent_id() {
		return Student_id;
	}


	public void setStudent_id(int student_id) {
		this.Student_id = student_id;
	}


	public List<Student> getStudents() {
		return students;
	}


	public void setStudents(List<Student> students) {
		this.students = students;
	}



  
}	

	
	


	
	
	
	
	
	
	
	
	
	
	
	

