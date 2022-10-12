package com.practice;


import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args) {
		 Map<Integer,String> maps=new TreeMap<>();
		    Scanner in=new Scanner(System.in);
		    int n=in.nextInt();
		    for(int i=0;i<n;i++)
		    {
		        maps.put(in.nextInt(),in.nextLine());
		    }
		    
//		    Set s=maps.entrySet();
//		    Iterator it=s.iterator();
//		    while(it.hasNext()) {
//		    	System.out.println(it.next());
//		    }
//		    for(Entry m:maps.entrySet())
//		    {
//		    	System.out.println(m.getKey()+" "+m.getValue());
//		    }
		    System.out.println(maps.keySet());
		    System.out.println(maps.entrySet());
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
//		  Set a=s.entrySet();
//		  Iterator itr=a.iterator();
		 // while(itr.hasNext())
		 // {
		     // Map.Entry b=(Map.Entry)itr.next();
		      //System.out.println(b.getKey());
		      //System.out.println(b.getValue());
		   //   System.out.println(itr.next());
		 // }

		   //for(Map.Entry a:s.entrySet())
		   //{
		   //    System.out.println(a.getKey());
		   //    System.out.println(a.getValue());
		       
		   //}
		 //System.out.println(a);
		//	System.out.println(s.keySet()+" "+s.values());
	      // System.out.println(s.values());
		   //System.out.println(s.getKey());
			
			
	}

}
//keySet-keys
//values-value
//entrySet-keys and values
