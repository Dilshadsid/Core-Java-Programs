package com.ExceptionH;

import java.util.ConcurrentModificationException;
import java.util.HashMap;

public class HashmapExamplee {
public static void main(String[] args) {
	try {
		HashMap<String, Integer> map=new HashMap<>();
	map.put("name", 12);
	map.put("shoyeb", 5);
	map.put("Ahmad", 13);
	map.put("Uzar", 2);
	for (String str : map.keySet()) {
		map.put("sameer", null);
		System.out.println(str);
	}
	}
	
	catch (ArithmeticException e) {
		System.out.println("ArithmeticException is aucher...");
	}
	/*
	 * catch (ConcurrentModificationException e) {
	 * System.out.println("ConcurrentModificationException is solve ..."); }
	 */
	catch (Exception e) {
		e.printStackTrace();// TODO: handle exception
	}
	finally {
		System.out.println("code is running..");
	}
}
}
