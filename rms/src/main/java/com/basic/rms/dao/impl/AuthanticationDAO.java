package com.basic.rms.dao.impl;

import java.util.List;

import com.basic.rms.pojo.AuthenticationPojo;

public interface AuthanticationDAO {

	public List<AuthenticationPojo> getAuthanticationData(String uname, String pwd);
}
