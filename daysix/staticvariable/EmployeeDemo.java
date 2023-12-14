package com.tns.daysix.staticvariable;

public class EmployeeDemo {

	public static void main(String[] args) {

		Employee emp = new Employee("sai",101);
		System.out.println(emp);
		
		System.out.println(Employee.companyName);
		
		

	}

}
