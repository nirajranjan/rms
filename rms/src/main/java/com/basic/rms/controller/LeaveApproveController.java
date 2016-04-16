package com.basic.rms.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.basic.rms.constants.Constant;
import com.basic.rms.pojo.EmployeeLeaveRequestPojo;
import com.basic.rms.service.LeaveApproveService;

@Controller
public class LeaveApproveController {

	@Autowired
	private LeaveApproveService leaveApproveService;

	@RequestMapping(value = "leaveApporavalUser")
	public String leaveApproval(HttpServletRequest request, HttpSession session) {

		String managerCode = (String) session.getAttribute(Constant.EMPLOYEE_CODE);
		
		session.setAttribute("employeeLeaveApproval", leaveApproveService.getEmployeeRequestLeave(managerCode));

		/*String from = request.getParameter("leaveDateEmployeeFrom");
		String to = request.getParameter("leaveDateEmployeeTo");

		DateFormat dateFormat = new SimpleDateFormat("yy-mm-dd");
		Date leaveDateEmployeeFrom = null;
		Date leaveDateEmployeeTo = null;
		try {
			leaveDateEmployeeFrom = dateFormat.parse(from);
			leaveDateEmployeeTo = dateFormat.parse(to);
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		/*String empName = request.getParameter("empName");
		String empCode = request.getParameter("empCode");
		String totalNoOfLeave = request.getParameter("totalNoOfLeave").toString();
		String requestedNoOfLeave = request.getParameter("requestedNoOfLeave").toString();
*/
		// EmployeeLeaveRequestPojo leavePojo = new
		// EmployeeLeaveRequestPojo(leaveDateEmployeeFrom, leaveDateEmployeeTo,
		// empName, empCode, totalNoOfLeave, requestedNoOfLeave);

		//List<EmployeeLeaveRequestPojo> empLeavePojo = leaveApproveService.getEmployeeRequestLeave();
		return "/hr/leaveApprove";

	}

}
