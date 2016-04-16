package com.basic.rms.pojo;

import java.io.Serializable;

public class ManagerPojo implements Serializable{
	
	
	private static final long serialVersionUID = -8059977179930405554L;
	private String empName;
	private int empId;
	private String rRole;
	public ManagerPojo(){}
	
	public ManagerPojo( String rRole,String empName, int empId) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.rRole = rRole;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getrRole() {
		return rRole;
	}
	public void setrRole(String rRole) {
		this.rRole = rRole;
	}
	@Override
	public String toString() {
		return "ManagerPojo [empName=" + empName + ", empId=" + empId + ", rRole=" + rRole + "]";
	}
	
	
}
