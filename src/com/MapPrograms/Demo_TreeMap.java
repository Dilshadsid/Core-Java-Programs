package com.MapPrograms;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Demo_TreeMap {
	public static void main(String[] args) {
		TreeMap<String, Integer> tm = new TreeMap<>();
		tm.put("dilshad", 11);
		tm.put("Aadil", 16);
		tm.put("Sameer", 14);
		tm.put("Abu baer", 10);
		tm.put("yasir", 15);
		System.out.println(tm);
		System.out.println(tm.remove("Abu baer"));
		System.out.println(tm.containsKey("ali"));
		System.out.println(tm.lastKey());
		
		for (Map.Entry map : tm.entrySet()) {
			System.out.println(map.getKey() + " ->" + map.getValue());
		}

	}
}
