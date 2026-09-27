package com.ExceptionH;

public class ThrowsExample {

	public static int convertToInt(String str) throws NumberFormatException {
		return Integer.parseInt(str); 
	}

	public static void main(String[] args) {
		try {
			String s1 = "123"; // valid string
			String s2 = "ABC"; // invalid string (NumberFormatException)

			System.out.println("Converted: " + convertToInt(s1));

			System.out.println("Converted: " + convertToInt(s2));

		} catch (NumberFormatException e) {
			System.out.println("Error: Invalid number format -> " + e.getMessage());
		}
	}
}
