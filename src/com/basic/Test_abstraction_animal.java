package com.basic;

abstract class Animal {
	abstract void eat();
	
	
}
class cat extends Animal{
	@Override
	 void eat() {
		System.out.println(" cat food");// TODO Auto-generated method stub
		
	}
	
}
class Test_abstraction_animal extends Animal{
	@Override
	 void eat() {
		// TODO Auto-generated method stub
		System.out.println("dog food");
	}
	public static void main(String[] args) {
		Test_abstraction_animal A=new Test_abstraction_animal();
	   A.eat();
	}
}