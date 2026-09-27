package Adiltaxs;

import java.util.Scanner;

public class TaskInputValidation {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = 0;
		int password = 12345678;

		System.out.print("Enter your 8 Digit password  : ");

		while (true) {

			if (scanner.hasNextInt()) {
				number = scanner.nextInt();

				if (number == password) {
					break;
				} else {
					System.out.print("Invalid range. Enter a Password Try Again : ");
				}
			} else {

				System.out.print("Invalid input . Please enter a Password : ");
				scanner.next(); // consume the invalid token
			}
		}

		System.out.println("Willcome You are Loging : " + number);
		scanner.close();

	}
}
