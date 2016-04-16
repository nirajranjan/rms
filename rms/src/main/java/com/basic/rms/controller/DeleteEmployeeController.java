package com.basic.rms.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.basic.rms.service.DeleteEmployeeService;

@Controller
public class DeleteEmployeeController {

	@Autowired
	private DeleteEmployeeService deleteEmployeeservice;

	@RequestMapping(value = "deleteUser")
	public String deleteEmployeePage() {

		return "deleteEmployee";

	}

	@RequestMapping("deleteEmployee")
	public String deleteEmployee(HttpServletRequest req) {
		String empCode = req.getParameter("empCode");

		boolean deleteEmployeedetail = deleteEmployeeservice.isdeleteEmployee(empCode);

		if (deleteEmployeedetail) {
			return "dashbord";
		}
		return "deleteEmployee";

	}
}
