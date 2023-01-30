package com.example.jsonsample;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Employee {
	
	@JsonProperty("emp_id")
	private long empId;
	private String name;
	private String cmpName;
	
	public Employee(long empId, String name, String cmpName) {
		super();
		this.empId = empId;
		this.name = name;
		this.cmpName = cmpName;
	}
	public Employee(){
		
	}
	public long getEmpId() {
		return empId;
	}
	public void setEmpId(long empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCmpName() {
		return cmpName;
	}
	public void setCmpName(String cmpName) {
		this.cmpName = cmpName;
	}
	

}
