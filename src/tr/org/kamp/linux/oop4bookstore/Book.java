package tr.org.kamp.linux.oop4bookstore;


public class Book {
	
	protected String name;
	protected String author;
	protected String bookId;
	protected double price;
	
	public Book(String name, String author, String bookId, double price) {
		this.name = name;
		this.author = author;
		this.bookId = bookId;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public void applyDiscount(double discountRate) {
		price = price - (price * discountRate / 100);
	}
	
	
	

}