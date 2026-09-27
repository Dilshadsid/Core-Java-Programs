package Adiltaxs;

import java.util.Scanner;

public class TaskStingSplit {
	public static void main(String[] args) {
   Scanner scanner =new Scanner(System.in);
   
		String string = new String(scanner.nextLine());

		for (int i = 0; i < string.length(); i++) {
			char ch =  string.charAt(i);

			if (ch == 'a') {
				System.out.println(); 
				System.out.println(ch); 
			} else {
				System.out.print(ch); 
			}
		}
	}
}
