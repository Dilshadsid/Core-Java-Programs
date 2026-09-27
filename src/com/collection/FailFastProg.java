package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastProg {
public static void main(String[] args) {
	CopyOnWriteArrayList<String> list =new CopyOnWriteArrayList();
	list.add("jhh");
	list.add("e3");
	list.add("yasir");
	list.add("jkbx");
	
	Iterator<String> iterator = list.iterator();
	while (iterator.hasNext()) {
		list.add("hvchd");
		System.out.println(iterator.next());
	}
}
}
