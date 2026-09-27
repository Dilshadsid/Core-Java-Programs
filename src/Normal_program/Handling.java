package Normal_program;

public class Handling {
	public static void main(String[] args) {
		System.out.println("learn coding");
		try
		{
			int a=20,b=0,c;
			c=a/b;
			System.out.println(c);
			System.out.println("like share");	
		} 
		catch (ArithmeticException e)
		{
			System.out.println("can't devided by zero");
		}
		finally 
		{
		System.out.println("subscribe");	
		}
		System.out.println("mein method ended");
	}
	
}
