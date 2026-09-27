package com.ArrayPrograms;
//sum of avrage number 
public class avrageofArray {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 10 };
		double sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		System.out.println("sum of array " + sum);
		double avg = sum / a.length;
		System.out.println("avrage number" + avg);
	}
}
