package com.practice;

import java.util.Collections;
import java.util.*;

class Cars implements Comparable<Cars>{
	String cname;
	String ccolor;
	int cid;

	Cars(String cname, String ccolor, int cid) {
		//super();
		this.cname = cname;
		this.ccolor = ccolor;
		this.cid = cid;
	}

	@Override
	public String toString() {
		return "Cars [cname=" + cname + ", ccolor=" + ccolor + ", cid=" + cid + "]";
	}
	
	public int compareTo (Cars cars1)
	{
		if(cid>cars1.cid)
		      return 1;
		else
			return -1;
	}


}

public class Comp {

	public static void main(String[] args) {
		ArrayList<Cars> c = new ArrayList<Cars>();
		c.add(new Cars("Benz", "Black", 3));
		c.add(new Cars("Ferari", "Red", 1));
		c.add(new Cars("Jaquar", "White", 2));
//         without lambda
//		Comparator<Cars> com = new Comparator<Cars>() {
//			public int compare(Cars c1, Cars c2) {
//				if (c1.cid > c2.cid)
//					return 1;
//				else
//					return -1;
//			}
//		};
//		Comparator<Cars> com =(Cars c1, Cars c2)-> {
//				return (c1.cid > c2.cid)?1:-1;
//					
//		};

		Collections.sort(c);
//		Collections.sort(c, com);
//		for (Cars cars1 : c)
//			System.out.println(cars1);

	}

}
