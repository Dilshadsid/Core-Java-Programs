package com.MapPrograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExam {
	public static void main(String[] args) {
		ConcurrentHashMap<Integer,String> map = new ConcurrentHashMap();
		map.put(404, "Error");
		map.put(405, "cmd");
		map.put(404, "Exp");
		map.put(401, "jvm");
		map.put(400, "zip File");

		System.out.println(map);
		  for (Integer key : map.keySet()) {
	            System.out.println("Key: " + key + " Value: " + map.get(key));
	        }

		/*
		 * for (Integer ab : map.keySet()) { System.out.println(ab); }
		 */
	}
}
