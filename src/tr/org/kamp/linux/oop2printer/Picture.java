package tr.org.kamp.linux.oop2printer;

import java.time.LocalDate;

public class Picture extends Document{

	private String Picname;

	public String getPicname() {
		return Picname;
	}

	public void setPicname(String picname) {
		Picname = picname;
	}

	public Picture(String PicName,String content) {
		super(content);
		this.Picname=Picname;
	}

	public Picture(String content, LocalDate time,String author) {
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
		System.out.println("Resim dökümanı yazdırılıyor...");
		
	}

}
