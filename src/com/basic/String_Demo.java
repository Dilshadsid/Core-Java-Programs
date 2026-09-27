package com.basic;

public class String_Demo {
public static void main(String[] args) {
	String s="dilshad";
	String s1="khan";
	String s2=new String("dilshad");
	String s3=new String("khan");
	String s4="KHAn bhai   ";
	String s5=String.join("->","ramazan is back","hello","gyus");
	
	System.out.println(s.concat(s1)+" ------ "+s.concat(s2));
    System.out.println(s.charAt(4));
    System.out.println(s.compareTo(s3));
    System.out.println(s.compareTo(s2));//agar ham s string ko kise s1 mt string se compair karenge to s apne hi string ko count karde dega
    System.out.println(s.endsWith("d"));
    System.out.println(s.equals(s2));
    System.out.println(s==s2);
    System.out.println(s.isEmpty());
    System.out.println(s1.equalsIgnoreCase(s4));
    System.out.println(s5.indexOf("is"));
    System.out.println(s5);
    System.out.println(s.lastIndexOf("6"));
    System.out.println(s5.length());
   
    String replace1=s5.replace('a', 'i');
    System.out.println(replace1);
    System.out.println(s.startsWith("dil"));
    System.out.println(s.substring(3,6));
    System.out.println(s5.toUpperCase());
    System.out.println(s.toLowerCase());
    System.out.println(s4+"java programer");
    System.out.println(s4.trim()+"core java");//trim method piche ke gaps ko remove kar deta hai
    int a=339900;
    String a1=String.valueOf(a);
    System.out.println(a);
}
}
