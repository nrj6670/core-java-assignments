package com.app.org;

public abstract class Emp {
	private int empId;
	private String name;
	private String deptId;
	private double basic;
	
	public Emp(int empId, String name, String deptId, double basic) {
		this.empId = empId;
		this.name = name;
		this.deptId = deptId;
		this.basic = basic;
	}
	
	@Override
	public String toString() {
		return "Name = " + this.name + ", Employee id = " + this.empId + ", Department = " + this.deptId + ", Basic = " + this.basic;
	}
	
	public abstract double computeNetSalary();

	public double getBasic() {
		return basic;
	}
	
	public int getEmployeeId() {
		return this.empId;
	}
	
	
}
