package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

class test{
	int rollNo;
	 String name;
	 int age;
	 test(int rollNo,String name,int age){
		 this.rollNo=rollNo;
		 this.name=name;
		 this.age=age;
	 }
	
}

public class UserDifineObjectArrayList {
	public static void main(String[] args) {
		
		
		test student=new test(11, "Dilshad", 19);
		test student1=new test(12, "moin bahi", 30);
		test student2=new test(13, "ansharul", 21);
	     ArrayList<test> al=new ArrayList<test>();
	     al.add(student1);
	     al.add(student2);
	     al.add(student);
	     System.out.println(al);
	     System.out.println("---------------------");
	     
	   Iterator itr= al.iterator();
	   while(itr.hasNext()) {
     test ag=(test)itr.next();
     System.out.println(ag.rollNo+" "+ag.name+" "+ag.age);
	   }
	     
	     
		}
}
