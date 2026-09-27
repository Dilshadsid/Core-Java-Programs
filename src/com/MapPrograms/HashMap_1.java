package com.MapPrograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap_1 
{
    public static void main(String[] args)
  {
     HashMap<Integer,String> hashMap= new HashMap<Integer,String>();
   
      hashMap.put(101, "dilshad");
      hashMap.put(102, "Abdul");
      hashMap.put(108, "raj");
      hashMap.put(108, "raja");
      
        System.out.println(hashMap);
        
            hashMap.forEach((k,v)-> System.out.println(k+" "+v));
        /* (1) diffrent weay to  Iterator hashmap  */
        
		
		  for (Map.Entry me : hashMap.entrySet()) {
		  System.out.println(me.getKey()+" -> "+me.getValue()); }
		 
        
        
//   (2)   Set set= hashMap.entrySet();
//       // System.out.println(set);// set me out put dega [];
//     
//      Iterator itr= set.iterator();
//   
//       while (itr.hasNext()) 
//      {
//	    //System.out.println(itr.next());
//	    Map.Entry entry=(Map.Entry)itr.next();
//	      System.out.println(entry.getKey()+" -=> "+entry.getValue());
//      }
  }
   
}

