package com.tns.daysix.association.hasa;

public class Executor {

	public static void main(String[] args) {
	
		Address ad = new Address("cholanagar","bangalore","karnataka","560032");
		Person p = new Person("sai",ad);
		
		p.displayInfo();
		

	}

}
