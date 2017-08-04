package tr.org.kamp.linux.oop4bookstore;

import java.util.ArrayList;

public class BookStoreApp {
	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.setCustomerName("Joe");
		customer.setCustomerSurname("Strummer");
		
		HardCopyBook hardCopyBook1 = new HardCopyBook("Sırça Fanus", "Sylvia Plath", "12312", 30, 2, 3);
		HardCopyBook hardCopyBook2 = new HardCopyBook("Sevdadır", "Arkadaş Zekai Özger", "42142", 24, 22, 12);
		
		EBook ebook1 = new EBook("Dublinliler", "James Joyce", "123345", 32, 12, "UTF", 4);
		EBook ebook2 = new EBook("Şirince Meydan Muharebelerinin Mufassal Tarihçesi", "Sevan Nişanyan", "24123", 30,21,"UTF", 3);
		
		Purchase purchase = new Purchase();
		ArrayList<Purchase> purchaseHistory = new ArrayList<>();
		purchaseHistory.add(purchase);
		
		ShoppingCard shoppingCard = new ShoppingCard();
		shoppingCard.addBooks(hardCopyBook1);
		shoppingCard.addBooks(hardCopyBook2);
		shoppingCard.addBooks(ebook2);
		
		purchase.setShoppingCard(shoppingCard);
		customer.setPurchaseHistory(purchaseHistory);
		
	}
}