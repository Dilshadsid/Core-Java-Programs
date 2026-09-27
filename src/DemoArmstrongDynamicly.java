import java.util.Scanner;

public class DemoArmstrongDynamicly {
	public static void main(String[] args) {
		int n = 0, arm = 0, num, c;
		System.out.println("enter the number");
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		c = n;
		while (n > 0) {
			num = n % 10;
			arm = (num * num * num *num) + arm;
			n = n / 10;
		}
		if (c == arm) {
			System.out.println("is Armstrong number");
		} else {
			System.out.println("is not armstrong number");
		}
	}
}
