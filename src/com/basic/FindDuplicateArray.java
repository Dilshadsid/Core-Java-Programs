package com.basic;

public class FindDuplicateArray {

	public static void main(String[] args) {
		boolean foundDuplicate = false;
		int[] arr = { 1, 2, 3, 4 ,3 ,2 ,1};
		for (int i = 0; i <= arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					foundDuplicate = true;
					System.out.print(arr[i] + " ");

				}
			}
		}
		if (!foundDuplicate) {
			System.out.println("duplicate element not found");

		}
	}
}
