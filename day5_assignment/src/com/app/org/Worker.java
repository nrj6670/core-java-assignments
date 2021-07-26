package com.app.org;

public class Worker extends Emp {
	private int hoursWorked;
	private double hourlyRate;
	
	public Worker(int empId, String name, String deptId, double basic, double hourlyRate, int hoursWorked) {
		super(empId, name, deptId, basic);
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
	}
	
	@Override
	
	public String toString() {
		return "Worker information : " + super.toString() + ", Hourly rate = " + this.hourlyRate + ", Hours worked = " + this.hoursWorked;
	}
	
	@Override
	public double computeNetSalary() {
		return super.getBasic() + this.hourlyRate * this.hoursWorked;
	}
	
	//additional functionality
	public double getHourlyRate() {
		return this.hourlyRate;
	}
	
	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
}
