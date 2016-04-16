package com.basic.rms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DashbordController {
	
	@RequestMapping(value="")
	public String showDashbord(){
		return null;
		
	}
}
