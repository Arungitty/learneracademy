package com.simplilearn2;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.simplilearn.ClassReport;

@Entity
@Table(name="subject")
public class Subject {

	@Id
	@GeneratedValue
	 
	@Column(name="subject_id")
	 private int id;

	@Column(name="subject_name")
	 private String subjectName;

	@Column(name="subject_type")
	 private String subjectType;

	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="class_id")
	ClassReport classreport;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public String getSubjectType() {
		return subjectType;
	}

	public void setSubjectType(String subjectType) {
		this.subjectType = subjectType;
	}

	public ClassReport getClassreport() {
		return classreport;
	}

	public void setClassreport(ClassReport classreport) {
		this.classreport = classreport;
	}
    
}		
	
	
	
	
	
	

