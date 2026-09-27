package com.ExceptionH;

public class example1 {
public static void main(String[] args) {
	try {
		int a=10;
		int b=0;
		int c=a/b;
		System.out.println(c);
		String string="shoyeb";
		
		String string2=null;
		System.out.println(string==string2);
		}
	catch ( NullPointerException e) {
      System.out.println("null pointe-Excepion : sumthing opration on null");
	}
	catch (NumberFormatException e) {
      System.out.println("zero can not devisable by any number");
	}
	catch (Exception e) {
		System.out.println("Exception .....");
	}
	finally {
		System.out.println("....im finally ");
	}
}
}
