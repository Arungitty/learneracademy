package com.simplilearn;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.simplilearn1.Student;
import com.simplilearn2.Subject;
import com.simplilearn3.Teacher;

 @Entity
 @Table(name="classreport_102222")
 
 public class ClassReport {

   
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Id
	@Column(name="class_id")
	 private int class_id;

	@Column(name="class_number")
	 private String classNumber;

	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="classreport_student_link",joinColumns= {@JoinColumn(name="class_id")}
	,inverseJoinColumns= {@JoinColumn(name="student_id")})
	@ElementCollection(targetClass=ClassReport.class)
	List<ClassReport>Classreports;
	
	@OneToMany(mappedBy="classreport",cascade=CascadeType.ALL)
	@ElementCollection(targetClass=Subject.class)
	List<Subject>subjects;

	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="classreport_teacher_link",joinColumns= {@JoinColumn(name="class_id")}
	,inverseJoinColumns= {@JoinColumn(name="teacher_id")})
	@ElementCollection(targetClass=Teacher.class)
	List<Teacher>teachers;


	
  Student student=new Student();

  Teacher teacher=new Teacher();
	
  
 
	public int getClass_id() {
		return class_id;
	}

	public void setClass_id(int class_id) {
		this.class_id = class_id;
	}

	public List<Subject> getSubjects() {
		return subjects;
	}

	public String getStudents() {
		StringBuilder sb=new StringBuilder();
		if(student!=null) {
		   sb.append(student.getFirstName()+",");
		   sb.append(student.getLastName()+","); 
		}
	       return sb.toString();
	}		
	


   

	public List<ClassReport> getClassreports() {
		return Classreports;
	}

	public void setClassreports(List<ClassReport> classreports) {
		Classreports = classreports;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}



	public Student getStudent() {
		return student;
	}


   
	public String getClassNumber() {
		return classNumber;
	}

	public void setClassNumber(String classNumber) {
		this.classNumber = classNumber;
	}

	public String getSubject() {
		StringBuilder sb=new StringBuilder();
	    if(subjects!=null) {
	        for(Subject subject:subjects) {
	    	sb.append(subject.getSubjectName()+",");
	    }
	    }
       return sb.toString();
	}
	
	
	public void setSubject(List<Subject> subjects) {
		this.subjects = subjects;
	}


	public void setTeacher(Teacher teacher) {
	this.teacher=teacher;	
	}


	public String getTeacher() {
		StringBuilder sb=new StringBuilder();
		if(teachers!=null) {
			  
			
			sb.append(teacher.getFname()+",");
		   sb.append(teacher.getLname()+","); 
		}
	       return sb.toString();
	}



	public List<Teacher> getTeachers() {
		return teachers;
	}

	

	public void setTeachers(List<Teacher> teachers) {
		this.teachers = teachers;
	}


	public String setClassNumber() {
		// TODO Auto-generated method stub
		return null;
	}


	

}
	


   
	
    

	
	
	
	

