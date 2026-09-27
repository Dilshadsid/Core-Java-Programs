import java.util.Scanner;

class EvenOdd_sum {
	public static void main(String[] args) {
		int n, sum = 0;
		System.out.println("enter any number");
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();

		if (n % 2 == 0) {
			for (int i = 0; i <= n; i = i + 2) {
				sum = sum + i;
			}
			System.out.println("sum of even number " + sum);
		} else {
			for (int j = 1; j <= n; j = j + 2) {
				sum = sum + j;
			}
			System.out.println("sum of odd number " + sum);
		}
	}
}