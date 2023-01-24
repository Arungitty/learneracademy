package com.simplilearn.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.simplilearn.ClassReport;

import com.simplilearn.util.HibernateUtil;

public class Dao {

public static void addEmployee(ClassReport classreport) {
		
		SessionFactory sf= HibernateUtil.buildSessionFactory();
		Session sess=sf.openSession();
		
		Transaction tx= sess.beginTransaction();
		 sess.save(classreport);
		 tx.commit();
		 sess.close();
	 
	}

   
public static List<ClassReport> listClassReport(){
	   List<ClassReport>classreports=null;
	   SessionFactory sf=HibernateUtil.buildSessionFactory();
	   Session sess = sf.openSession();
	   
	   classreports= sess.createQuery("From ClassReport").list();
       return classreports;

   }

}   
   
   