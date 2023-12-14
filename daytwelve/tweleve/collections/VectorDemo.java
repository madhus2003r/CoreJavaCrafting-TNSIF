package com.tns.day.tweleve.collections;

import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		
		Vector <String> vv = new Vector<String>();
		
		vv.add("Good");
		vv.add("evening");
		vv.add("all");
		
		Iterator <String> itr = vv.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}


	}

}


