package com.solutions;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Date_Time {
	public static void main(String args[])
	{
		LocalDate d=LocalDate.now();
		System.out.println(d);
		
		LocalDate d1=LocalDate.of(2002,5,8);
		System.out.println(d1);
		
		LocalTime t=LocalTime.now();
		System.out.println(t);
		
		LocalTime t1=LocalTime.of(14,39);
		System.out.println(t1);
		
		LocalTime t2=LocalTime.now(ZoneId.of("GMT"));
		System.out.println(t2);
		
		Instant i=Instant.now();
		System.out.println(i);         //Machine readable time
		
		LocalDateTime l=LocalDateTime.now();
		System.out.println(l);
		
		DateTimeFormatter df=DateTimeFormatter.ofPattern("dd-mm-yyy,hh-mm-ss");
		String s1=l.format(df);
		System.out.println(s1);        //Formatter 
		
		
		for(String s: ZoneId.getAvailableZoneIds())
		{
			System.out.println(s);
		}
	}

}
