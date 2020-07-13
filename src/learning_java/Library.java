package learning_java;

import java.util.*;
import java.util.ArrayList;

public class Library {
	private ArrayList<Book> listOfBooks;

	public Library() {
		this.listOfBooks = new ArrayList<Book>();

	}

	public void addBook(Book newBook) {
		listOfBooks.add(newBook);
	}

	public void printBooks() {
		for (Book book : listOfBooks) {
			System.out.println(book.toString());

		}
	}

	public ArrayList<Book> searchByTitle(String title) {
		ArrayList<Book> found = new ArrayList<Book>();

		for (Book book : listOfBooks) {
			if (StringUtils.included(book.title(), title)) {
				found.add(book);
			}
		}
		return found;
	}

	public ArrayList<Book> searchByPublisher(String publisher) {
		ArrayList<Book> found = new ArrayList<Book>();

		for (Book book : listOfBooks) {
			if (book.publisher().contains(publisher)) {
				found.add(book);
			}
		}
		return found;
	}

	public ArrayList<Book> searchByYear(int year) {
		ArrayList<Book> found = new ArrayList<Book>();

		for (Book book : listOfBooks) {
			if (book.year() == year) {
				found.add(book);
			}
		}
		return found;
	}

	public static void main(String[] args) {
		Library Library = new Library();

		Library.addBook(new Book("Cheese Problems Solved", "Woodhead Publishing", 2007));
		Library.addBook(new Book("The Stinky Cheese Man and Other Fairly Stupid Tales", "Penguin Group", 1992));
		Library.addBook(new Book("NHL Hockey", "Stanley Kupp", 1952));
		Library.addBook(new Book("Battle Axes", "Tom A. Hawk", 1851));

		for (Book book : Library.searchByTitle("CHEESE")) {
			System.out.println(book);
		}

		System.out.println("---");
		for (Book book : Library.searchByPublisher("PENGUIN  ")) {
			System.out.println(book);
		}

	}
}