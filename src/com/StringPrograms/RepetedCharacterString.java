package com.StringPrograms;

public class RepetedCharacterString {
	public static void main(String[] args) {
		String s = "dilshad Siddiqui";
		char[] charArray = s.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			for (int j = 0; j < i; j++) {
				if (charArray[i]==charArray[j]) {
					charArray[i]='x';
					break;
				}
			}
		}
		System.out.println(charArray);
	}
}
