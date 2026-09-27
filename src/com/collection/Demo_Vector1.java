package com.collection;

import java.util.Enumeration;
import java.util.Vector;

public class Demo_Vector1 {
	public static void main(String[] args) {
		Vector<Integer> vector=new Vector<Integer>();
		vector.add(110);
		vector.add(105);
		vector.add(102);
		vector.add(101);
		vector.add(101);	
		System.out.println(vector);
	    System.out.println(vector.contains(102));	
		vector.add(null);
		System.out.println(vector.firstElement());
    	System.out.println(vector.lastElement());
		vector.remove(2);
	Enumeration<Integer> itrCursor= vector.elements();
	while (itrCursor.hasMoreElements()) {
		System.out.println(itrCursor.nextElement());
	}
	}
}
