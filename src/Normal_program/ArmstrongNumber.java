package Normal_program;

public class ArmstrongNumber {
public static void main(String[] args) {
	int num =153;
	int org=num;
	int sum=0;
	
	while (num > 0) {
		int digit = num % 10;
		sum = sum + digit * digit * digit;
		num = num / 10;		
	}
	if (sum == org ) {
		System.out.println(org + " is Armstrong number");
	}
	else {
		System.out.println( org + " is not Armstrong number");
	}
}
}
