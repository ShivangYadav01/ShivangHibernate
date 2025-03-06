package com.hibernate;

import org.hibernate.cfg.Configuration;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.boot.registry.StandardServiceRegistry;
import com.hibernate.entity.Employee;
import org.hibernate.Session;


public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee e =new Employee("Ankur","male",94009);

//SessionFactory sessionFactory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
//
//
//StandardServiceRegistry ssr= new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
//Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();
//SessionFactory sessionfactory =meta.buildSessionFactory();
//Session session=sessionFactory.openSession();



SessionFactory sessionfactory =new MetadataSources(new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build()).getMetadataBuilder().build().buildSessionFactory();
Session session=sessionfactory.openSession();
	session.save(e);
	session.beginTransaction().commit();
	}

}
