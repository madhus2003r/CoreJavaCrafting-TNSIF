package com.tns.collections;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Demoset {

	public static void main(String[] args) {


		
		Set <Integer> value = new TreeSet<>();
		value.add(20);
		value.add(20);
		value.add(30);
		value.add(120);
		value.add(50);
		value.add(9);
		
		//Collections.sort(value);
		
		Iterator i = value.iterator();
		
		while (i.hasNext())
		{
			System.out.println(i.next());
		}
		
	}

}
