package Adiltaxs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListExample {
	public static void main(String[] args) {
		List<Integer> list = new CopyOnWriteArrayList();
		list.add(11);
		list.add(22);
		list.add(33);
		list.add(44);
		list.add(55);
		Iterator<Integer> iterator = list.iterator();
		while (iterator.hasNext()) {
			list.add(66);
			list.remove(2);
			System.out.println(iterator.next());
		}

	}
}
