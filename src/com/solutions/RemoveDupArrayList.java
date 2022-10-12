package com.solutions;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class RemoveDupArrayList {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
        ArrayList <Integer> l1=new ArrayList<Integer>();
        int n=in.nextInt();
        for(int i=0;i<n;i++)
        {
            l1.add(in.nextInt());
        }
        System.out.println(l1);
        TreeSet<Integer> st=new TreeSet<Integer>(l1);
        
        System.out.println(st);

	}

}
