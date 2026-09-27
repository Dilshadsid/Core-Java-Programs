package Adiltaxs;

import java.util.ArrayList;
import java.util.List;

public class DemoSumthingNew {
	public static void main(String[] args) {
		List<Object> list = new ArrayList<>();
		
		list.add("jhsdi");
		list.add(23);
		
		List<?> list1 = new ArrayList<>(list);
		
		list1.add(null);
		System.out.println(list1.equals(list));
		System.out.println(list1);

	}
}
