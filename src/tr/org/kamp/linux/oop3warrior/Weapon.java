package tr.org.kamp.linux.oop3warrior;

public abstract class Weapon extends Item{

	private int damageAmount;
	
	public Weapon(int itemQuantity, int itemPrice, int itemWeight, boolean useItem, int damageAmount) {
		super(itemQuantity, itemPrice, itemWeight, useItem);
		// TODO Auto-generated constructor stub
		this.damageAmount = damageAmount;
	}


	public int getDamageAmount() {
		return damageAmount;
	}

	public void setDamageAmount(int damageAmount) {
		this.damageAmount = damageAmount;
	}
	

}
