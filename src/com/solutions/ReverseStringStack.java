package com.solutions;

import java.util.Stack;

public class ReverseStringStack {

//	public static void main(String[] args) {
//		Stack<Character> s=new Stack<>();
// 		String str="hey";
// 		for(int i=0;i<str.length();i++)
// 		{
// 		    s.push(str.charAt(i));
// 		}
// 		while(!s.isEmpty())
// 		{
// 		    System.out.println(s.pop());
// 		}
//
//	}
//-------------------------------------------------------------
//	public static void main(String[] args) {
// 		Stack<Character> s=new Stack<>();
// 		String str="hey";
// 		char ch[]=str.toCharArray();
// 		for(int i=0;i<str.length();i++)
// 		{
// 		    s.push(ch[i]);
// 		}
// 		int j=0;
// 		while(!s.isEmpty())
// 		{
// 		    ch[j++]=s.pop();
// 		}
// 		System.out.println(String.copyValueOf(ch));
// 	}
// ------------------------------------------------------------
	public static void main(String[] args) {
		Stack<Character> s=new Stack<>();
		String str="hello! hi?";
		for(int i=0;i<str.length();i++)
		{
		    s.push(str.charAt(i));
		}
		StringBuilder sb=new StringBuilder();
		while(!s.isEmpty())
		{
		    sb.append(s.pop());
		}
		    System.out.println(sb);
	}
}
