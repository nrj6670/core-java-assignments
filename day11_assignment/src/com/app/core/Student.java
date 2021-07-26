package com.app.core;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Student implements Comparable<Student> {
	private int prn;
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
	
	public Student(int prn, String name, String email, String password, double gpa, Date dob, Course cr) {
		this.prn = prn;
		this.name = name;
		this.email = email;
		this.password = password;
		this.gpa = gpa;
		this.dob = dob;
		this.cr = cr;
	}
	
	public Student(int prn) {
		this.prn = prn;
	}
	
	public static boolean hasStudentFailed(Student student) {
		if(student.getGpa() < 5.0) {
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "Student : PRN = " + this.prn + ", NAME = " + this.name  + ", EMAIL = " + this.email
				+ ", D.O.B = " + sdf.format(this.dob) + ", COURSE = " + this.cr + ", GPA = " + this.gpa;
	}
	
	@Override
	public boolean equals(Object anotherStudent) {
		if(anotherStudent instanceof Student) {
			return this.prn == ((Student)anotherStudent).prn;
		}
		return false;
	}
	
	public Course getCr() {
		return cr;
	}

	private void setCr(Course cr) {
		this.cr = cr;
	}

	public Date getDob() {
		return dob;
	}

	private void setDob(Date dob) {
		this.dob = dob;
	}

	public double getGpa() {
		return this.gpa;
	}

	private void setGpa(double gpa) {
		this.gpa = gpa;
	}

	@Override
	public int compareTo(Student anotherStudent) {
		if(this.prn < anotherStudent.prn) {
			return -1; 
		} else if(this.prn == anotherStudent.prn) {
			return 0;
		} else {
			return 1;
		}
	}
}
