package com.StringPrograms;

public class DemoString {
	public static void main(String[] args) {
		String s = new String("Hello World");
		String s1 = "java";
		System.out.println(s.charAt(2));
		System.out.println(s1.charAt(2));
		
		
		System.out.println(s.compareTo(s1));
		System.out.println(s.equals(s1));
		System.out.println(s == s1);
	}
}
