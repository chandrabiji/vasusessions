package com.chandra.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

class DataStoring {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		
		Employee e1 = new Employee();
		e1.setName("Chandra");
		e1.setEmail("chandramca04@gmail.com");
		
		Employee e2 = new Employee();
		e2.setName("Charan");
		e2.setEmail("charan@gmail.com");
		
		Employee e3 = new Employee();
		e3.setName("Madhavi");
		e3.setEmail("madhavi@gmail.com");
		
		Address a1 = new Address();
		a1.setAddressLine("WestVenkatapuram");
		a1.setCity("Secundrabad");
		a1.setState("TS");
		a1.setCountry("India");
		a1.setPincode(500015);
		
		e1.setAddress(a1);
		e2.setAddress(a1);
		s.persist(e1);
		s.persist(e2);
		s.persist(e3);
		tx.commit();
		s.close();

	}

}
