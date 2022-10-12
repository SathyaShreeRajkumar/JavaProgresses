package com.practice;

import java.util.*;
public class StringBuff_Builder {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		StringBuffer sb= new StringBuffer(str);
		System.out.println(sb.reverse());
		//sb.append(" shree");
		//System.out.println(sb);
		//System.out.println(sb.codePointBefore(1));
		in.close();

	}

}
