import java.util.Scanner;

public class Demo2 {
	static int a;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Eneter the temperature:-");
		a = s.nextInt();
		if (a >= 20)
			System.out.println("normal tempratur");

		else if (a >= 40)
			System.out.println("mediam tempratur");

		else if (a >= 60)
			System.out.println("high tempratue");

		else
			System.out.println("ab bas kar tapman bhad gaya ");

	}

}
