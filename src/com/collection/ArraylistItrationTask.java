package com.collection;

import java.awt.event.ItemEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArraylistItrationTask {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(13);
		list.add(15);
		list.add(11);
		
		System.out.println("Using Iterator ");
		Iterator<Integer> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("Using List Iterator ");
		ListIterator<Integer> listItr = list.listIterator(list.size());
		while (listItr.hasPrevious()) {
			System.out.println(listItr.previous());
		}
		
		System.out.println(" Using for loop");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("Using foreach Methods ");
		for (Integer integer : list) {
			System.out.println(integer);
		}
		
		System.out.println("Using ForEach ");
		list.forEach(item -> System.out.println(item));

	}
}
