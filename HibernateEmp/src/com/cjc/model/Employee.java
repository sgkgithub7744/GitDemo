package com.cjc.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
//if we dont write @Entity, it will give mapping exception
public class Employee {
@Id
//if we dont write @Entity, it will give annotation exception
	private int empid;
	private String empname;
	private String empaddr;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmpaddr() {
		return empaddr;
	}
	public void setEmpaddr(String empaddr) {
		this.empaddr = empaddr;
	}
	
}
