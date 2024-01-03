package com.chandra;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class GetStudentRecord {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		
		Student s1 = s.load(Student.class, new Integer(2));
		System.out.println("Student Id : "+s1.getSid());
		System.out.println("Student Name: "+s1.getSname());
		tx.commit();
		s.close();

	}

}
