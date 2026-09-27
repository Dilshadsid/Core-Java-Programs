package com.basic;

public class Inheri_Multilevel {

	void dog() {
		System.out.println("bull dog");
	}
	public static void main(String[] args) {
		X x=new X();
		x.dog();
		x.cat();
	}

}


 class Z extends Inheri_Multilevel
{
	void cat() {
		System.out.println("purtion cat ");
	}
}
 class X extends Z
{
	void mouse() {
		System.out.println("hamstar ");
	}
}
