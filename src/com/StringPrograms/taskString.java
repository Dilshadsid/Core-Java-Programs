package com.StringPrograms;

public class taskString {
	public static void main(String[] args) {
		String string = new String(" java is programing language ");
		string.trim();
	String[] space=	string.split(" ", 3);
	System.out.println(space[0]);
	System.out.println(space[1]);
	System.out.println(space[2]);
	//System.out.println(space);
		/*
		 * String string2 = (String) string.substring(0, 4);
		 * System.out.println(string2); System.out.print(string.substring(5, 23));
		 */

	}
}
