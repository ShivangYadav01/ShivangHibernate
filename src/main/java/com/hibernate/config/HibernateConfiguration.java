package com.hibernate.config;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;

public class HibernateConfiguration {
	
	 public static SessionFactory getSessionFactory() 
	 {
	Properties ps=new Properties();
	
	ps.put(Environment.DIALECT,"org.hibernate.dialect.MySQLDialect");
	ps.put(Environment.JAKARTA_JDBC_URL, "jdbc:mysql://localhost:3306/sameer");
	ps.put(Environment.JAKARTA_JDBC_USER,"root");
	ps.put(Environment.JAKARTA_JDBC_PASSWORD, "root");
	ps.put(Environment.HBM2DDL_AUTO, "update");
	ps.put(Environment.SHOW_SQL, "true");
	ps.put(Environment.FORMAT_SQL, "true");
	
//	StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().applySettings(ps).build();
//	MetadataSources metadataSources=new MetadataSources(ssr).addAnnotatedClass( com.hibernate.entity.Employee.class);
//  		SessionFactory sessionFactory=	metadataSources.getMetadataBuilder().build().buildSessionFactory() ;
	
  		return new MetadataSources(new StandardServiceRegistryBuilder().applySettings(ps).build()).addAnnotatedClass( com.hibernate.entity.Employee.class).getMetadataBuilder().build().buildSessionFactory() ;
	 }
}  