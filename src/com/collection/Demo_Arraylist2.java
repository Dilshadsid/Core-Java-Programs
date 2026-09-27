package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo_Arraylist2 {
public static void main(String[] args) {
	ArrayList<String> li=new ArrayList<>();
	li.add("huzaifa");
	li.add("adil");
	li.add("sameer");
	li.add("abdul ali");
	li.add("abu bakar");
	
	System.out.println(li);
	
	Iterator<String> itr=li.iterator();
	while (itr.hasNext()) {
		System.out.println(itr.next());
	}
}
}
