//wap to addition nd subtraction using interface?
//wap to show area of circle area of rectangle nd area of trangle using menudriven concept?
//String str="Dilshad Siddiqui" found how many times occure i in this String?
//int [] a={2,3,1,6}; short array without using predifined java method

import java.util.Iterator;

public class TestOveriding {
	public static void main(String[] args) {
		String str = "Dilshad Siddiqui";
		String lowerCase = str.toLowerCase();
		char[] charArray = lowerCase.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {

				if (charArray[i] == charArray[j]) {
					System.out.println(charArray[i]);
					break;
				}
			}

		}
	}
}
