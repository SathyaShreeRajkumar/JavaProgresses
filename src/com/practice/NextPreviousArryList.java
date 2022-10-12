package com.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class NextPreviousArryList {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>();

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int i = 0; i < n; i++) {

			a.add(in.nextInt());
		}
		// a.remove(0);
// 		for(int i:a)
// 		{
// 		    System.out.println(i);
// 		} 
		Collections.sort(a);             //increasing
		Collections.reverse(a);          //decreasing
		Collections.swap(a, 1, 4);       //Swap 2nd and 5th element
        a.forEach(i-> System.out.println(i));
        in.close();

	}

}
