package com.app.org;

public class Manager extends Emp {
	private double performanceBonus;
	
	public Manager(int empId, String name, String deptId, double basic, double performanceBonus) {
		super(empId, name, deptId, basic);
		this.performanceBonus = performanceBonus;
	}
	
	@Override
	public String toString() {
		return "Manager details : " + super.toString() + ", Performance bonus = " + this.performanceBonus;
	}
	
	@Override
	public double computeNetSalary() {
		return super.getBasic() + this.performanceBonus;
	}
	
	//additional functionality
	public double getPerformanceBonus() {
		return this.performanceBonus;
	}
	
	public void setPerformanceBonus(double performanceBonus) {
		this.performanceBonus = performanceBonus;
	}
	
	
}
