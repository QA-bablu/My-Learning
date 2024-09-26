package InterviewPreparation;

import java.util.ArrayList;
import java.util.List;

public class Book {

	String title;
	String author;
	int year;

	public Book(String title, String author, int year) {

		this.title = title;
		this.author = author;
		this.year = year;

	}

	public String getTtile() {

		return title;
	}

	public String getAuthor() {

		return author;
	}

	public int getYear() {

		return year;

	}

	public static void main(String[] args) {

		List<Book> books = new ArrayList<>();
		books.add(new Book("Titanic", "james", 2015));
		books.add(new Book("2012", "Speil Burg", 2010));
		books.add(new Book("Terminator", "Roland Enrich", 2011));
		books.add(new Book("Avatar", "Camron", 2012));

		List<String> authors = getAuthors(books);

		for (String author : authors) {
			System.out.println(author);
		}

	}

	private static List<String> getAuthors(List<Book> books) {
		List<String> authorList = new ArrayList<>();
		for (Book book : books) {
			authorList.add(book.getAuthor());
		}
		return authorList;
	}

}
