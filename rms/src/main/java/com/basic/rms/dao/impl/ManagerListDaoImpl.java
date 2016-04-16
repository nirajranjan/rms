package com.basic.rms.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.basic.rms.dao.util.HibernateUtil;
import com.basic.rms.pojo.ManagerPojo;

@Repository
public class ManagerListDaoImpl implements ManagerListDao {

	public List<ManagerPojo> getManagerList() {
		SessionFactory factory = null;
		Session session = null;
		List<ManagerPojo> managerList = null;
		try {
			factory = HibernateUtil.getSessionFactory();
			session = factory.openSession();
			String hql = "SELECT role.r_role,emp.e_name,emp.e_id FROM tbl_employee emp JOIN tbl_role role ON emp.e_id = role.fk_emp WHERE role.r_role = ?";
			Query query = session.createSQLQuery(hql).setString(0, "manager");
			List<Object[]> list = query.list();
			managerList = new ArrayList<ManagerPojo>();
	        for(Object[] arr : list){
	        	ManagerPojo mp = new ManagerPojo(arr[0].toString(), arr[1].toString(), Integer.parseInt(arr[2].toString()));
	        	managerList.add(mp);
	        }
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return managerList;
	}
	

}
