package com.basic;

public class String_tochar_method {
public static void main(String[] args) {
	String s="texbook";
	char[] ch=s.toCharArray();
	System.out.println(ch);
	for (int i = 0; i < ch.length; i++) {
		System.out.println(ch[i]);
	}
}
}
