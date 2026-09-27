package com.collection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorExample {
public static void main(String[] args) {
	 Vector<Integer> vector =new Vector<>();
	 vector.add(2);
	 vector.add(4);
	 vector.add(22);
	 vector.add(3);
	 vector.add(1);
	 vector.add(5);
	 System.out.println(vector);
	 vector.remove(2);
	 vector.get(4);
	 vector.set(2, 66);
		/*
		 * int i=0; while (i<=10) { System.out.println(i); vector.add(i+1); i++; } Sy
		 */
		/*
		 * for (Integer integer : vector) { System.out.println(integer); }
		 */
	Enumeration<Integer>enumeration= vector.elements();
	while (enumeration.hasMoreElements()) {
		System.out.println(enumeration.nextElement());
	}
	
}
}
