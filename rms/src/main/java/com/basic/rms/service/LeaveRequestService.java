package com.basic.rms.service;

import java.util.Date;

public interface LeaveRequestService {
	public boolean isLeaveRequest(Date leaveFromDate, Date leaveToDate,String empCode);
}
