package com.ArrayPrograms;

public class fingMissingNumber {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 4, 5, 9 };

		// Find Min & Max
		int min = arr[0];
		int max = arr[0];

		for (int num : arr) {
			if (num < min)
				min = num;
			if (num > max)
				max = num;
		}

		System.out.println("Minimum number: " + min);
		System.out.println("Maximum number: " + max);

		// Find Missing Numbers
		System.out.print("Missing numbers: ");
		for (int i = min; i <= max; i++) {
			boolean found = false;
			for (int num : arr) {
				if (num == i) {
					found = true;
					break;
				}
			}
			if (!found) {
				System.out.print(i + " ");
			}
		}
	}
}
