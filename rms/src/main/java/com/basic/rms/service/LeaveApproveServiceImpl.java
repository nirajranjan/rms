package com.basic.rms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.basic.rms.dao.impl.LeaveApproveDao;
import com.basic.rms.pojo.EmployeeLeaveRequestPojo;

@Service
public class LeaveApproveServiceImpl implements LeaveApproveService{

	@Autowired
	private LeaveApproveDao leaveApproveDao;
	
	public List<EmployeeLeaveRequestPojo> getEmployeeRequestLeave(String managerCode){
		List<EmployeeLeaveRequestPojo> empPojo = leaveApproveDao.getLeaveList(managerCode);
		return empPojo;
		
	}
}
