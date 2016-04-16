package com.basic.rms.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.basic.rms.constants.Constant;
import com.basic.rms.service.LeaveRequestService;

@Controller
public class LeaveRequestController {
	
	@Autowired
	private LeaveRequestService leaveRequestService; 
	
	@RequestMapping(value="leaveRequestUser")
	public String leaveRequestpage() {
		return "/hr/leaveRequest";
	}
	
	@RequestMapping(value="leaveForRequest")
	private String leaveRequest(HttpServletRequest req, HttpSession session) {
		try {
			String from = req.getParameter("leaveFrom");
			String to = req.getParameter("leaveTo");
			if (from != null && to != null && session != null) {
			DateFormat dateFormat = new SimpleDateFormat("yy-mm-dd");
			Date leaveFromDate = dateFormat.parse(from);
			Date leaveToDate = dateFormat.parse(to);
			String empCode = (String) session.getAttribute(Constant.EMPLOYEE_CODE);
			
			boolean empLeave = leaveRequestService.isLeaveRequest( leaveFromDate, leaveToDate, empCode);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "dashbord";
		
	}
}
