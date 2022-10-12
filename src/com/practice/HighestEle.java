package com.practice;

import java.util.Arrays;

public class HighestEle {

	public static void main(String[] args) {
//		String arr[]= {"10","20","40","50"};
//		ArrayList<String> l =new ArrayList<>(Arrays.asList(arr));
//		for(String i:l)
//		{
//			System.out.println(i);
//		}
		int arr[]= {7, 4, 6, 3, 9, 1};
		int k=2;
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println(arr[arr.length-k]);
		
	}

}
