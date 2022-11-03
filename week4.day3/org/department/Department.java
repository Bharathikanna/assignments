package org.department;

import org.college.College;

public class Department extends College {
	public void departmentName() {
		System.out.println("Civil Engineering");
	}
	public static void main(String[] args) {
		Department department=new Department();
		department.collegeName();
		department.collegeCode();
		department.collegeRank();
		
	}
	

}
