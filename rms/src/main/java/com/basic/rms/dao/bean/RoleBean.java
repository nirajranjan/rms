package com.basic.rms.dao.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tbl_role")
public class RoleBean {
	
	@Id
	@GeneratedValue
	@Column(name="r_id")
	private int roleId;
	
	@Column(name="r_role")
	private String role;
	
	@ManyToOne
    @JoinColumn(name="fk_emp")
	private EmployeeBean employee;

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public EmployeeBean getEmployee() {
		return employee;
	}

	public void setEmployee(EmployeeBean employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "RoleBean [roleId=" + roleId + ", role=" + role + ", employee=" + employee + "]";
	}
	
	

}
