package com.chandra.oops;

public class Student {

	private int studentId;
	private String name;
	private long mobileNo;
	private String address;
	private String course;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public double calculateFee(String course) {
		double fee = 0.0d;
		if (course.equals("Java")) {
			fee = 18000;
		} else if (course.equals("UI")) {
			fee = 15000;
		} else if (course.equals("framework")) {
			fee = 14000;
		}
		return fee;
	}

}
