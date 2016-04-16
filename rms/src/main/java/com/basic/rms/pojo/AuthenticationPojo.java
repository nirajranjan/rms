package com.basic.rms.pojo;

import java.io.Serializable;

public class AuthenticationPojo implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8940088156441336691L;
	private String role;
	private String code;
	private String password;
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "AuthenticationPojo [role=" + role + ", code=" + code + ", password=" + password + "]";
	}
	
	
}
