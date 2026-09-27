
public class StaticBlockEx {
 static{
	System.out.println("im ststic block");//1
}
 
  public static void run (){
	 System.out.println("im ststic method ");//3
 }
  public StaticBlockEx(int num) {
	System.out.println(num);
}
  
  {
	  System.out.println("im inslizer block");
  }
  
  int a=20;//4
  static String allu;//2
  
  public static void main(String[] args) {
	StaticBlockEx stb=new StaticBlockEx(30);
	System.out.println(stb.a);
	System.out.println(stb.allu);
    stb.run();
    
}
}
