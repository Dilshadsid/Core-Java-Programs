package com.collection;

import java.util.LinkedList;
import java.util.ArrayList;

public class LinkedList1 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(100);
		al.add(200);
		al.add(300);
		
	LinkedList<String> l=new LinkedList<String>(al);
	l.add("sarfaraz");
	l.add("1");
	l.add("dilshad");
	l.add("sidd...");
	
	//System.out.println(l);
	
	l.addFirst("ankit");
	l.addLast("50000");
	l.remove(2);
	System.out.println(l.contains(3131));
	l.removeAll(al);
	
	System.out.println(l);
	
	
	}

}
