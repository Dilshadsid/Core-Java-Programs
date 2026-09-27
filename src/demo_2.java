import java.util.Scanner;

public class demo_2 {
	public static void main(String[] args) {
		int age;
		System.out.println("enter your age ");
		Scanner scanner = new Scanner(System.in);
		age = scanner.nextInt();
		if (age < 18)
			System.out.println("boy");

		else
			System.out.println("men");
	}
}
