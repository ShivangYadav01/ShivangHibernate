package com.hibernate;

import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.boot.registry.StandardServiceRegistry;

import com.hibernate.config.HibernateConfiguration;
import com.hibernate.entity.Employee;
import org.hibernate.Session;


public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee e =new Employee("Subham","male",94009,"UP");

SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();



Session session=sessionFactory.openSession();
	//session.save(e);//It can be used with auto inc(generrator) does not give error.

	session.persist(e);//but it can not used with this.
	session.beginTransaction().commit();
	sessionFactory.close();
	}

}
