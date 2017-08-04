package tr.org.kamp.linux.oop4bookstore;


public class Purchase {
	
	protected String purchaseDate;
	protected String shippingDate;
	protected int deliveryLengthAsDays;
	ShoppingCard shoppingCard;
	public String getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(String purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	public String getShippingDate() {
		return shippingDate;
	}
	public void setShippingDate(String shippingDate) {
		this.shippingDate = shippingDate;
	}
	public int getDeliveryLengthAsDays() {
		return deliveryLengthAsDays;
	}
	public void setDeliveryLengthAsDays(int deliveryLengthAsDays) {
		this.deliveryLengthAsDays = deliveryLengthAsDays;
	}
	public ShoppingCard getShoppingCard() {
		return shoppingCard;
	}
	public void setShoppingCard(ShoppingCard shoppingCard) {
		this.shoppingCard = shoppingCard;
	}
	
	

}