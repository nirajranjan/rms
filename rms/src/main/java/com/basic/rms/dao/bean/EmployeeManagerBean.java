package com.basic.rms.dao.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tbl_e_manager")
public class EmployeeManagerBean {
	
	
	@Id
	@Column(name = "e_manager")
	private int empManager;

	@ManyToOne
    @JoinColumn(name="fk_emp")
	private EmployeeBean employee;

	public int getEmpManager() {
		return empManager;
	}

	public void setEmpManager(int empManager) {
		this.empManager = empManager;
	}

	public EmployeeBean getEmployee() {
		return employee;
	}

	public void setEmployee(EmployeeBean employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "EmployeeManagerBean [empManager=" + empManager + ", employee=" + employee + "]";
	}
	
	

}
