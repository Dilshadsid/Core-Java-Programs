package com.basic;

import java.util.Scanner;

public class EvenNumber {
public static void main(String[] args) {
	int a;

	Scanner s=new Scanner(System.in);
	a=s.nextInt();
	if ((a & 1)==0) {
		System.out.println("even number");
	}
	else {
		System.out.println("odd number");
	}
}
}
