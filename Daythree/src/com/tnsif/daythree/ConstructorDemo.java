package com.tnsif.daythree;
import java.util.Scanner;

public class ConstructorDemo {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String name, city;
		int id;
		System.out.println("Enter customer Id: ");
		id = sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter the customer name: ");
		name = sc.nextLine();
		
		System.out.println("Enter the customer City: ");
		city = sc.nextLine();
		
		System.out.println("   ");
		
		Customer c1 = new Customer ();  //default constructor invoked
		c1.setCustomerName(name);
		c1.setCustmerId(id);
		c1.setCustomerCity(city);
		System.out.println(c1);
		
		System.out.println("Enter customer Id: ");
		id = sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter the customer name: ");
		name = sc.nextLine();
		
		System.out.println("Enter the customer City: ");
		city = sc.nextLine();
		
		Customer  c2 = new Customer (name ,id ,city); //parameterized constructor
		
		System.out.println(c2);
		sc.close();
		
		

	}


}
