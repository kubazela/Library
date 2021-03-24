package Cv_Book;

import java.sql.Date;
import java.util.ArrayList;

import javax.print.attribute.standard.DateTimeAtCompleted;

public class Author {
	private String firstName;
	private String lastName;
	private ArrayList<Book> books = new ArrayList<Book>();
	private Date dateOfBirth;
	
	public Author(String firstName, String lastName, int year, int month, int day) {
		this.firstName = firstName;
		this.lastName = lastName;
		dateOfBirth = new Date(year, month, day);
	}
	public Author(String firstName, String lastName, Date dateOfBirth) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public ArrayList<Book> getBooks() {
		return books;
	}
	public void setBook(Book book) {
		this.books.add(book);
	}
	public void listBooks() {
		for (int i = 0; i < books.size(); i++)
			System.out.println(books.get(i).getTitle());
	}
	@Override
	public String toString() {
		String s = "";
		for (int i = 0; i < books.size(); i++)
			s += books.get(i).getTitle() + ", ";
		return firstName + " " + lastName + ", Birth date: " + dateOfBirth + "\n	Books: " + s;
	}
}
