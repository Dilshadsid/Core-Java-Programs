package com.basic;

public class String_Split_method {
	public static void main(String[] args) {

		String s = "java string split method by javatpoint";
		String[] s1 = s.split("\\s");
		for (String e : s1) {
			System.out.println(e);
		}
	}
}