package com.basic.rms.controller;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.basic.rms.pojo.AddUserPojo;
import com.basic.rms.service.AddEmployeeService;

@Controller
public class AddEmployeeController {

	@Autowired
	private AddEmployeeService addEmployeeService;

	@RequestMapping(value = "addUser")
	public String addEmployee(HttpSession session) {
		/*
		 * String name = req.getParameter("employeeName"); String code =
		 * req.getParameter("employeeCode"); String address =
		 * req.getParameter("employeeAddress"); String password =
		 * req.getParameter("employeePassword"); String role =
		 * req.getParameter("employeeRole"); boolean empDetail =
		 * addEmployeeService.getaddEmployeeDetail();
		 */
		session.setAttribute("roleList", addEmployeeService.getRoleListService());
		session.setAttribute("managerList", addEmployeeService.getManagerList());
		return "addEmployee";
	}

	@RequestMapping(value = "addUserData")
	public String addUserData(HttpServletRequest req, HttpSession session) {
		String from = req.getParameter("dateOfJoining");

		DateFormat dateFormat = new SimpleDateFormat("yy-mm-dd");
		Date dateOfJoining = null;;
		try {
			dateOfJoining = dateFormat.parse(from);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String name = req.getParameter("employeeName");
		String code = req.getParameter("employeeCode");
		String address = req.getParameter("employeeAddress");
		String password = req.getParameter("employeePassword");
		String role = req.getParameter("employeeRole");
		int managerId = Integer.parseInt(req.getParameter("managerId"));
		// AddUserPojo addPojo = new AddUserPojo(name, address, code, role,
		// password, managerId, from);
		AddUserPojo addPojo = new AddUserPojo(name, address, code, role, password, managerId, dateOfJoining);

		boolean empDetail = addEmployeeService.getaddEmployeeDetail(addPojo);
		return "dashbord";
	}

}
