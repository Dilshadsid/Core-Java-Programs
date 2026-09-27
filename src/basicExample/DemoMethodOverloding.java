package basicExample;

public class DemoMethodOverloding {
	int add(int a) {
		 return 0;
	 }
 int add(int a,int b) {
	 return 10-20;
 }
 int add(int a,int b,int c) {
	 return 199+1-200;
 }
 public static void main(String[] args) {
	 DemoMethodOverloding dmo=new DemoMethodOverloding();
	int a= dmo.add(1);
	int b= dmo.add(10,20,30);
	int c= dmo.add(1,2);
	System.out.println(a+" "+b+" "+c);
	 
	 
}
}
