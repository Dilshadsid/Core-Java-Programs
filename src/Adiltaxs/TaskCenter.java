package Adiltaxs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TaskCenter {
public static void main(String[] args) {
	Integer totalSumOfProductPrice =0;
	HashMap<String, Integer> laptop =new HashMap<>();
	laptop.put("Hp", 50000);
	laptop.put("Dell", 40000);
	laptop.put("Think pat", 45500);
	
Set<Entry<String, Integer>> entrySet = laptop.entrySet();
	for (Entry<String, Integer> entry : entrySet) {
		totalSumOfProductPrice +=entry.getValue();
	}
	System.out.println("total product price is : "+ totalSumOfProductPrice);
}
}
