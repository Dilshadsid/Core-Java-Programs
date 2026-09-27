package com.StringPrograms;

public class Demo10 {
public static void main(String[] args) {
	int ab=1234;
	String str="";
	
	while (ab!=0) {
		int r=ab%10;
		str+=r;
		ab=ab/10;
	}
	System.out.println(str);
}
}
