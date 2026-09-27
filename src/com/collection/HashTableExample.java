package com.collection;

import java.security.Key;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Set;

public class HashTableExample {
public static void main(String[] args) {
	Hashtable<Integer, String> hashtable = new Hashtable<>();
	hashtable.put(11, "hey");
	hashtable.put(22, "hello");
	hashtable.put(11, "xyz");
	
	System.out.println(hashtable);
	   Enumeration<String> elements = hashtable.elements();
	   while (elements.hasMoreElements()) {
		String xyz=   elements.nextElement();
		System.out.println("Key: " + xyz + ", Value: " + hashtable.get(xyz));
	}
	  
}
}
