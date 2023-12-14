package com.tns.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class CollectionDemo {

	public static void main(String[] args) {

     int values [] = new int[4];
     
//     Object values1 [] = new Object[4];
//     
//     values1[0]=1;
//     values1[1]="hi";
//     values1[2]=6.7f;
     
     ArrayList <Integer>value = new ArrayList<>();
     
     value.add(30);
     value.add(20);
     value.add(70);
     value.add(100);
     value.add(34);
     value.add(34);
     
     Collections.sort(value);
     
     //Iterator
     //enhanced for loop
     //lambda
     
		/*
		 * Iterator i = value.iterator();
		 * 
		 * while(i.hasNext()) { System.out.println(i.next()); }
		 */
     
     
     
     
     

	}

}
