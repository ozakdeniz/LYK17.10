package tr.org.kamp.linux.oop3warrior;

public class Armor extends Item implements Upgradeable {
	
	
	private int defencePoints;
	private boolean isWorn;
	
	public int getDefencePoints() {
		return defencePoints;
	}

	public void setDefencePoints(int defencePoints) {
		this.defencePoints = defencePoints;
	}

	public boolean isWorn() {
		return isWorn;
	}

	public void setWorn(boolean isWorn) {
		this.isWorn = isWorn;
	}


	public Armor(int itemQuantity, int itemPrice, int itemWeight, boolean useItem, int defencePoints, boolean isWorn) {
		super(itemQuantity, itemPrice, itemWeight, useItem);
		// TODO Auto-generated constructor stub
		this.defencePoints = defencePoints;
		isWorn = true;
	}

	@Override
	public void upgrade() {
		// TODO Auto-generated method stub
		defencePoints = defencePoints +100;
		}
		
	
	
	public void getHit(int damagePoint) {
		if(isWorn == true) {//(isWorn) şeklinde yazılmış olsaydı da boş halini java true sayar yine aynı olurdu..
			if(defencePoints > damagePoint) {
				defencePoints = defencePoints - damagePoint;
			}
	}else {
		defencePoints = 0; isWorn=false;
	}

}
}
