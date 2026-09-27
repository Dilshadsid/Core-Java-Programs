package Normal_program;

import java.util.Scanner;

public class palendromExam {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	int num=sc.nextInt();
	int revers=0;
	while (num >0) {
		int digit = num % 10;
        revers = revers * 10 + digit;
        num /= 10;
	}
	if (num==revers) {
		System.out.println(num+" this is palendrome ");
	}
	else {
		System.out.println(num+" it not palendrome ");
	}
}
}
