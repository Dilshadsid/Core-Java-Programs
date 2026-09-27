package CenterTask;

import java.util.Scanner;


class InvalidStringException extends RuntimeException {
	public InvalidStringException(String msg) {
		super(msg);
	}
}

public class CheckStringNullOrEmpty {

	public static String checkStringNullOrEmpty(String text) {
		if (text.trim().isEmpty() || text==null) {
			throw new InvalidStringException("String cannot be  empty ");
		}
		
		return text;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your String....");
		String text = scanner.nextLine();
		try {
			  checkStringNullOrEmpty(text);
			  System.out.println("Valid string: "+ text);
 
        } 
		catch (InvalidStringException e) {
              System.out.println("Error: " + e.getMessage());
        }
		
		scanner.close();
	}

}
