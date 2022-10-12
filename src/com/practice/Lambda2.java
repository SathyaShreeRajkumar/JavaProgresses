package com.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

interface Playable{
	public List<Movie> show();
}
class Movie{
	int m_id;
	String m_name;
    String m_line;
	public Movie(int m_id, String m_name, String m_line) {
		this.m_id=m_id;
		this.m_name=m_name;
		this.m_line=m_line;
	}
	public int getM_id() {
		return m_id;
	}
	public void setM_id(int m_id) {
		this.m_id = m_id;
	}
	public String getM_name() {
		return m_name;
	}
	public void setM_name(String m_name) {
		this.m_name = m_name;
	}
	public String getM_line() {
		return m_line;
	}
	public void setM_line(String m_line) {
		this.m_line = m_line;
	}
	
}
public class Lambda2 {

	public static void main(String[] args) {
		List<Movie> movie=new ArrayList<>();
		movie.add(new Movie(1,"Grudge","Jaddu"));
		movie.add(new Movie(2,"Anabel","Dhawan"));
		movie.add(new Movie(3,"Mummy","Yishan"));
		
		//movie.forEach(m->System.out.println(m.getM_name()));
		
		Playable play=()->movie.stream().filter(m->m.getM_id()>1).collect(Collectors.toList());
		List<Movie> movies=play.show();
     	movies.forEach(s->System.out.println("the id is "+s.getM_name()));

		

	}

}
