package CenterTask;

import Adiltaxs.ThisExample;

public class SameerTask {
	int a,b;
	public int show(int a) {
		System.out.println("one parametor calls");
		this.a=a;
		this.b=b;
		System.out.println(this.show(a, b));
		return show(a, b);
		
	}
	private int show(int a,int b) {
	 System.out.println("two parametor calls");
	 this.a=a;
	 System.out.println(this.a);
	 return 0;
	}
public static void main(String[] args) {
	SameerTask sameerTask = new SameerTask();
	int x = sameerTask.show(2);

}
}
