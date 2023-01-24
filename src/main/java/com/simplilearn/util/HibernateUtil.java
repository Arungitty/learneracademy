package com.simplilearn.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.simplilearn.ClassReport;
import com.simplilearn1.Student;
import com.simplilearn2.Subject;
import com.simplilearn3.Teacher;

public class HibernateUtil {
	public static SessionFactory sessionFactory;

	public static SessionFactory buildSessionFactory() {
		 if(sessionFactory==null) {
			 Configuration cfg=new Configuration();
			 cfg.configure("hibernate.cfg.xml");
			 cfg.addAnnotatedClass(ClassReport.class);
			 cfg.addAnnotatedClass(Student.class);
			 cfg.addAnnotatedClass(Subject.class);
			 cfg.addAnnotatedClass(Teacher.class);
			 
			 sessionFactory=cfg.buildSessionFactory();
		 }  
		   
		   return sessionFactory;

	  }	
}
