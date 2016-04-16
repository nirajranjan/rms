package com.basic.rms.dao.impl;


import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.basic.rms.constants.Constant;
import com.basic.rms.dao.bean.EmployeeBean;
import com.basic.rms.dao.bean.LeaveBean;
import com.basic.rms.dao.util.HibernateUtil;
@Repository
public class LeaveRequestDaoImpl implements LeaveRequestDao{

	public boolean isLeaveRequest(Date leaveFromDate, Date leaveToDate,String empCode, int noOdDays) {

		SessionFactory factory = null;
		Session session = null;
		Transaction tx = null;
		try {
			factory = HibernateUtil.getSessionFactory();
			session = factory.openSession();
			tx = session.beginTransaction();
			String hql = "from EmployeeBean emp where emp.empCode = :empCode";
			Query query =session.createQuery(hql).setString("empCode", empCode);
			List<EmployeeBean> employeeList = query.list();
			EmployeeBean employee = employeeList.get(0);
			
			int empLeave = employee.getEmpLeave();
			
			if(empLeave >= noOdDays){
				//employee.setEmpLeave(empLeave - noOdDays);
				LeaveBean lbean = new LeaveBean();
				lbean.setEmployee(employee);
				lbean.setLeaveFrom(leaveFromDate);
				lbean.setLeaveTo(leaveToDate);
				lbean.setLeaveNoOfLeave(noOdDays);
				lbean.setLeaveStatus(Constant.EMPLOYEE_LEAVE_STATUS);
				session.save(lbean);
				//session.update(employee);
				tx.commit();
				session.close();
			}
			
			
		} catch (Exception e) {
		tx.rollback();
		session.close();
		e.printStackTrace();
		}
		
		return false;
	}

		
	
	}


