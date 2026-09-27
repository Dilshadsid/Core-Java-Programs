package com.basic;

import java.util.Scanner;

public class Armgstrong {

	public static void main(String[] args) {
		int userinput,temp; 
		double mult = 0; 
		double sum;
		int digit;
		System.out.println("Enter your number....");
		Scanner sc = new Scanner(System.in);
		userinput = sc.nextInt();
		digit=userinput;
		temp=userinput;
		double nd=0;
		while(digit>0)
		{
			nd=nd+1;
			digit=digit/10;
		}
		 System.out.println("Number of digits: " + nd);

		while (userinput > 0) {
			sum = userinput % 10;
            mult = mult + (Math.pow(sum, nd));
			userinput = userinput / 10;
		}

		if (temp == mult) {
			System.out.println("is Armgstrong number ");
		} else {
			System.out.println("is not Armgstrang");
		}

	}
}
