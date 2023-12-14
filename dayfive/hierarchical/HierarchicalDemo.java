package com.tns.dayfive.hierarchical;

public class HierarchicalDemo {

	public static void main(String[] args) {
	
		Person p = new Person();
		System.out.println(p);
		
		
		Person p1;
		
		p1= new Person("sai","bangalore");
		System.out.println(p1);
		
		p1 = new Employee("sai","bangalore",101,100000,"IT");
		if( p1 instanceof Employee)
			System.out.println(p1);
		
		p1 = new Student ("kumar","bangalore","FCD",90);
		
		if( p1 instanceof Student)
			System.out.println(p1);
	}

}
