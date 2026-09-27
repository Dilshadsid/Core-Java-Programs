package com.StringPrograms;

public class AllMethodOfString {
public static void main(String[] args) {
	String string=new String("Dilshad ");
	String string2= new String(" Khan ");
	String str ="khan";
	String str2="Dilshad";
	
	System.out.println(string==str2);
	System.out.println(str.equals(string2));
	System.out.println(str.endsWith("an"));
	System.out.println(string.compareTo(string2));
	System.out.println(str.hashCode());
	System.out.println(string2.toUpperCase());
	System.out.println(string.length());
	System.out.println(str2.repeat(4));
}
}
