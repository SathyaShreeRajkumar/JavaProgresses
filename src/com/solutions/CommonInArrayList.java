package com.solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CommonInArrayList {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		List<Integer> list1=new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			list1.add(in.nextInt());
		}
		List<Integer> list2=new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			list2.add(in.nextInt());
		}
		list1.retainAll(list2);
	    System.out.println(list1);
	    in.close();
		

	}

}
