package com.tns.day.tweleve.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class UserDefinedDemo {

	public static void main(String[] args) {

    ArrayList<Integer> list = new ArrayList<>();
    list.add(10);
    list.add(70);
    list.add(20);
    list.add(50);
    list.add(100);
    
    //Traversing using foreach
    for(Integer element : list) {
    	
    	System.out.println(element);
    }
    	
    //Traversing using lambda expression
   
   System.out.println("Traversing using lambda expressions");
    list.forEach(element -> System.out.println(element));
   
    System.out.println("Original list" +list);

    Collections.sort(list);
     System.out.println("Sorting in Ascending order " +list);     
    Collections.reverse(list);
    System.out.println("Reverse in  descending order " +list);   
    
    //Lambda Expressions to sort in Descending order using 
    
     ArrayList<Student> studentlist = new ArrayList<Student>();
    Student s1 = new Student(101,"kumar",75);
    studentlist.add(s1);
    
     s1 = new Student(102,"nikil",89);
      studentlist.add(s1);
     
     s1= new Student(103,"loki",90);
      studentlist.add(s1);
      
      s1 = new Student (104,"sri",78);
     studentlist.add(s1);
     
     s1 = new Student (105,"sandeep",100);
     studentlist.add(s1);
      
      System.out.println( studentlist);
    
     
//Colletions sort 
     //Collections.sort(studentlist);
     

    
     Comparator<Student> comp1 = (st1,st2) -> (int)(st1.getPer() - st2.getPer());
     Collections.sort(studentlist,comp1);
      System.out.println("Student details in Acsending order of per :" +studentlist);
     
     Collections.reverse(studentlist);
   
    System.out.println(".................................");
     System.out.println("Student details in Descending order of per: " +studentlist);
    
    
     
//     System.out.println(".............................................");
//     
//     comp1 =(st1,st2) -> st1.getName().compareTo(st2.getName());
//     Collections.sort(studentlist,comp1);
//     System.out.println("Student details in ascending order Name :" +studentlist);
//   
//     
    
	}

}

