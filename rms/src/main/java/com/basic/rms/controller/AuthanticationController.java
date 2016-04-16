package com.basic.rms.controller;

import java.util.List;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.basic.rms.constants.Constant;
import com.basic.rms.pojo.AuthenticationPojo;
import com.basic.rms.service.AuthanticationService;

import sun.rmi.log.LogOutputStream;

@Controller
public class AuthanticationController {

	@Autowired
	private AuthanticationService authanticationService;

	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String login(HttpServletRequest request) {

		String uname = request.getParameter("userName");
		String pwd = request.getParameter("password");
		List<AuthenticationPojo> isValidUser = authanticationService.isAuthanticated(uname, pwd);
		if (isValidUser != null && !isValidUser.isEmpty()) {
			HttpSession session = request.getSession();
			AuthenticationPojo pojo = isValidUser.get(0);
			session.setAttribute(Constant.EMPLOYEE_CODE, pojo.getCode());
			session.setAttribute(Constant.EMPLOYEE_ROLE, pojo.getRole());
			return "dashbord";
		} else {
			return "login";
		}
	}
	
	@RequestMapping("logout")
	public String logout(HttpSession session){
		session.invalidate();
		return "login";
		
	}
}
