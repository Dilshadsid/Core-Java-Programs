package com.MapPrograms;

import java.util.HashMap;
import java.util.Map;

public class hashmap_demo {
public static void main(String[] args) {
	Map<Integer,String> map=new HashMap<>();
	map.put(11, null);
	map.put(22, "hii");
	map.put(null, "affan");
	map.put(33, "sachin");
	System.out.println(map);
	System.out.println(map.containsKey(33));
    System.out.println(map.replace(null,"sajid"));
    
    System.out.println(map);
}
}
