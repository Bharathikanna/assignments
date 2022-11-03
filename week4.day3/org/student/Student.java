package org.student;

import org.department.Department;

public class Student extends Department {
	public void studentName() {
		System.out.println("Bharathi kanna M");
	}
	public void studentDept() {
		System.out.println("Civil");
	}
	public void studentId() {
		System.out.println("1811012");
	}
	public static void main(String[] args) {
		Student student =new Student();
		student.collegeCode();
		student.collegeName();
		student.collegeRank();
		student.departmentName();
		student.studentName();
		student.studentDept();
		student.studentId();
	}

}
