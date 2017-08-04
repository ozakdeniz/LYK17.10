package tr.org.kamp.linux.oop3warrior;

public class Bow extends Weapon implements Upgradeable{

	private int numOfArrows;
	
	
	public void useItem() {
		if(numOfArrows > 0) {
			setUseItem(true);
			
		}else {
			setUseItem(false);
		}
	}
	
	
	public Bow(int itemQuantity, int itemPrice, int itemWeight, boolean useItem, int damageAmount, int numOfArrows) {
		super(itemQuantity, itemPrice, itemWeight,useItem , damageAmount);
		// TODO Auto-generated constructor stub
		this.numOfArrows = numOfArrows;
	}

	public int getNumOfArrows() {
		return numOfArrows;
	}

	public void setNumOfArrows(int numOfArrows) {
		this.numOfArrows = numOfArrows;
	}


	@Override
	public void upgrade() {
		// TODO Auto-generated method stub
		numOfArrows = numOfArrows+10;
		
		
	}
	
	
	

}
