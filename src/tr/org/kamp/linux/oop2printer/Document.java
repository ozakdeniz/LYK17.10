package tr.org.kamp.linux.oop2printer;

import java.time.LocalDate;

public abstract class Document {
	
	private String content;
	private LocalDate time;
	protected String author;
	
	
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	public String getContent() {
		return content;
	
	}

	public void setContent(String content) {
		this.content = content;
	
	}

	public LocalDate getTime() {
		return time;
	
	}

	public void setTime(LocalDate time) {
		this.time = time;
	
	}

	public Document(String content, LocalDate time, String author) {
		this.content=content;
		this.time=time;
		this.author=author;
	
	}
	
	public Document(String content2) {
		// TODO Auto-generated constructor stub
	}
	public Document(String content, String author) {
		// TODO Auto-generated constructor stub
	}

	abstract void getText();
	abstract void printDocument();

}
