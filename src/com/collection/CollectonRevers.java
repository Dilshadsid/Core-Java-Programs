package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class CollectonRevers {
public static void main(String[] args) {
	ArrayList<Integer> arry=new ArrayList<Integer>();
	arry.add(2);
	arry.add(1);
	arry.add(3);
	arry.add(4);
	Collections.sort(arry);

	Iterator<Integer> i=arry.iterator() ;
	
	Collections.reverse(arry);
	
	while (i.hasNext()) {
     System.out.println(i.next());		
	}

}
}