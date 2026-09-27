package OopsConcept;

class Test{
	int sum(int a,int b) {
		return a+b;
	}
	int sum(int a,Float b) {
		System.out.println("this method is execute ");
		return a;
	}
	void sum(int ...a) {
		System.out.println("VarargsExample...");
	
	}
}
public class VarargsExample {
	public static void main(String[] args) {
		 Test varg=new Test();
		 varg.sum(2,3,45,6,67);
	}
  
   
}
