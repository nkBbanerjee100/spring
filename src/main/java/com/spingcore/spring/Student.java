package com.spingcore.spring;

public class Student {

		public Student(int studentId, String sname, String studentAddress) {
		super();
		this.studentId = studentId;
		this.sname = sname;
		this.studentAddress = studentAddress;
	}
		public Student() {
		super();
	}
		@Override
		public String toString() {
			return "Student [studentId=" + studentId + ", sname=" + sname + ", studentAddress=" + studentAddress
					+ ", getStudentId()=" + getStudentId() + ", getSname()=" + getSname() + ", getStudentAddress()="
					+ getStudentAddress() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
					+ ", toString()=" + super.toString() + "]";
		}
		public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		System.out.println("setting student ID");
		this.studentId = studentId;
	}
	public String getSname() {
		
		return sname;
	}
	public void setSname(String sname) {
		System.out.println("setting student Name");
		this.sname = sname;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		System.out.println("setting student Address");
		this.studentAddress = studentAddress;
	}
		// bean -> holds the data
		private int studentId;
		private String sname;
		private String studentAddress;
	

}
