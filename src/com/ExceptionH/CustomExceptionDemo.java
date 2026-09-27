package com.ExceptionH;
class InvalidAgeException extends Exception{
	public InvalidAgeException(String massage) {
		super(massage);
	}
}
public class CustomExceptionDemo {
    public static void checkAge(int age)throws InvalidAgeException{
    	if (age< 18) {
			System.out.println("Age must be 18 or above");
		}
    	else {
			System.out.println("age is valid"+age);
		}
   
    }
    public static void main(String[] args) {
		try {
			checkAge(17);
		} catch (InvalidAgeException e) {
			System.out.println(e.getMessage());
		}
		try {
			checkAge(22);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
