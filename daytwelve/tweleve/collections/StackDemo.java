package com.tns.day.tweleve.collections;

import java.util.Iterator;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {

      Stack <String> stack = new Stack <String>();
      
      stack.push("Hi");
      stack.push("Good");
      stack.push("welcome");
      stack.push("RgIT");
      
      
      stack.pop();
      stack.pop();
      
      Iterator <String> itt = stack.iterator();
      
      while(itt.hasNext()) {
    	  
    	  System.out.println(itt.next());
      }
      
      
      
      
     
      

	}

}