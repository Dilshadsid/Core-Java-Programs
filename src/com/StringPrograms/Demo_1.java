package com.StringPrograms;

public class Demo_1 {
	public static void main(String[] args) {
   String str=new String("Dilshad");
   String str1=new String("khan");
   System.out.println(str1);
   System.out.println(str.codePointBefore(1));
    System.out.println(str=str.concat(str1));;
    
    String cs="khan";
    System.out.println(cs.equals(str1));
    System.out.println(cs==str1);
	}
}
