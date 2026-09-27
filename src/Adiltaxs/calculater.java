package Adiltaxs;

import java.util.Scanner;

import com.basic.Switch;

public class calculater {
public static void main(String[] args) {
	int a;
	int b;
	String oprator;
	
	Scanner scanner=new Scanner (System.in);
	System.out.println("enter the first number");
	a=scanner.nextInt();
	System.out.println("enter the second number");
	b=scanner.nextInt();
	System.out.println("enter the oprator  '+','-','*','%','/',");
	oprator=scanner.next();
	switch(oprator) {
	case "+":                                     
	System.out.println(a+b);
	
	  break;
	case "-":
		System.out.println(a-b);
      break;
	case "*":                                     
		System.out.println(a*b);
		
	   break;
	case "%":
			System.out.println(a%b);
	    break;
	case "/":
		System.out.println(a/b);
    break;
	default :
		 System.out.println("oprator is not found ");
}
	}
}
