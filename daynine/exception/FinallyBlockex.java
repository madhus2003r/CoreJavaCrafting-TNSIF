package com.tns.daynine.exception;

public class FinallyBlockex {
	
	public static void divide(int a, int b)
	{
		
		try {
			System.out.println(".....within try block.....");
			int result = a / b;
			System.out.println("Result is:" +result);
			
		}catch(ArithmeticException e) {
			System.out.println("ArithmeticException caught:" +e.getMessage());
		}
		finally {
			System.out.println("Finally block.....");
		}
		
		System.out.println("statment after finally block");
	}

}
