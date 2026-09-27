package com.basic;
 abstract class ab{
	 abstract void run();
	 void sum() {
		 System.out.println("hii");
	}
 }
 
public class Abdul extends ab{
    public void run(){
    	System.out.println("hii Im ansarul");
    }
    public static void main(String[] args) {
		Abdul a1=new Abdul();
		a1.run();
		a1.sum();
	}
}
