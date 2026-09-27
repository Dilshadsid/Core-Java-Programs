package com.collection;

import java.util.HashSet;

public class Set_demo {
	int a = 10;
	int b = 20;

	public static void main(String[] args) {
		HashSet s = new HashSet();
		s.add(1000);
		s.add(2000);
		s.add(4000);
		s.add(3000);
		s.add(1000);
		s.add(null);
		s.add(null);

		System.out.println(s);

	}
}
