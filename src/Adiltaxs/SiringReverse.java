package Adiltaxs;

public class SiringReverse {
public static void main(String[] args) {
	String string =new String("mam");
	StringBuffer stringBuffer =new StringBuffer(string);
	String str=stringBuffer.reverse().toString();
	//System.out.println(str gnimargorP avaJ);
	if (string.equals(str)) {
		System.out.println("this is palindrome ");
	}
	else {
		System.out.println("that is not palindrome ");
	}
}
}
