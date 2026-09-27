package com.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class treeSet_demo {
	public static void main(String[] args) {
		TreeSet ts = new TreeSet<>();
		ts.add(11);
		ts.add(234);
		ts.add(456);
		ts.add(888);
		System.out.println(ts);
		ts.first();
		System.out.println(ts.floor(333));
		System.out.println(ts.higher(1));
		System.out.println(ts.lower(77));
		System.out.println(ts);
		Iterator itr = ts.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
