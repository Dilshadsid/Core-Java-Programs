
public class DemoArray {
public static void main(String[] args) {
    int a[]= {1,2,10,9,13};
    for (int i = 0; i < a.length; i++) {
    	 for (int j = 0; j < a.length -1; j++)
    		 
    		 if (a[j] > a[j+1]) {
    			 
				int n=a[j];
				a[j]=a[j+1];
				a[j+1] = n;
			}	 
			}
    for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
	}
}
}
