
//multiply tow number without using the multiplication sing ...  
import java.util.Scanner;

public class MultiplyWithoutOperator {
	public static void main(String[] args) {
		int num1;
		int num2;
		int result = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number....");
		num1 = scanner.nextInt();
		num2 = scanner.nextInt();
		for (int i = 0; i < num2; i++) {
			result += num1;
		}
		System.out.println("the num3 : " + result);

	}
}
