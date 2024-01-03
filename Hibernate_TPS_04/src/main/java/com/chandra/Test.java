package com.chandra;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		
		Employee e1 = new Employee();
		e1.setName("Chandra");
		
		RegularEmployee e2 = new RegularEmployee();
		e2.setName("Charan");
		e2.setSalary(50000);
		e2.setBonus(5);
		
		ContractEmployee e3 = new ContractEmployee();
		e3.setName("Sai");
		e3.setPay_per_hour(1000);
		e3.setContract_duration("15 hours");
		
		s.persist(e1);
		s.persist(e2);
		s.persist(e3);
		
		tx.commit();
		s.close();

	}

}
