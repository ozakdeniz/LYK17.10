package tr.org.kamp.linux.oop3warrior;

/**
 * @author ozgur
 *
 */
public abstract class Item {
	
	private int itemQuantity;
	private int itemPrice;
	private int itemWeight;
	
	private boolean useItem;
	
	
	public int getItemQuantity() {
		return itemQuantity;
	}

	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}

	public int getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}

	public int getItemWeight() {
		return itemWeight;
	}

	public void setItemWeight(int itemWeight) {
		this.itemWeight = itemWeight;
	}

	public boolean isUseItem() {
		return useItem;
	}

	public void setUseItem(boolean useItem) {
		this.useItem = useItem;
	}

	
	public Item(int itemQuantity, int itemPrice, int itemWeight , boolean useItem) {
		this.itemQuantity = itemQuantity;
		this.itemPrice = itemPrice;
		this.itemWeight = itemWeight;
		this.useItem = useItem;
		itemQuantity++;
	}
	
	
	
	
	

}
