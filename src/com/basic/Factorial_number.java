package com.basic;

import java.util.Scanner;

public class Factorial_number {  // example 1*2*3*4*5=120
	public static void main(String[] args) {
		  int i,fact=1; int num;
        System.out.println("pls enter your num.. , do you have factorial ");
		Scanner s = new Scanner(System.in);
        num=s.nextInt();
		
		 
		for (i = 1; i <= num; i++) {
		fact = fact * i;
		}
		System.out.println("Factorial of " + num + " is: " +fact);

	}
}
