package tr.org.kamp.linux.oop4bookstore;


public class HardCopyBook extends Book {
	protected double weight;
	protected double shippingCost;
	
	public HardCopyBook(String name, String author, String bookId, double price, double weight, double shoppingCost) {
		super(name, author, bookId, price);
		this.weight = weight;
		this.shippingCost = shoppingCost;
	}
	
	public double getTotalCost() {
		return price + shippingCost;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getShoppingCost() {
		return shippingCost;
	}

	public void setShoppingCost(double shoppingCost) {
		this.shippingCost = shoppingCost;
	}
	
	

}