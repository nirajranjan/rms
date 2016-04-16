package com.basic.rms.service;

import java.util.List;

import com.basic.rms.dao.bean.RoleBean;
import com.basic.rms.pojo.AddUserPojo;
import com.basic.rms.pojo.ManagerPojo;

public interface AddEmployeeService {
	public boolean getaddEmployeeDetail(AddUserPojo pojo);
	
	public List<ManagerPojo> getManagerList();
	public  List<RoleBean> getRoleListService();
}
