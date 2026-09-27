package DilshadProgram;

import java.util.ArrayList;
import java.util.LinkedList;

public class HowToCheckHowIsFast { // ArrayList ya LinkedList
	public static void main(String[] args) {

		ArrayList<Integer> arrayList = new ArrayList<>();

		LinkedList<Integer> linkedList = new LinkedList<>();

		int n = 100000;

		for (int i = 0; i < n; i++) {
			arrayList.add(i);
			linkedList.add(i);
		}
		long start = System.nanoTime();
		arrayList.remove(n / 2);
		long end = System.nanoTime();
		System.out.println("ArrayList delete time: " + (end - start) + " ns");

		start = System.nanoTime();
		linkedList.remove(n / 2);
		end = System.nanoTime();
		System.out.println("LinkedList delete time: " + (end - start) + " ns");
	}
}
