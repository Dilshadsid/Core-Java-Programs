package com.collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Demo_LinkedHashSet {
	public static void main(String[] args) {
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
		linkedHashSet.add("dilshad");
		linkedHashSet.add("arman");
		linkedHashSet.add("zaid");
		linkedHashSet.add(null);
		linkedHashSet.add("zaid");
		
		System.out.println(linkedHashSet.add("arman"));
		System.out.println(linkedHashSet.add("khan"));
		System.out.println(linkedHashSet.remove("dilshad"));
		// linkedHashSet.removeAll(linkedHashSet);
		System.out.println(linkedHashSet);
		
		Iterator itrIterator =linkedHashSet.iterator();
		while (itrIterator.hasNext()) {
			System.out.println(itrIterator.next());
		}
		System.out.println("-----------------------------");
        
	}

}
