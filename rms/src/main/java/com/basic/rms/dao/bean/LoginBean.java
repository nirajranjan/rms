package com.basic.rms.dao.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tbl_login")
public class LoginBean {

	@Id
	@GeneratedValue
	@Column(name="log_id")
	private int logId;
	
	@Column(name="log_pwd")
	private String logPassword;
	
	@ManyToOne
    @JoinColumn(name="fk_emp")
	private EmployeeBean employee;

	public int getLogId() {
		return logId;
	}

	public void setLogId(int logId) {
		this.logId = logId;
	}

	public String getLogPassword() {
		return logPassword;
	}

	public void setLogPassword(String logPassword) {
		this.logPassword = logPassword;
	}

	public EmployeeBean getEmployee() {
		return employee;
	}

	public void setEmployee(EmployeeBean employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "LoginBean [logId=" + logId + ", logPassword=" + logPassword + ", employee=" + employee + "]";
	}
	
	
}
