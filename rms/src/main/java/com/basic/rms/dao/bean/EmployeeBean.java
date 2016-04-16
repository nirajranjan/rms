package com.basic.rms.dao.bean;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_employee")
public class EmployeeBean {

	@Id
	@GeneratedValue
	@Column(name = "e_id")
	private int empId;

	@Column(name = "e_name")
	private String empName;

	@Column(name = "e_code")
	private String empCode;

	@Column(name = "e_add")
	private String empAdd;

	@Column(name = "e_noOfLeave")
	private int empLeave;
	
	@Column(name = "e_dateOfJoining")
	private Date empDateOfJoining;


	@OneToMany(mappedBy = "employee")
	private List<LeaveBean> leaveBean;

	
	public Date getEmpDateOfJoining() {
		return empDateOfJoining;
	}

	public void setEmpDateOfJoining(Date empDateOfJoining) {
		this.empDateOfJoining = empDateOfJoining;
	}

	public int getEmpLeave() {
		return empLeave;
	}

	public void setEmpLeave(int empLeave) {
		this.empLeave = empLeave;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpCode() {
		return empCode;
	}

	public void setEmpCode(String empCode) {
		this.empCode = empCode;
	}

	public String getEmpAdd() {
		return empAdd;
	}

	public void setEmpAdd(String empAdd) {
		this.empAdd = empAdd;
	}

	public List<LeaveBean> getLeaveBean() {
		return leaveBean;
	}

	public void setLeaveBean(List<LeaveBean> leaveBean) {
		this.leaveBean = leaveBean;
	}

	@Override
	public String toString() {
		return "EmployeeBean [empId=" + empId + ", empName=" + empName + ", empCode=" + empCode + ", empAdd=" + empAdd
				+ ", empLeave=" + empLeave + ", empDateOfJoining=" + empDateOfJoining + ", leaveBean=" + leaveBean
				+ "]";
	}

	

	
}
