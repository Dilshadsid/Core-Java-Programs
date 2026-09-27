import java.util.Iterator;
import java.util.Scanner;

public class Palindrome_Word {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the word");
		String word = s.nextLine();

		String reversedWord = "";

		for (int i = word.length() - 1; i >= 0; i--) {
			reversedWord += word.charAt(i);
		}
		if (word.equalsIgnoreCase(reversedWord)) {
			System.out.println(word + " " + "is a palindrome");
		} else {
			System.out.println(word + " " + "is not a palindrome");
		}
	}
}
