package com.practice;

import java.util.ArrayList;

class Shoper{
	private String s_name;
	private int s_id;
	Shoper(String s_name,int s_id)
	{
		this.s_name=s_name;
		this.s_id=s_id;
	}
	@Override
	public String toString()
	{
		return "Name:"+" "+s_name+"ID:"+" "+s_id;
	}
}

public class OverrideTostringArrayList {

	public static void main(String[] args) {
		//Shoper s=new Shoper("sathya",1);
		//System.out.println(s.toString());
		ArrayList<Shoper> sp=new ArrayList<>();
		sp.add(new Shoper("Krishna",1));
		sp.add(new Shoper("Balarama",2));
		for(Shoper tmp:sp)
		{
			System.out.println(tmp);
		}
	}

}
