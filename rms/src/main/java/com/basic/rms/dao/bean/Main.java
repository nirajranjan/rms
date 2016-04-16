package com.basic.rms.dao.bean;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.basic.rms.dao.util.HibernateUtil;

public class Main {

	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		System.out.println(factory);
		Session session = factory.openSession();
		/*RoleBean empBean = (RoleBean) session.get(RoleBean.class, 1);
		System.out.println(empBean);*/
		Transaction tx = session.beginTransaction();
		
		/*EmployeeBean manager = new EmployeeBean();
		manager.setEmpAdd("delhi");
		manager.setEmpCode("iris-2223");
		manager.setEmpName("sanjeev");
		//manager.setManager(manager);
		
		EmployeeBean eb = new EmployeeBean();
		eb.setEmpAdd("gurgaon");
		eb.setEmpCode("iris-2222");
		eb.setEmpName("aman");
		session.save(eb);
		session.save(manager);*/
		
		
		
		tx.commit();
		session.close();
		
		
	}
}
