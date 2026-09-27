package OopsConcept;

public class SumOfArray {
public static void main(String[] args) {
	int a[]= {1,3,4,6,8};
	int s=0;
	for (int i = 0; i < a.length; i++) {
		s= s+a[i];
	}
	System.out.println(s);
}
}
