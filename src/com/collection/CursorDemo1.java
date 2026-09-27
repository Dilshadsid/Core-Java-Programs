package com.collection;
import java.util.ArrayList;
import java.util.Iterator;

public class CursorDemo1 {
	
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		 al.add(101);
		 al.add("dilshad");
		 al.add("Mtech");
		// System.out.println(al);
		  
		 Iterator<String> itr=al.iterator();
		 	
		 while (itr.hasNext()) 
		 {
			System.out.println(itr.next( ));
		 }
		 al.remove("dilshad");
		 System.out.println(al);
		 ArrayList<Integer>aList=new ArrayList<Integer>();
		 aList.addAll(al);
	  }
	}


