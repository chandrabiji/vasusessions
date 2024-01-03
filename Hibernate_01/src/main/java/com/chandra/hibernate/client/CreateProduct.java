package com.chandra.hibernate.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.chandra.hibernate.pojo.Product;

public class CreateProduct {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		Product p1 = new Product();
		p1.setPid(300);
		p1.setPname("xyz");
		p1.setQty(50);
		p1.setPrice(500);
		s.save(p1);
		tx.commit();
		s.close();

	}

}
