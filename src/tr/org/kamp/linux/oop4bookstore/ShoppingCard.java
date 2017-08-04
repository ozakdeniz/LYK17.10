package tr.org.kamp.linux.oop4bookstore;

import java.util.ArrayList;

public class ShoppingCard {
	
	ArrayList<Book> contents;
	
	
	public int numOfEntriesInTheCard() {
		return contents.size();
	}
	
	public void addBooks(Book book) {
		contents.add(book);
	}

}