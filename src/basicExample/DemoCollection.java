package basicExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class DemoCollection {
	public static void main(String[] args) {
		ArrayList arry=new ArrayList();
		arry.add(2);
		arry.add(1);
		arry.add(3);
		arry.add(4);
		Collections.sort(arry);

		Iterator i=arry.iterator() ;
		
		//Collections.reverse(arry);
		
		while (i.hasNext()) {
	     System.out.println(i.next());		
		}

	}
}
