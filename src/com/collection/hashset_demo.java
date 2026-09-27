package com.collection;

import java.util.HashSet;
import java.util.Iterator;

public class hashset_demo {
	public static void main(String[] args) {
		HashSet hs = new HashSet<>();
		hs.add("dilshad");
		hs.add(10);
		hs.add("mushahid");
		hs.add(9999);
		System.out.println(hs);
		Iterator itr = hs.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
