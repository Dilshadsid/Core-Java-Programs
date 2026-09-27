package com.ArrayPrograms;

public class smollerNum {
	public static void main(String[] args) {
		int num[] = { 3, 4, 5, 6, 2 };
		int sml = 0;

		for (int i = 0; i < num.length; i++) {
			if (num[i] < sml) {
				sml = num[i];
			}
		}
		System.out.println(sml);
	}
}
