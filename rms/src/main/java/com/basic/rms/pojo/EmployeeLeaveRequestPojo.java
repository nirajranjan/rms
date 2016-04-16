package com.basic.rms.pojo;

import java.io.Serializable;
import java.util.Date;

public class EmployeeLeaveRequestPojo implements Serializable{
	
	private Date requestLeaveFrom;
	private Date requestLeaveTo;
	private String employeName;
	private String employeeCode;
	private int totalNumberOfLeave;
	private int requestNumberOfLeave;
	public EmployeeLeaveRequestPojo() {
	}
	public EmployeeLeaveRequestPojo(Date requestLeaveFrom, Date requestLeaveTo, String employeName, String employeeCode,
			int totalNumberOfLeave, int requestNumberOfLeave) {
		super();
		this.requestLeaveFrom = requestLeaveFrom;
		this.requestLeaveTo = requestLeaveTo;
		this.employeName = employeName;
		this.employeeCode = employeeCode;
		this.totalNumberOfLeave = totalNumberOfLeave;
		this.requestNumberOfLeave = requestNumberOfLeave;
	}
	public Date getRequestLeaveFrom() {
		return requestLeaveFrom;
	}
	public void setRequestLeaveFrom(Date requestLeaveFrom) {
		this.requestLeaveFrom = requestLeaveFrom;
	}
	public Date getRequestLeaveTo() {
		return requestLeaveTo;
	}
	public void setRequestLeaveTo(Date requestLeaveTo) {
		this.requestLeaveTo = requestLeaveTo;
	}
	public String getEmployeName() {
		return employeName;
	}
	public void setEmployeName(String employeName) {
		this.employeName = employeName;
	}
	public String getEmployeeCode() {
		return employeeCode;
	}
	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}
	public int getTotalNumberOfLeave() {
		return totalNumberOfLeave;
	}
	public void setTotalNumberOfLeave(int totalNumberOfLeave) {
		this.totalNumberOfLeave = totalNumberOfLeave;
	}
	public int getRequestNumberOfLeave() {
		return requestNumberOfLeave;
	}
	public void setRequestNumberOfLeave(int requestNumberOfLeave) {
		this.requestNumberOfLeave = requestNumberOfLeave;
	}
	@Override
	public String toString() {
		return "EmployeeLeaveRequestPojo [requestLeaveFrom=" + requestLeaveFrom + ", requestLeaveTo=" + requestLeaveTo
				+ ", employeName=" + employeName + ", employeeCode=" + employeeCode + ", totalNumberOfLeave="
				+ totalNumberOfLeave + ", requestNumberOfLeave=" + requestNumberOfLeave + "]";
	}
	
	

}
