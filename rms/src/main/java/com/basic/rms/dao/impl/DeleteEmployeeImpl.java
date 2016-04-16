package com.basic.rms.dao.impl;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.basic.rms.dao.util.HibernateUtil;

@Repository
public class DeleteEmployeeImpl implements DeleteEmployeeDao{

	
	public boolean deleteEmployee(String empCode) {
		SessionFactory factory = null;
		Session session = null;
		Transaction tx = null;
		boolean status = false;
		try {
			factory = HibernateUtil.getSessionFactory();
			session= factory.openSession();
			tx = session.beginTransaction();
			
			String hql = "delete from EmployeeBean emp where emp.empCode = :empCode";
			Query query = session.createQuery(hql).setString("empCode", empCode);
			int result = query.executeUpdate();
			tx.commit();
			session.close();
			if(result > 0){
				status = true;
			}
		} catch (Exception e) {
			tx.rollback();
			session.close();
			
		}
		return status;
	}
}
