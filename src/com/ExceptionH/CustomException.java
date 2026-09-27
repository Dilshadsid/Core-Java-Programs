package com.ExceptionH;
class NullPointerException extends RuntimeException{
	public NullPointerException(String massage) {
		super(massage);
	}
	
}
public class CustomException {
	String name="Ahmed";
  void Student() {
	  
	  if (name==null) {
		throw new NullPointerException("null pointer Exception ");
	}
	  System.out.println(name.length());
  }
  
	public static void main(String[] args) {
		CustomException customException=new CustomException();
		customException.Student();
	}
}

