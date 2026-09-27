package com.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class CursorList {
	public static void main(String[] args) {

		List l = new ArrayList();
		l.add("dilshad");
		l.add(101);
		l.add("Mastang");
		// System.out.println(l);

		ListIterator li = l.listIterator();

		// while (li.hasNext()) {
		// System.out.println(li.next());
//}
		li.next();
		li.next();
		li.next();

		System.out.println("-----------------------");

		while (li.hasPrevious()) {
			System.out.println(li.previous());
		}
		l.remove("dilshad");
		System.out.println(l);
		l.add(300);
		System.out.println(l);

	}

}
