package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class retainAllMethodsExam {
public static void main(String[] args) {
	ArrayList<Object> list =new  ArrayList<>();
	
	list.add(8);
	list.add("a");
	list.add("c");
	list.add("b");
List<Object> list1 =new  ArrayList<>();
	
	list1.add(1);
	list1.add("a");
	list1.add(6);
	list1.add("b");
//	list.retainAll(list1);
	list1.set(3,"bsxin");
	System.out.println(list1);
	System.out.println(list);
	
	Iterator itr=list.iterator();
	while (itr.hasNext()) {
		System.out.println(itr.next());
		
	}	
	}
}

