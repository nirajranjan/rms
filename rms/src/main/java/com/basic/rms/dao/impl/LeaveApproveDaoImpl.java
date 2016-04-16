package com.basic.rms.dao.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.basic.rms.dao.bean.EmployeeBean;
import com.basic.rms.dao.util.HibernateUtil;
import com.basic.rms.pojo.EmployeeLeaveRequestPojo;

@Repository
public class LeaveApproveDaoImpl implements LeaveApproveDao{

	public List<EmployeeLeaveRequestPojo> getLeaveList(String managerCode) {
		SessionFactory factory = null;
		Session session = null;
		List<Object[]> empLeaveList = null;
		try {
			factory = HibernateUtil.getSessionFactory();
			session = factory.openSession();
			String hql = "from EmployeeBean emp where emp.empCode =:code";
			
			
			Query query = session.createQuery(hql);
			query.setString("code", managerCode);
			List<EmployeeBean> empList =query.list();
			EmployeeBean emp = empList.get(0);
			int id = emp.getEmpId();
			
			String sql = "SELECT eleave.l_from, eleave.l_to,emp.e_name,emp.e_code,e_noOfLeave,eleave.l_noOfLeave FROM tbl_employee emp JOIN tbl_e_manager empManager ON  emp.e_id = empManager.fk_emp"
					+" JOIN tbl_leave eleave ON  emp.e_id = eleave.fk_emp WHERE eleave.l_status =? AND empManager.e_manager = ?";
			
			System.out.println("sql : "+sql);
			Query query1 = session.createSQLQuery(sql);
			query1.setString(0, "PENDING");
			query1.setInteger(1, id);
			empLeaveList = query1.list();
			session.close();
			
			getEmployeeListFromObject(empLeaveList);
			
			
		} catch (Exception e) {
			e.printStackTrace();
			session.close();
		}
		return getEmployeeListFromObject(empLeaveList);
	}

	private List<EmployeeLeaveRequestPojo> getEmployeeListFromObject(List<Object[]> empLeaveList){
		List<EmployeeLeaveRequestPojo> empList = new ArrayList<EmployeeLeaveRequestPojo>();
		for (Object[] objArray : empLeaveList) {
			EmployeeLeaveRequestPojo emp = new EmployeeLeaveRequestPojo();
			emp.setRequestLeaveFrom((Date)objArray[0]);
			emp.setRequestLeaveTo((Date)objArray[1]);
			emp.setEmployeName(objArray[2].toString());
			emp.setEmployeeCode(objArray[3].toString());
			emp.setTotalNumberOfLeave(Integer.parseInt(objArray[4].toString()));
			emp.setRequestNumberOfLeave(Integer.parseInt(objArray[5].toString()));
			empList.add(emp);
		}
		return empList;
	}
}
