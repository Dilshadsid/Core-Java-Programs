package com.collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class Demo11 {
	public static <E> void main(String[] args) {
		ArrayList<Integer> ar = new ArrayList<>();
		ar.add(1);
		ar.add(5);
		ar.add(1);
		ar.add(3);
		ar.add(2);
		System.out.println(ar.get(4));
		System.out.println(ar.remove(2));
		
		System.out.println(ar);
		
		System.out.println("-----------");
		
		LinkedList<Integer> link = new LinkedList<>();
		link.add(11);
		link.add(33);
		link.add(231);
		link.add(2);
		link.remove(3);
		link.addFirst(6);
		link.addLast(1);
		System.out.println(link);
		
		
	}

}
