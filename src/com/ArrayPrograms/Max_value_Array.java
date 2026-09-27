package com.ArrayPrograms;

public class Max_value_Array {
	public static void main(String[] args) {
		int a[] = { 5, 99, 101, 6 };
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		System.out.println(max);

	}
}