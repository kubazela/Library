package Cv_Book;

import java.util.ArrayList;

public class Library {
	private ArrayList<Book> books = new ArrayList<Book>();
	
	public ArrayList<Book> getBooks() {
		return books;
	}
	public void setBooks(ArrayList<Book> books) {
		this.books = books;
	}
	public Book addBook(Book book) {
		books.add(book);
		book.setAvailible(true);
		return book;
	}
	public void listAvailible() {
		String s = "";
		for(Book book : books){
			if (book.getAvailible() == true) {
				s = s + book + "\n";
			}
		}
		System.out.println(s);
	}
	public void listUnavailible() {
		String s = "";
		for(Book book : books){
			if (!book.getAvailible()) {
				s = s + book + "\n";
			}
		}
		System.out.println(s);
	}
	public void listAll() {
		String s = "";
		for (Book book : books) {
			s = s + book + "\n";
		}
		System.out.println(s);
	}
}
