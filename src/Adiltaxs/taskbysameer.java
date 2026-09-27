package Adiltaxs;
// print 1,2,3,4,5,6,7,8,9,10 output
public class taskbysameer {
	public static void sum(int a) {
		if(a>10) {
			return;
		}
		System.out.println(a);
		sum(a+1);
	}
public static void main(String[] args) {
	sum(1);
	
}
}
