package Adiltaxs;

import java.util.Scanner;

public class leapyear {
public static void main(String[] args) {
	int a;
	
	System.out.println("enter the year");
	Scanner scanner=new Scanner (System.in);
	a=scanner.nextInt();
	
	if ((a% 4==0)&&(a% 100!=0)||(a % 400==0)) {
		System.out.println(a+" "+"this is leap year");
	}
	else {
		System.out.println("this is not leap year");
	}
}
}
