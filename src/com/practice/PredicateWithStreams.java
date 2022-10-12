package com.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

class Book {
	int b_id;
	String b_name;
	String author;

	Book(int b_id, String b_name, String author) {
		this.b_id = b_id;
		this.b_name = b_name;
		this.author = author;
	}

	public int getb_id() {
		return b_id;
	}

	public void setb_id(int b_id) {
		this.b_id = b_id;
	}

	public String getb_name() {
		return b_name;
	}

	public void setb_name(String b_name) {
		this.b_name = b_name;
	}

	public String getauthor() {
		return author;
	}

	public void setauthor(String author) {
		this.author = author;
	}
}

public class PredicateWithStreams {
	public static void main(String[] args) {
		Book b1 = new Book(1, "Horror", "John");
		Book b2 = new Book(2, "Thriller", "Niki");
		Book b3 = new Book(3, "Action", "Bella");

		List<Book> list = new ArrayList<>();
		list.add(b1);
		list.add(b2);
		list.add(b3);

		Supplier<Book> s = () -> new Book(4, "Comic", "Daniel");
		System.out.println(s.get().getauthor());

		list.stream().filter(book -> (book.getb_id() > 1)).forEach((book) -> 
		System.out.println(book.getb_name()));

		Predicate<Book> p = (book) -> (book.getb_id() > 2);
		System.out.println(p.test(b2));

		list = list.stream().filter(p).collect(Collectors.<Book>toList());
		for (Book b : list)
			System.out.println(b.getb_id());
		
		Optional<Book> opt=Optional.empty();
		System.out.println(opt.isPresent());
		

	}

}
