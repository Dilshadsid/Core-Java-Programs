package com.collection;

import java.util.HashSet;

public class HashSetExample {
	public static void main(String[] args) {
		HashSet<String> hset = new HashSet<>();
		hset.add("yasir");
		hset.add(null);
		hset.add("xyz");
		hset.add("shoyeb");
		hset.add("yasir");
		System.out.println(hset.isEmpty());
		
       System.out.println(hset);
       System.out.println("---------");
       
       
	}
}
