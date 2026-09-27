package com.basic;

import java.util.Scanner;

public class ScannerExample {
public static void main(String[] args) {
		int num ;
		System.out.println("Enter your Age....");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		
		if(num > 20) {
			System.out.println("Im am eleable for marrage "+ num + " year old");
		}
		else {
			System.out.println(num+" paisa kamao bskd ");
		}
}
}
