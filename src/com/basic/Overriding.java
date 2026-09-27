package com.basic;

public class Overriding {
    void W() {
    	System.out.println("BMW");
    }

}
class KALU extends Overriding{
	void W() {
		System.out.println("Supra");
	}
	public static void main(String[] args) {
	 KALU p=new KALU();
		p.W();
		p.W();
	}
	
}
