package Cv_Book;

public class Book {
	private String title;
	private Author author;
	private int pages;
	private double price;
	private boolean availible;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public boolean getAvailible() {
		return availible;
	}
	public void setAvailible(boolean availible) {
		this.availible = availible;
	}
	public Book(Author author, String title, int pages, double price) {
		this.author = author;
		this.title = title;
		this.pages = pages;
		this.price = price;
	}
	public Book(String firstName, String lastName, int year, int month, int day, String title, int pages, double price) {
		author = new Author(firstName, lastName, year, month, day);
		this.title = title;
		this.pages = pages;
		this.price = price;
	}
	@Override
	public String toString() {
		return author.getFirstName() + " " + author.getLastName() + " - " + title;
	}
}
