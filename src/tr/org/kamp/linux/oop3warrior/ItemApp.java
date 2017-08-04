package tr.org.kamp.linux.oop3warrior;

public class ItemApp {
	public static void main(String[] args) {
		
	Bow bow = new Bow(5, 500 , 20 , true , 60 , 200);
	Armor armor = new Armor(6, 5 , 20 ,true, 80, true);
	Armor armor2 =new Armor (9 , 5, 20, true, 20,false );
	Sword sword = new Sword(1, 2, 50, false, 20);
	
	armor.getHit(40);
	armor.getDefencePoints();
	System.out.println(" zırh1 hasar aldı!!! kalan defans :" + armor.getDefencePoints());
	
	
	System.out.println( bow.getNumOfArrows()+" oklar arttırıldı ");
	
	}
}
