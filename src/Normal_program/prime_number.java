package Normal_program;

public class prime_number {
	public static void main(String[] args) {
		for (int num = 2; num <= 100 ; num++) {
			boolean temp=true;
			for (int i = 2; i <= num / 2 ; i++) {
				if (num % i ==0 ) {
					
					temp=false;
					break;
				}
			}
			if (temp) {
					System.out.println(num + " is prime number  ");
				}
			else {
				System.out.println(num + " is not prime number ");
			}
		}
			}
}
