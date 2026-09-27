package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class demo_Array_list {
	public static void main(String[] args) {
		ArrayList aList = new ArrayList<>();
		aList.add("adil");
		aList.add("dilshad");
		aList.add("mushahid");
		aList.add(123);
		aList.add(134);
		System.out.println(aList);
		/*
		 * Iterator itrIterator=aList.iterator();/// using iterator corser while
		 * (itrIterator.hasNext()) { System.out.println(itrIterator.next()); }
		 */
		ListIterator li = aList.listIterator();
		while (li.hasNext()) {
			System.out.println(li.next());
		}
		System.out.println("--------------------------------------------");
		while (li.hasPrevious()) {
			System.out.println(li.previous());
		}
	}
}
