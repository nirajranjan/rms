package com.basic.rms.service;

import java.util.List;

import com.basic.rms.pojo.EmployeeLeaveRequestPojo;

public interface LeaveApproveService {
	public List<EmployeeLeaveRequestPojo> getEmployeeRequestLeave(String managerCode);
}
