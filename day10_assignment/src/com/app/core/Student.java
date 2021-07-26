package com.app.core;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Student {
	private String prn;
	private String name;
	private String email;
	@SuppressWarnings("unused")
	private String password;
	private double gpa;
	private Date dob;
	private Course cr;
	public static SimpleDateFormat sdf;
	
	static {
		sdf = new SimpleDateFormat("dd-mm-yyyy");
	}
	
	public Student(String prn, String name, String email, String password, double gpa, Date dob, Course cr) {
		this.prn = prn;
		this.name = name;
		this.email = email;
		this.password = password;
		this.gpa = gpa;
		this.dob = dob;
		this.cr = cr;
	}
	
	public Student(String prn) {
		this.prn = prn;
	}
	
	public double getGPA() {
		return this.gpa;
	}
	
	public void setGPA(double newGpa) {
		this.gpa = newGpa;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "Student information : \n" + "Name = " + this.name + ", PRN = " + this.prn + ", Course = " + this.cr + 
				", Email = " + this.email + ", DOB = " + sdf.format(this.dob) + ", GPA = " + this.gpa;
	}
	
	@Override
	public boolean equals(Object anotherStudent) {
		if(anotherStudent instanceof Student) {
			return this.prn.equals(((Student)anotherStudent).prn);
		}
		return false;
	}
}
