package com.chandra.hibernate;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;

public class Test {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		
		Criteria c = s.createCriteria(Employee.class);
		/*
		 * c.setFirstResult(1); c.setMaxResults(2);
		 */
		//c.add(Restriction.gt("salary",10000));
		c.addOrder(Order.asc("name"));
		List<Employee> list = c.list();
		for(Employee e :list) {
			System.out.println(e.getEmployeeId()+" "+e.getName()+" "+e.getEmail());
		}

	}

}
