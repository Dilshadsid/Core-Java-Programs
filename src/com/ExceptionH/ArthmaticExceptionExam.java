package com.ExceptionH;

public class ArthmaticExceptionExam {
	
	public static void show(int num) {
		if (num<10) {
			throw new ArithmeticException("\n sumthing wont wrong nagatuve number is not divisubal");	
			}
		else {
			System.out.println("Square is "+num +"is"+(num/num));
		}
	}
public static void main(String[] args) {
	ArthmaticExceptionExam arthmEXCP =new ArthmaticExceptionExam();
	arthmEXCP.show(-4);
	System.out.println("hello");
	
}
}
