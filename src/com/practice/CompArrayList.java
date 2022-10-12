package com.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Customer{
	private String c_name;
	public int c_id;
	private int c_age;
	Customer(String cname,int cid,int cage)
	{
		setC_name(cname);
		setC_id(cid);
		setC_age(cage);
	}
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	public int getC_age() {
		return c_age;
	}
	public void setC_age(int c_age) {
		this.c_age = c_age;
	}
	@Override
	public String toString() {
		return "Name: " + c_name + " ID: " +c_id;
	}

	//Anonymous inner class
//  public static Comparator<Customer> cust1=new Comparator<Customer>()
//		 {
//	       public int compare(Customer c1,Customer c2)
//	       {
//	    	   String c_name1=c1.c_name.toUpperCase();
//	    	   String c_name2=c2.c_name.toUpperCase();
//	    	   return c_name1.compareTo(c_name2);
//	       }};
//}
    //Lambda Expression
	public static Comparator<Customer> cust1=(Customer c1,Customer c2)->
      {
   	   return c1.c_name.compareTo(c2.c_name);
      };
	
}
 
public class CompArrayList {

	public static void main(String[] args) {
		ArrayList<Customer> cust=new ArrayList<>();
		cust.add(new Customer("kitkat",106,30));
		cust.add(new Customer("Peanut",104,20));
		cust.add(new Customer("Icecream",103,25));
		List<Customer>c=cust.stream().sorted((s1,s2)->(compareTo(s1.c_id,s2.c_id))).collect(Collectors.toList());
			c.forEach(System.out::println);
		}
//		Collections.sort(cust,Customer.cust1);
//		for(Customer tmp:cust)
//		{
//			System.out.println(tmp);
//		}
//		List<Customer> sorted=cust.stream().sorted((c1,c2)->.compareTo(c2)).collect(Collectors.toList());
//		System.out.println(sorted);

	private static int compareTo(int c_id, int c_id2) {
		
		return c_id>c_id2?1:-1;
	}
		
	}


