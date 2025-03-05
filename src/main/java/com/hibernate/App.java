package com.hibernate;

import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernate.entity.Employee;
import org.hibernate.Session;


public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee e =new Employee("Ankur","male",94009);

Configuration cfg =new Configuration().configure("hibernate.cfg.xml");
SessionFactory sessionFactory=cfg.buildSessionFactory();
Session session=sessionFactory.openSession();	
Transaction tx=session.beginTransaction();
	session.save(e);
	tx.commit();
	}

}
