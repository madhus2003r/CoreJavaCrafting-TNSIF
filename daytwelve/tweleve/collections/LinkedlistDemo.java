package com.tns.day.tweleve.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedlistDemo {

	public static void main(String[] args) {

      LinkedList <String> ll = new LinkedList<String>();
      
      ll.add("Hello");
      ll.add("TNSIF");
      ll.add("java");
      
      Iterator <String> itt = ll.iterator();
      while(itt.hasNext()) {
    	  System.out.println(itt.next());
      }
      

	}

}