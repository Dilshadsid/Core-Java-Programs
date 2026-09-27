package com.collection;
import java.util.ArrayList;
public class Demo__Collection {

	public static void main(String[] args) {
		
	ArrayList<String>aL=new ArrayList<String>();
	
	aL.add("dilshad siddiqui");
	aL.add("2000");
	aL.add("xxx");
	
	//System.out.println(aL);
	//System.out.println(aL.contains(2000));
	//System.out.println(aL.isEmpty());
	//System.out.println(aL.size());
    //System.err.println(aL.remove(2));
   // aL.remove(0);
   // System.out.println(aL);
    
    
	ArrayList <String>al2=new ArrayList<String>();
	
	al2.add("aaa");
	al2.add("bbb");
	al2.add("xxx");
	//System.out.println(aL.add("www"));
	
	//System.out.println(al2);
	//aL.addAll(al2);
	//System.out.println(aL);
	//aL.removeAll(al2);
	al2.removeAll(aL);
	System.out.println(aL);
	System.out.println(al2);
	aL.clear();
	System.out.println(aL);
	

	}

}
