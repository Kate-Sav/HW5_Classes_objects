package by.htp.task2.viewer;

import by.htp.task2.entity.Book;
import by.htp.task2.entity.Library;

public class Viewer {
	public void printAuthor(Library library) {
		System.out.println("-------------");
		System.out.println("Author - " + library.getBook(0).getAuthor());
		System.out.println("-------------");
		for(Book b : library.getBooks()) {
			System.out.println(b.getTitle());
		}
		
	}
	

}
