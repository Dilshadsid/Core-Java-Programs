package com.collection;

import java.util.ArrayList;

public class Demo_ArrayList {
public static void main(String[] args) {
	ArrayList<String> al=new ArrayList<>();
	al.add("101");
	al.add("dilshad");
	al.add("mumbai");
	al.add("102");
	System.out.println(al);
    System.out.println(al.contains("102"));
	System.out.println(al.equals(null));
	System.out.println(al.isEmpty());
	System.out.println(al.indexOf("mumbai"));
	System.out.println(al.hashCode());
	
}
}
