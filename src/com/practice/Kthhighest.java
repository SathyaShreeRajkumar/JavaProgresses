package com.practice;

import java.util.Arrays;
import java.util.Collections;

public class Kthhighest {

	public static void main(String[] args) {
//		Integer a[]= {1,3,4,6,7};
//		int k=2;
//		System.out.println(khigh(a,k));
//	}
//		
//		public static int khigh(Integer a[],int k)
//		{
//			Arrays.sort(a,Collections.reverseOrder());
//			return a[k-1];
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

	

