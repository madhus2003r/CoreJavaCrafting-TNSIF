package com.tns.daynine.exception;

import java.io.IOException;

public class CheckedExceptionDemo {

	public static void main(String[] args) {

		   

		 try {
			 
			 String str = Checkedexception.acceptText(); //read line from console
			 System.out.println("Your string is " +str);
		 }catch(IOException e) {
			 System.out.println("An error oocured while reading input " +e.getMessage());
		 }
		

	}

}
