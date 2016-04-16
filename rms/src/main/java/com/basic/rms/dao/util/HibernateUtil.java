package com.basic.rms.dao.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HibernateUtil {

	private static SessionFactory sessionFactory;
	
	static {
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure();
		sessionFactory = cfg.buildSessionFactory();
	}
	
	public static SessionFactory getSessionFactory(){
		return sessionFactory;
	}
	
}
