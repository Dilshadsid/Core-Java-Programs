package com.basic;

import java.util.Scanner;

public class Test_leapyear {
public static void main(String[] args) {
	int year;
	System.out.println("enter your year");
	Scanner scanner=new Scanner(System.in);
	
	 year=scanner.nextInt();
	  if(((year % 4 ==0) && (year % 100 !=0)) || (year % 400==0)){
		System.out.println("leap year");
	}
	else {
		System.out.println("coomon yesr");
	}
}
}
