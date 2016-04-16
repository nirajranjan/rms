package com.basic.rms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.basic.rms.dao.impl.AuthanticationDAO;
import com.basic.rms.pojo.AuthenticationPojo;

@Service
public class AuthanticationServiceImpl implements AuthanticationService {

	@Autowired
	private AuthanticationDAO authanticationDao;

	public List<AuthenticationPojo> isAuthanticated(String uname, String pwd) {
		List<AuthenticationPojo> userList = authanticationDao.getAuthanticationData(uname, pwd);
		/*if (userList == null || userList.isEmpty()) {
			return false;
		} else {
			return true;
		}*/
		return userList;
	}

}
