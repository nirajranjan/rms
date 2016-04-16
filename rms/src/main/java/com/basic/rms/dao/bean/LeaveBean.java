package com.basic.rms.dao.bean;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tbl_leave")
public class LeaveBean {
	
	@Id
	@GeneratedValue
	@Column(name="l_id")
	private int leaveId;
	
	@Column(name="l_noOfLeave")
	private int leaveNoOfLeave;
	
	@Column(name="l_from")
	private Date leaveFrom;
	
	@Column(name="l_to")
	private Date leaveTo;
	
	@Column(name="l_status")
	private String leaveStatus;
	
	@ManyToOne
    @JoinColumn(name="fk_emp")
	private EmployeeBean employee;

	public int getLeaveId() {
		return leaveId;
	}

	public void setLeaveId(int leaveId) {
		this.leaveId = leaveId;
	}

	public int getLeaveNoOfLeave() {
		return leaveNoOfLeave;
	}

	public void setLeaveNoOfLeave(int leaveNoOfLeave) {
		this.leaveNoOfLeave = leaveNoOfLeave;
	}

	public Date getLeaveFrom() {
		return leaveFrom;
	}

	public void setLeaveFrom(Date leaveFrom) {
		this.leaveFrom = leaveFrom;
	}

	public Date getLeaveTo() {
		return leaveTo;
	}

	public void setLeaveTo(Date leaveTo) {
		this.leaveTo = leaveTo;
	}

	public String getLeaveStatus() {
		return leaveStatus;
	}

	public void setLeaveStatus(String leaveStatus) {
		this.leaveStatus = leaveStatus;
	}

	public EmployeeBean getEmployee() {
		return employee;
	}

	public void setEmployee(EmployeeBean employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "LeaveBean [leaveId=" + leaveId + ", leaveNoOfLeave=" + leaveNoOfLeave + ", leaveFrom=" + leaveFrom
				+ ", leaveTo=" + leaveTo + ", leaveStatus=" + leaveStatus + ", employee=" + employee + "]";
	}

	
	
	
	
	
}
