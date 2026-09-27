package com.ArrayPrograms;

public class arrayDemo {
	int search(int element, int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == element) {
				return arr[i];
			}
		}
		return element;
	}

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 4, 60, 70 };
		arrayDemo obj = new arrayDemo();
		int result = obj.search(60, arr);
		if (result == 60) {
			System.out.println("element is found " + result);
		} else {
			System.out.println("element is not found");
		}

	}
}
