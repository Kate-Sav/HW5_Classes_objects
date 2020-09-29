package by.htp.task2.entity;

public class Book {
	private int id;
	private String title;
	private String author;
	private String publishingOffice;
	private int publishingYear;
	private int numberOfPages;
	private int price;
	private String bookBinding;

	public Book() {
	}

	public Book(String title, String author, String publishingOffice, int publishingYear) {
		this.title = title;
		this.author = author;
		this.publishingOffice = publishingOffice;
		this.publishingYear = publishingYear;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublishingOffice() {
		return publishingOffice;
	}

	public void setPublishingOffice(String publishingOffice) {
		this.publishingOffice = publishingOffice;
	}

	public int getPublishingYear() {
		return publishingYear;
	}

	public void setPublishingYear(int publishingYear) {
		this.publishingYear = publishingYear;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getBookBinding() {
		return bookBinding;
	}

	public void setBookBinding(String bookBinding) {
		this.bookBinding = bookBinding;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + ((bookBinding == null) ? 0 : bookBinding.hashCode());
		result = prime * result + id;
		result = prime * result + numberOfPages;
		result = prime * result + price;
		result = prime * result + ((publishingOffice == null) ? 0 : publishingOffice.hashCode());
		result = prime * result + publishingYear;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (bookBinding == null) {
			if (other.bookBinding != null)
				return false;
		} else if (!bookBinding.equals(other.bookBinding))
			return false;
		if (id != other.id)
			return false;
		if (numberOfPages != other.numberOfPages)
			return false;
		if (price != other.price)
			return false;
		if (publishingOffice == null) {
			if (other.publishingOffice != null)
				return false;
		} else if (!publishingOffice.equals(other.publishingOffice))
			return false;
		if (publishingYear != other.publishingYear)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", publishingOffice=" + publishingOffice
				+ ", publishingYear=" + publishingYear + ", numberOfPages=" + numberOfPages + ", price=" + price
				+ ", bookBinding=" + bookBinding + "]";
	}
}
