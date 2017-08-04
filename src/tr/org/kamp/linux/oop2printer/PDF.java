package tr.org.kamp.linux.oop2printer;

import java.time.LocalDate;

public class PDF extends Document {
	
	


	public PDF(String content, LocalDate time,String author) {
		super(content, time,author);
		// TODO Auto-generated constructor stub

		this.author=author;
	}
	
	public PDF(String content, String author) {
		super(content, author);

		
	}

	@Override
	void getText() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void printDocument() {
		// TODO Auto-generated method stub
		
		System.out.println("pdf dökümanı yazdırılıyor...");
		
	}

}
