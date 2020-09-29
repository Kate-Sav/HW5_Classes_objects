package by.htp.task2.entity;

import java.util.ArrayList;

public class Library {
	ArrayList<Book> books = new ArrayList<Book>();

	public Library() {
	}

	public ArrayList<Book> getBooks() {
		return books;
	}

	public void setBooks(ArrayList<Book> books) {
		this.books = books;
	}
	
	public Book getBook(int i) {
		return books.get(i);
	}

	public void add(Book b) {
		books.add(b);
	}

}
