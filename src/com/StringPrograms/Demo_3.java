package com.StringPrograms;

public class Demo_3 {
public static void main(String[] args) {
	        String str = "Welcome";
	        String output = "";

	        for (int i = 0; i < str.length(); i++) {
	            output += str.charAt(i) + "$";
	            
	        }

	        output = output.substring(0, output.length() - 1);

	        System.out.println(output); 
	        }

}
