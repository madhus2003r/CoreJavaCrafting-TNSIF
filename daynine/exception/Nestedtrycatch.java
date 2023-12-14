package com.tns.daynine.exception;

public class Nestedtrycatch {
	
	public static void check() {

		String str = "TNS";
		int slength = str.length();
		
		System.out.println("String length : " +slength);
		String anotherString = null;
		
		int y =6;
		try {
			//Inner try block
			try {
				System.out.println(str.charAt(y));
			}catch(StringIndexOutOfBoundsException ex) {
				System.out.println("Index is out of bounds:" +ex.getMessage());
			}
			System.out.println("String length :" +anotherString.length());
		}catch(NullPointerException np) {
			System.out.println("Excption is thrown " +np.getMessage());
		}
		
	}
	
	

	}


