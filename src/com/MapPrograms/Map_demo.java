package com.MapPrograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Map_demo {
	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<>();
		map.put(1001, "iphone");
		map.put(1002,"samsung");
		map.put(1003,"one plase");
		map.put(1004,"vivo");
		map.put(1005,"realmi");
		map.put(1006,"narzo");
		map.put(1007,null);
		map.put(null,"raju");
		map.put(1007, "yasir");
		//map.clear();
        System.out.println(map.containsKey(107));

        System.out.println(map.containsValue(null));       
        System.out.println(map.get(1002));
        System.out.println(map.isEmpty());
        System.out.println(map.remove(1004));
        map.replace(1006,"dilshad");
        
        System.out.println(map.size());

		//System.out.println(map);
		
	}

}
