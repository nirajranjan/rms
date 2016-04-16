package com.basic.rms.service;



import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.basic.rms.dao.impl.LeaveRequestDao;

@Service
public class LeaveRequestServiceImpl implements LeaveRequestService{

	@Autowired
	private LeaveRequestDao leaveRequestDao;
	public boolean isLeaveRequest(Date leaveFromDate, Date leaveToDate,String empCode) {
		
		int noOfDays = daysBetween(leaveFromDate, leaveToDate);
		if(noOfDays > 0){
		leaveRequestDao.isLeaveRequest(leaveFromDate, leaveToDate, empCode,noOfDays);
		}
		return false;
	}

	 private int daysBetween(Date d1, Date d2){
         return (int)( (d2.getTime() - d1.getTime()) / (1000 * 60 * 60 * 24));
 }
}
