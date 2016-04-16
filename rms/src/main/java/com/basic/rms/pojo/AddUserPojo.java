package com.basic.rms.pojo;

import java.io.Serializable;
import java.util.Date;

public class AddUserPojo implements Serializable{

	private static final long serialVersionUID = 1248220671457978469L;
	private String name;
	private String address;
	private String code;
	private String role;
	private String password;
	private Integer managerId;
	private Date empDateOfJoining;
		
	
	public Date getEmpDateOfJoining() {
		return empDateOfJoining;
	}
	public void setEmpDateOfJoining(Date empDateOfJoining) {
		this.empDateOfJoining = empDateOfJoining;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	public Integer getManagerId() {
		return managerId;
	}
	public void setManagerId(Integer managerId) {
		this.managerId = managerId;
	}
	public AddUserPojo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AddUserPojo(String name, String address, String code, String role, String password,Integer managerId, Date empDateOfJoining) {
		super();
		this.name = name;
		this.address = address;
		this.code = code;
		this.role = role;
		this.password = password;
		this.managerId = managerId;
		this.empDateOfJoining = empDateOfJoining;
	}
	
	
}
