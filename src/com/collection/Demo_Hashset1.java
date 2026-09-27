package com.collection;

import java.util.HashSet;
import java.util.Iterator;

public class Demo_Hashset1
{
public static void main(String[] mushaid) 
{

	HashSet<Integer> hs=new HashSet<Integer>();

	hs.add(100);
	hs.add(10);
	hs.add(102);
	hs.add(-109);
	hs.add(80);
	
	// hs.clear();
	 System.out.println(hs.hashCode());	
    System.out.println(hs.contains(101));
    System.out.println(hs.isEmpty());  
  
	 System.out.println(hs);
	 System.out.println(hs.size());
	 
	 
	 HashSet<Integer> xyz=new HashSet<Integer>();
    xyz = (HashSet)hs.clone();  
    System.out.println(xyz);
//	Iterator<Integer> itr= hs.iterator();
//		while(itr.hasNext()) 
//		{
//			System.out.println(itr.next());
//		}
//	
}
}
