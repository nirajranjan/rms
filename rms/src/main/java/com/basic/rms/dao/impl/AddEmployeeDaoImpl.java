package com.basic.rms.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.basic.rms.dao.bean.EmployeeBean;
import com.basic.rms.dao.bean.EmployeeManagerBean;
import com.basic.rms.dao.bean.LoginBean;
import com.basic.rms.dao.bean.RoleBean;
import com.basic.rms.dao.util.HibernateUtil;
import com.basic.rms.pojo.AddUserPojo;

@Repository
public class AddEmployeeDaoImpl implements AddEmployeeDao{

	public boolean isAddEmployeeData(AddUserPojo pojo) {
		SessionFactory factory = null;
		Session session = null;
		Transaction tx = null;
		try {
			factory = HibernateUtil.getSessionFactory();
			session = factory.openSession();
			tx = session.beginTransaction();
			
			EmployeeBean employee = new EmployeeBean();
			employee.setEmpAdd(pojo.getAddress());
			employee.setEmpCode(pojo.getCode());
			employee.setEmpName(pojo.getName());
			employee.setEmpDateOfJoining(pojo.getEmpDateOfJoining());
			
			LoginBean login = new LoginBean();
			login.setLogPassword(pojo.getPassword());
			
			RoleBean role= new RoleBean();
			role.setRole(pojo.getRole());
			
			EmployeeManagerBean empManagerBean = new EmployeeManagerBean();
			empManagerBean.setEmployee(employee);
			empManagerBean.setEmpManager(pojo.getManagerId());
			
			session.save(employee);
			
			role.setEmployee(employee);
			session.save(role);
			
			login.setEmployee(employee);
			session.save(login);
			
			session.save(empManagerBean);
			tx.commit();
			
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		} finally {
			if(session != null){
			session.close();
			}
		}
		return false;
	}
	
	public  List<RoleBean> getRoleList() {

		SessionFactory factory = null;
		Session session = null;
		List<RoleBean> roleList = null;
		try {
			factory = HibernateUtil.getSessionFactory();
			session = factory.openSession();
			String hql = "select DISTINCT roleBean.role  from RoleBean roleBean";
			Query query =  session.createQuery(hql);
			roleList = query.list();
			System.out.println(roleList);
		} catch(Exception e) {
			e.getMessage();
		}
		return roleList;
	}
}
