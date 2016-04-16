package com.basic.rms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.basic.rms.dao.bean.RoleBean;
import com.basic.rms.dao.impl.AddEmployeeDao;
import com.basic.rms.dao.impl.ManagerListDao;
import com.basic.rms.pojo.AddUserPojo;
import com.basic.rms.pojo.ManagerPojo;

@Service
public class AddEmployeeServiceImpl implements AddEmployeeService{
	
	@Autowired
	private AddEmployeeDao addEmployeeDao;
	
	@Autowired
	private ManagerListDao managerListDao;
	
	public boolean getaddEmployeeDetail(AddUserPojo pojo) {
		return addEmployeeDao.isAddEmployeeData(pojo);
		
	}

	public List<ManagerPojo> getManagerList() {
		return managerListDao.getManagerList();
	}

	
	public  List<RoleBean> getRoleListService(){
		return addEmployeeDao.getRoleList();
		
	}
}
