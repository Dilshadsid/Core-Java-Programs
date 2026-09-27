package com.ArrayPrograms;

public class arraylastIndexInFirstPosition {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };

		// Last element save karlo
		int last = arr[arr.length - 1];

		// Right shift
		for (int i = arr.length - 1; i > 0; i--) {
			arr[i] = arr[i - 1];
		}

		// Pehle element me last value daal do
		arr[0] = last;

		// Print result
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}
}
