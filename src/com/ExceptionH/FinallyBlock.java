package com.ExceptionH;

public class FinallyBlock {
	public static void main(String[] args) {

		try {
			int a = 10 / 0;
		} 
		catch (ArithmeticException e) {
			System.out.println("Exception handled");
		}
		finally {
			try {
				System.out.println("Finally block code");
			} catch (Exception e) {
				System.out.println("Exception in finally");
			}
		}

	}
}