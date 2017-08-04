package tr.org.kamp.linux.oop1footbl;

import java.awt.Color;

public class FootballClub extends Club {
	
	
	protected String stadiumName;	
	protected int stadiumCapacity;

	public FootballClub() {
		
	}
	
	public FootballClub(String clubName, Color colors, String clubValue , String stadiumName, int stadiumCapacity) {
		super(clubName, colors, clubValue);
		// TODO Auto-generated constructor stub
		this.stadiumName =stadiumName;
		this.stadiumCapacity = stadiumCapacity;
		
	}

	
	public String getStadiumName() {
		return stadiumName;
	}
	public void setStadiumName(String stadiumName) {
		this.stadiumName = stadiumName;
	}
	public int getStadiumCapacity() {
		return stadiumCapacity;
	}
	public void setStadiumCapacity(int stadiumCapacity) {
		this.stadiumCapacity = stadiumCapacity;
	}
}
