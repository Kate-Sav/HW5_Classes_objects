package by.htp.task2.main;

import by.htp.task2.entity.Book;
import by.htp.task2.entity.Library;
import by.htp.task2.logic.Logic;
import by.htp.task2.viewer.Viewer;

public class Main {

	public static void main(String[] args) {
		Library l = new Library();
		Book b1 = new Book("Java", "Laff", "KK", 1990);
		Book b2 = new Book("Java", "Braff", "KK", 2001);
		Book b3 = new Book("Java", "Laff", "CC", 1990);
		l.add(b1);
		l.add(b2);
		l.add(b3);
		Logic logic = new Logic();
		Viewer viewer = new Viewer();
		Library l2 = logic.byAuthor(l, "Laff");
		viewer.printAuthor(l2);
		
	}
}
