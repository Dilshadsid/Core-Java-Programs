package CenterTask;

import java.util.Random;
import java.util.Scanner;

public class genrateOtp {
	public static void main(String[] args) {

		Random random = new Random();
		int otp = 100000 + random.nextInt(900000);
		System.out.println("Your OTP is : " + otp);

		Scanner scanner = new Scanner(System.in);
		int attempt = 0;
		boolean isVerified = false;
		while (attempt < 3) {
			System.out.println("Enter your OTP :");
			int enterOtp = scanner.nextInt();
			if (enterOtp == otp) {
				System.out.println("OTP verified Sussessfully");
				isVerified = true;
				break;
			} else {
				attempt++;
				if (attempt < 3) {
					System.out.println("incorrect OTP .TRY again ...");
				}
			}
		}
		if (!isVerified) {
			System.out.println("your OTP is faild ");
		}
		scanner.close();
	}
}
