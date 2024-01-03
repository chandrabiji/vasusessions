package com.chandra.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class FetchData {

	public static void main(String[] args) {
		SessionFactory sf= new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		Employee e1 = (Employee)s.load(Employee.class, 1);
		System.out.println(e1.getEmployeeId()+" "+e1.getName()+" "+e1.getEmail());
		s.close();
		Session s1 = sf.openSession();
		Employee e2 = (Employee)s1.load(Employee.class, 1);
		System.out.println(e2.getEmployeeId()+" "+e2.getName()+" "+e2.getEmail());
		s1.close();
		tx.commit();

	}

}