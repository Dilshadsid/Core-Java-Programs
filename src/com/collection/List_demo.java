package com.collection;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;

public class List_demo {

	public static void main(String[] args) {
		ArrayList l=new ArrayList();

		l.add(100);
		l.add(200);
		l.add(100);
		l.add(200);
		
		l.add(null);
		l.add(null);
	//	System.out.println(l);
		Iterator itr=l.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		
		
	}

}
