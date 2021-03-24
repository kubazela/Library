package Cv_Book;

import java.sql.Date;
import java.util.ArrayList;

public class Reader {
	private String firstName;
	private String lastName;
	private ArrayList<Book> myBooks = new ArrayList<Book>();
	private Date dateOfBirth;
	
	public Reader (String firstName, String lastName, int year, int month, int day) {
		this.firstName = firstName;
		this.lastName = lastName;
		dateOfBirth = new Date(year, month, day);
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
	public ArrayList<Book> getMyBooks(){
		return myBooks;
	}
	public void getMyBooks(ArrayList<Book> myBooks){
		this.myBooks = myBooks;
	}
	public void borrowBook(Book book) {
		if (book.getAvailible() == true) {
			myBooks.add(book);
			book.setAvailible(false);
		}
	}
	public void returnBook(Book book) {
		if(book.getAvailible() == false) {
			myBooks.remove(book);
			book.setAvailible(true);
		}
	}
	public void listBorrowed() {
		for (Book book : myBooks) {
			System.out.println(book.getTitle());
		}
	}
}
