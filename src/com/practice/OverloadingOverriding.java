package com.practice;

import java.util.Arrays;
import java.util.Scanner;

class Attendance{
	public void student1(String sname,int sid)
	{
		System.out.println(sname+"->"+sid);
	}
	public void student1(String sname,int sid,String sdob) {
		System.out.println(sname+"->"+sid+"->"+sdob);
	}
	public void student1(int arr[])
	{
		System.out.println(Arrays.toString(arr));
	}
}
class LogBook extends Attendance{
	@Override
	public void student1(String sname,int sid)
	{
		System.out.println("Name"+sname+" "+"ID"+sid);
	}
	@Override
	public void student1(int arr[])
	{
		for(int i:arr)
		{
			System.out.println(i);
		}
	}
}

public class OverloadingOverriding {

	public static void main(String[] args) {
		LogBook lb=new LogBook();
		lb.student1("Krishna",01);
		lb.student1("Balaram",02,"12-12-2002");
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=in.nextInt();
		}
		lb.student1(arr);
		in.close();
	}

}
