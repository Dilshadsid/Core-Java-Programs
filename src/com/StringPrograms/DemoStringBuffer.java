package com.StringPrograms;

public class DemoStringBuffer {
	public static void main(String[] args) {
      StringBuffer sb=new StringBuffer("Hello java ");
      
      
      System.out.println( sb.append("World"));
      System.out.println(sb.delete(0, 5));
      System.out.println(sb.deleteCharAt(5));
      System.out.println(sb.length());
      System.out.println(sb.replace(0, 5,"Hello"));
      System.out.println(sb.reverse());
	}
}
