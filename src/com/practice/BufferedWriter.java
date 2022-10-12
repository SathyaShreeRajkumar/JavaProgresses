package com.practice;
//import java.util.*;
import java.io.*;

public class BufferedWriter {

	public static void main(String[] args)throws Exception{
		//try {
		FileWriter fw=new FileWriter("C:\\Users\\sathya.shree\\Documents\\sample.txt");
		fw.write("hey here");
		fw.write("\nhere");
		fw.close();
		//}
//		catch(Exception e) {
//		System.out.println("Done");
//		}
		FileReader fr=new FileReader("C:\\Users\\sathya.shree\\Documents\\sample.txt");
		BufferedReader bf=new BufferedReader(fr);
		String s;
		while((s=bf.readLine())!=null)
		{
			System.out.println(s);
		}
		bf.close();

	}

}
