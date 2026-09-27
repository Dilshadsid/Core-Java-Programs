package Adiltaxs;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		System.out.println("enter Your number: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		boolean isPrime = true;
		if (a <= 1) {
			isPrime = false;
		} else {
			for (int i = 2; i < a; i++) {
				if (a % i == 0) {
					isPrime = false;
					break;
				}
			}
		}
		if (isPrime) {
			System.out.println(a + " is prime number");
		} else {
			
			System.out.println(a + " is not ");
		}
	}
}
