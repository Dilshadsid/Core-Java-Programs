package com.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet_1 {
public static void main(String[] args) {
	TreeSet<String> ts =new TreeSet<String>();
//	ts.add(40);
//	ts.add(60);
//	ts.add(20);
//	ts.add(50);
//	ts.add(30);
//	ts.add(10);
	ts.add("dilshad");
	ts.add("aziz");
	ts.add("arhan");
	ts.add("mujamil");
	ts.add("yasir");
	ts.add("khan");
	ts.add("baba");
	System.out.println(	ts.floor("baba"));
//	System.out.println(ts.clone());
	System.out.println(ts.ceiling("khan"));
	System.out.println(ts.hashCode());
    System.out.println(ts.higher("yasir"));
    System.out.println(ts.higher("arhan"));
    System.out.println(ts.remove("yasir"));

	//ts.add(10);
	//ts.add(null);
System.out.println(ts);
     Iterator<String> itr= ts.iterator();
     while (itr.hasNext()) {
		System.out.println(itr.next());
	}
}
}
