package com.chandra.hibernate;

import java.util.Iterator;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class FetchData {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		
		TypedQuery query = s.getNamedQuery("findEmployeeByName");
		query.setParameter("name", "Chandra");
		List<Employee> employees = query.getResultList();
		Iterator<Employee> itr =employees.iterator();
		while(itr.hasNext()) {
			Employee e = itr.next();
			System.out.println(e.getEmployeeId()+" "+e.getName()+" "+e.getEmail());
		}

	}

}
