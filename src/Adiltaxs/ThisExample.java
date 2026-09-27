package Adiltaxs;

public class ThisExample {
	int a;
	ThisExample(int x){
		a=x;
	}
	public ThisExample() {
      this(10);
	}
	void showDisplay() {
		
		System.out.println(this.a);
	}
public static void main(String[] args) {
	ThisExample example=new ThisExample(20);
	example.showDisplay();
	
	
}
}
