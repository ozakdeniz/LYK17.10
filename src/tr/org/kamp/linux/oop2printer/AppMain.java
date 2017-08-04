package tr.org.kamp.linux.oop2printer;

import java.util.ArrayList;
import java.util.Random;

public class AppMain {
	
	public static void main(String[] args) {
		
		ArrayList<Document> printList = new ArrayList<>();
		
		printList.add(new PDF("Coelho", "PDF"));
		printList.add(new Picture("Java" , "Jpeg"));
		printList.add(new LibreOffice("Java Ders", 	"Libre"));
		
		Random rand = new Random();
		int index = rand.nextInt(3);
		printList.get(index).printDocument();
		
		System.out.println("yazar : "+ printList.get(index).getAuthor());
		
	}

}
