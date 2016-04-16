package com.basic.rms.dao.impl;

import java.util.Date;

public interface LeaveRequestDao {
	public boolean isLeaveRequest(Date leaveFromDate, Date leaveToDate,String empCode, int noOdDays);
}
