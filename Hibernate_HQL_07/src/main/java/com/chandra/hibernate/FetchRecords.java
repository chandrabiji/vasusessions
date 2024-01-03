package com.chandra.hibernate;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class FetchRecords {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		//Get All Records
		/*
		 * Query query = s.createQuery("from Employee"); List<Employee> list =
		 * query.list(); for(Employee e:list) {
		 * System.out.println(e.getEmployeeId()+" "+e.getName()+" "+e.getEmail()); }
		 */
		//How to use Update Query
		/*
		 * Query q = s.createQuery("update Employee set name=:n where employeeId=:i");
		 * q.setParameter("n", "Chandra Sekhar"); q.setParameter("i", 1); int status =
		 * q.executeUpdate(); if(status!=0) {
		 * System.out.println("Successfully Name Updated..."); }else {
		 * System.out.println("Notable to Updated.Please try again..."); }
		 */
		//How to use Delete Query
//		Query q = s.createQuery("delete from Employee where employeeId=1");
//		int status = q.executeUpdate();
//		if(status !=0) {
//			System.out.println("Successfully Record Deleted...");
//		}else {
//			System.out.println("Notable to delete.Please try again");
//		}
		tx.commit();
		s.close();

	}

}