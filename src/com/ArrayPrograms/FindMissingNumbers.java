package com.ArrayPrograms;

import java.util.*;

public class FindMissingNumbers {

	public static List<Integer> findMissingNumbers(int[] arr) {
		// Step 1: Find the maximum number to define range
		int max = 0;
		for (int num : arr) {
			if (num > max) {
				max = num;
			}
		}

		// Step 2: Store all elements in a HashSet
		Set<Integer> set = new HashSet<>();
		for (int num : arr) {
			set.add(num);
		}

		// Step 3: Loop from 1 to max and find missing
		List<Integer> missing = new ArrayList<>();
		for (int i = 1; i <= max; i++) {
			if (!set.contains(i)) {
				missing.add(i);
			}
		}

		return missing;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 3, 4, 5, 5, 9 }; // example input
		List<Integer> missing = findMissingNumbers(arr);
		System.out.println("Missing numbers: " + missing);
	}
}
