package com.collection;

import java.util.Iterator;
import java.util.LinkedList;

public class linkedlist_demo {
	public static void main(String[] args) {
		LinkedList lkd = new LinkedList<>();
		lkd.add(123);
		lkd.add("dilshad");
		lkd.add("adil");
		lkd.add(1243);
		lkd.addFirst(12);
		lkd.addLast(9999);
		System.out.println(lkd);
		System.out.println(lkd.peekFirst());
		System.out.println(lkd.peekLast());
		System.out.println(lkd.pollFirst());
		System.out.println("-----------------------");
		Iterator itr = lkd.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
