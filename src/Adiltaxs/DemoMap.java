package Adiltaxs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DemoMap {
public static void main(String[] args) {
	Map<Integer, Integer> map=new HashMap<>();
	map.put(11,null);
	map.put(null, null);
	map.put(3, 33);
	map.put(null, 2);
	
	System.out.println(map);
	for (Map.Entry me : map.entrySet()) {
		  System.out.println(me.getKey()+" = "+me.getValue()); }
		 
}
}
