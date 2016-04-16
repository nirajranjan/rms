package com.basic.rms.service;

import java.util.List;

import com.basic.rms.pojo.AuthenticationPojo;

public interface AuthanticationService {

	public List<AuthenticationPojo> isAuthanticated(String uname, String pwd);
}
