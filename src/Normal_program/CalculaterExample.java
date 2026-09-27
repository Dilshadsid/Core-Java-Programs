package Normal_program;

import java.util.Scanner;

public class CalculaterExample {
	public static void main(String[] args) {
		System.out.println("Enter Your Number :");
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		System.out.println("enter your second number");
		double b = sc.nextDouble();
		System.out.println("enter your operator ('+','-','*','%','/').....");
		char operator = sc.next().charAt(0);
		double result = 0;

		switch (operator) {
		case '+':
			result = a + b;
			break;
		case '-':
			result = a - b;
			break;
		case '*':
			result = a * b;
			break;
		case '/':
			result = a / b;
			break;
		case '%':
			result = a % b;
			break;
		default:
			System.out.println("sumthing is wrong");
			break;
		}
		System.out.println("result " + result);
		sc.close();
	}
}
