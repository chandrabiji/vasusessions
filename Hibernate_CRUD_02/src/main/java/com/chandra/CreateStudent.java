package com.chandra;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CreateStudent {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		
		Student s1 = new Student();
		s1.setSname("abc");
		s1.setCourse("Java");
		
		Student s2 = new Student();
		s2.setSname("pqr");
		s2.setCourse("UI");
		s.save(s1);
		s.save(s2);
		tx.commit();
		s.close();

	}

}
