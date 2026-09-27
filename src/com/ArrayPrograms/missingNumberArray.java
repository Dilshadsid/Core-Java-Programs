package com.ArrayPrograms;

public class missingNumberArray {
	public static void main(String[] args) {
		int a[] = { 12, 2, 3, 4, 7, 9 };

		int min = a[0];
		int max = a[0];

		for (int num : a) {
			if (num < min) {
				min = num;
			}
			if (num > max) {
				max = num;
			}
		}
		System.out.println("min value " + min);
		System.out.println("max value " + max);

		for (int i = min; i < max; i++) {
			boolean found = false;
			for (int num : a) {
				if (num == i) {
					found = true;
				}
			}

			if (!found) {
				System.out.println(i + "  ");
			}
		}
	}
}
