package Adiltaxs;

import java.util.Scanner;

public class sarfaraz {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a first number ");
		int a = scanner.nextInt();
		System.out.println("enter a second number ");
		int b = scanner.nextInt();
		
		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("a: " + a + " b: " + b);

	}
}
