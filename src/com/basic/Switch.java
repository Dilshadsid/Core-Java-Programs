package com.basic;

import java.util.Scanner;

//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//
public class Switch {
//	public static void main(String args[]){  
//	  Creating a list of fruits  
//		  List<String> list1=new ArrayList<String>();  
//	  list1.add("Mango");  
//       list1.add("Apple");  
//		  list1.add("Banana");  
//	  list1.add("Grapes");  
//		  //Sorting the list  
//		  Collections.sort(list1);  
//		   //Traversing list through the for-each loop  
//		  for(String fruit:list1)  
//		    System.out.println(fruit);  
//
//}
//	
	public static void main(String[] args) {  
		Scanner s=new Scanner(System.in);
		System.out.println("enter any number");
		
	    int marks=65; 
	    marks=s.nextInt();
	      
	    if(marks<50) 
	        System.out.println("fail");  
	    
	    else if(marks>=50 && marks<60) 
	        System.out.println("D grade");  
	    
	    else if(marks>=60 && marks<70)
	        System.out.println("C grade");  
	     
	    else if(marks>=70 && marks<80) 
	        System.out.println("B grade");  
	     
	    else if(marks>=80 && marks<90) 
	        System.out.println("A grade");  
	    else if(marks>=90 && marks<100) 
	        System.out.println("A+ grade");  
	    else 
	        System.out.println("Invalid!");  
	     
	}  
}
