package com.tns.dayten.threads;

public class ThreadDemo {

	public static void main(String[] args) {


		ChildThread t1 = new ChildThread(5,"first");
		ChildThread t2 = new ChildThread(10,"second");
		
		t1.start();
		
		t2.start();
		
		System.out.println((".......end of main......... "));

	}

}
