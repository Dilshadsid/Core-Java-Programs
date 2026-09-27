package com.MapPrograms;

import java.util.Map;
import java.util.TreeMap;

public class TreeMap_1 {
	public static void main(String[] args) {
	
	  TreeMap<Integer,String> tm=new TreeMap();
	  
	  tm.put(101,"sarfaraz");
	  tm.put(103,"yasir");
	  tm.put(107,"dilshad");
	  tm.put(102,"sameer");
	  tm.put(109,"abdul");
	  
	  // tm.put("sarfaraz",101); 
	  // tm.put("yasir",103);
	  // tm.put("dilshad",104);
	  // tm.put("sameer",102);
	  // tm.put("abdul",105);
	  
	  System.out.println(tm);
	  System.out.println(tm.ceilingEntry(104));
	  System.out.println(tm.containsKey(110));
	  System.out.println(tm.containsValue("abdul"));
	  System.out.println(tm.firstKey());
	  System.out.println( tm.ceilingKey(108));
	  System.out.println(tm.floorKey(108));
	  System.out.println(tm.get(103)); //
	  System.out.println(tm.getOrDefault(101,"sarfaraz"));
	  System.out.println(tm.higherKey(105));
	  System.out.println(tm.isEmpty());
	  System.out.println(tm.lastKey());
	  System.out.println(tm.lowerKey(103));
	  System.out.println(tm.pollFirstEntry());
	  System.out.println(tm.pollLastEntry());
	  System.out.println(tm.remove(103));
	  System.out.println(tm);
	 for (Map.Entry  tmap : tm.entrySet()) {
		System.out.println(tmap.getKey()+" "+tmap.setValue(tmap));
	}
}
}
