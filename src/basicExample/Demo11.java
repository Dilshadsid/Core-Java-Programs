package basicExample;

import java.util.Scanner;

// write a program to display Armangstrong number 
public class Demo11 {
	public static void main(String[] args) {
		System.out.println("enter your number ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int var = num;
		int a = 0;

		while (num > 0) {

			int b = num % 10;
			a += b * b * b;
			num = num / 10;
		}
		if (a == var) {
			System.out.println("this is Armangstrong " );
		} else {
			System.out.println("is not Armangstrong ");
		}
	}
}
// 1333
// 1*1*1*1 + 3*3*3*3 + 3*3*3*3 + 3*3*3*3 =244
// 
