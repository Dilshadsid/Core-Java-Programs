package com.StringPrograms;

public class DemoSymbol {
public static void main(String[] args) {
	String string="!@#$%*ayz";
	String symbol =string.replaceAll("[a-zA-Z0-9]", "");
	int count = symbol.length();
	System.out.println("this is Symbol : " + symbol);
	System.out.println(count);
	
	}
}
