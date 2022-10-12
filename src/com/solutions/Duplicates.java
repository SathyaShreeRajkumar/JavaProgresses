package com.solutions;
import java.util.*;
public class Duplicates {
     public static void main(String args[]) {
    	 Scanner in=new Scanner(System.in);
    	 int n=in.nextInt();
 		int a[]=new int[n];
 		int temp[]=new int[n];
 		int j=0;
 		for(int i=0;i<n;i++)
 		{
 		    a[i]=in.nextInt();
 		}
 		for(int i=0;i<n-1;i++)
 		{
 		   if(a[i]!=a[i+1])
 		   {
 		      temp[j++]=a[i];
 		   }
 		   temp[j]=a[n-1];
 		}
 		for(int k=0;k<n-1;k++)
 		{
 		    System.out.println(temp[k]);
 		}
     }
     public static int findMax(int arr[])
 	{
 		int max=0;
 		for(int i=0;i<arr.length;i++)
 		{
 			if(arr[i]>max)
 				max=arr[i];
 		}
 		return max;
 	}

}
