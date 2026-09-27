package com.collection;

import java.util.Enumeration;
import java.util.List;
import java.util.Set;
import java.util.Vector;


public class EnumerationCursor {
	public static void main(String[] args) {
		Vector v=new Vector();
		v.add(2005);
		v.add("dilshad");
		v.add("5.8");
		//System.out.println(v);
       Enumeration e=v.elements();
		
	while (e.hasMoreElements()) {
       System.out.println(e.nextElement());		
	}
		
	}
  }

