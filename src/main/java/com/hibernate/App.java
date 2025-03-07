package com.hibernate;

import java.util.List;
import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.hibernate.config.HibernateConfiguration;
import com.hibernate.entity.Employee;

import org.hibernate.Transaction;


public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee e1 =new Employee("Mukul","male",94009);
Employee e2=new Employee("Nishant","male",94009);
Employee e3 =new Employee("Shivang","male",94009);
Employee e4=new Employee("Raj","male",94009);
Employee e5 =new Employee("Ram","male",94009);
SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();



Session session=sessionFactory.openSession();
	//session.save(e);//It can be used with auto inc.(generator) does not give error.
//	session.persist(e1);//but it can not used with this.
//	session.persist(e2);
//	session.persist(e3);
//	session.persist(e4);
//	session.persist(e5);
//	session.beginTransaction().commit();
//sessionFactory.close();
//
//Query query=session.createQuery("from Employee",Employee.class);
//List list= query.list();
//System.out.println(list);
//sessionFactory.close();

//Query query=session.createQuery("from Employee");
//query.setFirstResult(3);
//query.setMaxResults(7);
//List list=query.list();
//System.out.println(list);
//sessionFactory.close();

Transaction tx=session.beginTransaction();
Query query=session.createQuery("update Employee set name=:n where id=:i ");
query.setParameter("n", "Aviral");
query.setParameter("i", 3);
query.executeUpdate();
tx.commit();

Query query1=session.createQuery("from Employee",Employee.class);
List list=query.list();
System.out.println(list);
sessionFactory.close();

	}

}
