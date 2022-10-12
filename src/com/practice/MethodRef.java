package com.practice;

interface Painter {
	String paint(String str);
}

class StatPaint {
	public static String convert(String s) {
		return (s.length() <= 3 ? "Yes" : "No");
	}
//	public String convert(String s)
//	{
//		return (s.length()<=3?"Yes":"No");
//	}
}

class Printer {
	public void print(String str, Painter p) {
		str = p.paint(str);
		System.out.println(str);
	}
}

public class MethodRef {

	public static void main(String[] args) {
		String str = "ppp";
		StatPaint sp = new StatPaint();
		Printer mp = new Printer();
		// mp.print(str,sp::convert);
		mp.print(str, StatPaint::convert);

	}

}
