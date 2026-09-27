package com.collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class Demo_Tree_set {
	public static void main(String[] args) {
		SortedSet sortedSet=new TreeSet();
		sortedSet.add(100);
		sortedSet.add(103);
		sortedSet.add(105);
		sortedSet.add(107);
		sortedSet.add(110);
		sortedSet.add(115);
		System.out.println(sortedSet.first());
		System.out.println(sortedSet.last());
		System.out.println(sortedSet.headSet(105));
		System.out.println(sortedSet.subSet(103, 110));
		System.out.println(sortedSet.tailSet(107));
        System.out.println();		
	}
	}

	