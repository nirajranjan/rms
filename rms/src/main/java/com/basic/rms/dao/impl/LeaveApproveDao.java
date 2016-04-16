package com.basic.rms.dao.impl;

import java.util.List;

import com.basic.rms.pojo.EmployeeLeaveRequestPojo;

public interface LeaveApproveDao {
	public List<EmployeeLeaveRequestPojo> getLeaveList(String managerCode);
}
