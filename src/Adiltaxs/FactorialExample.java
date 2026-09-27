package Adiltaxs;

import java.util.Scanner;

public class FactorialExample {
	public static void main(String[] args) {
		System.out.println("enter your number ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();

		long fact = 1;
		for (int i = 1; i < num; i++) {
			fact = fact * i;
		}
		System.out.println(num +" factorial :- "+fact);
		scanner.close();
	}
}
