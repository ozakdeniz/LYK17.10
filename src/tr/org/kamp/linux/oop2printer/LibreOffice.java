package tr.org.kamp.linux.oop2printer;

import java.time.LocalDate;

public class LibreOffice extends Document {

	private String Librename;

	public String getLibrename() {
		return Librename;
	}

	public void setLibrename(String librename) {
		Librename = librename;
	}

	public LibreOffice(String LibreName,String content) {
		super(content);
		this.Librename=Librename;
	}

	public LibreOffice(String content, LocalDate time,String author) {
		super(content, time,author);
		// TODO Auto-generated constructor stub
	}

	@Override
	void getText() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void printDocument() {
		// TODO Auto-generated method stub
		System.out.println("Libre dökümanı yazdırılıyor...");
		
	}

}
