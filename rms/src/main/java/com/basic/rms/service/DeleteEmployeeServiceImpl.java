package com.basic.rms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.basic.rms.dao.impl.DeleteEmployeeDao;

@Service
public class DeleteEmployeeServiceImpl implements DeleteEmployeeService{

	@Autowired
	public DeleteEmployeeDao deleteEmployeeDao; 
	
	public boolean isdeleteEmployee(String empCode) {
		
		return deleteEmployeeDao.deleteEmployee(empCode);
	}

	
	
}
