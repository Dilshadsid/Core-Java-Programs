package com.collection;

import java.util.Enumeration;
import java.util.Stack;

public class StackExample {
public static void main(String[] args) {
	Stack<String> stk=new Stack<>();
	stk.add("Shoyeb");
	stk.add("yasir");
	stk.add("sameer");
	stk.add("Dilshad ");
	stk.add("null");	
	 
	
	System.out.println(stk);
	System.out.println("----------");
	
	Enumeration<String> enm =stk.elements();
	while (enm.hasMoreElements()) {
		System.out.println(enm.nextElement());
	}

}
}
