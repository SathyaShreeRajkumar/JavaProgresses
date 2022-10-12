package com.solutions;

public class LinearSearch {
	public static int linearSearch (int arr[],int key)
	{
		if(arr.length<1)
		{
			throw new IndexOutOfBoundsException("Exception");
		}
		else {
		int i=0;
		for(i=0;i<arr.length;i++)
	    {
	        if(arr[i]==key)
	           return i;
	    }
	    System.out.println(i+"->"+key);
	    return 1;
		}
	}

}
