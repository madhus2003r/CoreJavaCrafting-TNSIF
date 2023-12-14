package com.tns.day.tweleve.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {

       ArrayList <String> objarray = new ArrayList<String>();//create arraylist
       objarray.add("Basavaraj");
       objarray.add("lavanya");
       objarray.add("kousalya");
       objarray.add("TNSIF");
       objarray.add("RGIT");
      
       
       //display the arraylist
       Iterator<String> it =objarray.iterator();
       
       while(it.hasNext()) {
    	   
    	   System.out.println(it.next());
       }
		
	}

}

