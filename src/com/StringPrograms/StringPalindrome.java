package com.StringPrograms;

import java.util.Scanner;

public class StringPalindrome {
	public static void main(String[] args) {
		System.out.println("enter your name ");
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		
		
		
		String rev = new StringBuffer(string).reverse().toString();
		System.out.println(rev);
		if (string.equals(rev)) {
			System.out.println(string + " is palindrome String ");
		} else {
			System.out.println(rev + " is not a palindrome String ");
		}
	}
}
