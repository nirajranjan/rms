package com.basic.rms.dao.impl;

import java.util.List;

import com.basic.rms.dao.bean.RoleBean;
import com.basic.rms.pojo.AddUserPojo;

public interface AddEmployeeDao {

	public boolean isAddEmployeeData(AddUserPojo pojo);
	public  List<RoleBean> getRoleList();
}
