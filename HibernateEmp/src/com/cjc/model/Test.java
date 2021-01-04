package com.cjc.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Test {
	public static void main(String[] args) {
		StandardServiceRegistry registry=new StandardServiceRegistryBuilder().configure().build();
		MetadataSources mds=new MetadataSources(registry);
		Metadata md=mds.getMetadataBuilder().build();
		SessionFactory sessionfactory=md.getSessionFactoryBuilder().build();
		Session session=sessionfactory.openSession();
		
		Employee emp=new Employee();
		emp.setEmpid(11);
		emp.setEmpname("Prakash");
		emp.setEmpaddr("Ravet");
		
		//Employee emp1=new Employee();
		//emp1.setEmpid(22);
		//emp1.setEmpname("Sachin");
		//emp1.setEmpaddr("Yeoda");
		//session.save(emp);
		//session.save(emp1);
		session.beginTransaction().commit();
		System.out.println("Hibernate Annotation");
		//sessionfactory.close();
}
}