package com.simplilearn3;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.simplilearn.ClassReport;

@Entity
@Table(name="teacher")
public class Teacher {

	@Id
	@GeneratedValue
	 
	@Column(name="teacher_id")
	 private int teacherid;

	@Column(name="f_name")
	 private String Fname;

	@Column(name="l_name")
	private String Lname;

	
	
	@ManyToMany(mappedBy="teacher",cascade=CascadeType.ALL)
	List<ClassReport>classreports;



	public int getTeacherid() {
		return teacherid;
	}



	public void setTeacherid(int teacherid) {
		this.teacherid = teacherid;
	}



	public String getFname() {
		return Fname;
	}



	public void setFname(String fname) {
		Fname = fname;
	}



	public String getLname() {
		return Lname;
	}



	public void setLname(String lname) {
		Lname = lname;
	}



	public List<ClassReport> getClassreports() {
		return classreports;
	}



	public void setClassreports(List<ClassReport> classreports) {
		this.classreports = classreports;
	}

}	
	
	
	
	
	
	
	
	
	
	
	

