package com.collection;
import java.util.HashSet;
import java.util.Iterator;	
import java.util.ArrayList;
public class HashSet_2 {
	
	public static void main(String[] args) {
		
		ArrayList<String> al =new ArrayList<>();
		al.add("xyz");
		al.add("123");
		al.add("1000.00");
		

		HashSet<String> hs=new HashSet<String>();
		System.out.println(hs.addAll(al));
		hs.add("dilshad");
	    hs.add("101");
	    hs.add("100.9");
	    hs.add("100.9");
	    hs.add("aziz");
	    hs.add(null);
	    hs.add(null);
	   // hs.remove("aziz");
		System.out.println(hs.contains("101"));
	    System.out.println(hs.size());
		
	    System.out.println(hs);
//	    Iterator itr=  hs.iterator();
//	    while (itr.hasNext()) {
//			System.out.println(itr.next());
		}
		}   






