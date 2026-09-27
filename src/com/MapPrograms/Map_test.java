package com.MapPrograms;

//import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.swing.text.html.parser.Entity;

public class Map_test
{
public static void main(String[] args)
  {
//	ArrayList aList=new ArrayList<>();
//	aList.add(101);
//	aList.add(100);
//	aList.add(99);
//	System.out.println(aList);//this is contain one object  
//	
	
	Map<Integer,String> m=new HashMap<Integer,String>();
	m.put(101,"dilshad");//this is contain key & value pair 
	m.put(109,"arhan");
	m.put(105,"aziz");
	m.put(104,"xyz");
	
	 System.out.println(m.containsKey(105)); 
     System.out.println(m.containsValue("arhan"));
     System.out.println(m.get(101));
     System.out.println(m.replace(109,"basid"));
     System.out.println(m.size());
     System.out.println(m.isEmpty());
     System.out.println(m.containsValue("zzz"));

	//m.clear();
	 System.out.println(m);
 
   }
}
