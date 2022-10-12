package com.sample.programs;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class GreatestNumber {
	public static void main(String args[])
	{
//		Scanner in=new Scanner(System.in);
//		System.out.println("Enter first number");
//		int num1=in.nextInt();
//		System.out.println("Enter second number");
//        int num2=in.nextInt();
//        System.out.println("Enter third number");
//        int num3=in.nextInt();
//        if(num1>num2 && num1>num3)
//        {
//            System.out.println("First number is greater "+num1);
//        }
//        else if(num2>num3 && num2>num1)
//        {
//            System.out.println("Second number is greater "+num2);
//        }
//        else{
//            System.out.println("Third number is greater "+num3);
//        }
//        in.close();
        
        List<Integer> list=Arrays.asList(40,20,30,50);
        //Optional<Integer> result=list.stream().max((x,y)->x.compareTo(y));
        Optional<Integer> result=list.stream().max(Integer::compareTo);
        if(result.isPresent())
        {
        	int value=result.get();
        	System.out.println(value);
        }
        else
        	System.out.println("no");
        
	}

}
