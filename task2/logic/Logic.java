package by.htp.task2.logic;

import by.htp.task2.entity.Book;
import by.htp.task2.entity.Library;

public class Logic {

	public Library byAuthor(Library library, String author) {
		Library newLibrary = new Library();
		for (Book b : library.getBooks()) {
			if (b.getAuthor().equals(author)) {
				newLibrary.add(b);
			}
		}
		return newLibrary;
	}

	public Library bypublishingOffice(Library library, String publishingOffice) {
		Library newLibrary = new Library();
		for (Book b : library.getBooks()) {
			if (b.getPublishingOffice().equals(publishingOffice)) {
				newLibrary.add(b);
			}
		}
		return newLibrary;
	}

	public Library bypublishingYear(Library library, int publishingYear) {
		Library newLibrary = new Library();
		for (Book b : library.getBooks()) {
			if (b.getPublishingYear() > publishingYear) {
				newLibrary.add(b);
			}
		}
		return newLibrary;
	}

}
