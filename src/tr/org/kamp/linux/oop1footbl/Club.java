package tr.org.kamp.linux.oop1footbl;

import java.awt.Color;

public abstract class Club {
	
	protected String clubName;
	protected Color colors;
	protected String clubValue;
	
	
	public String getClubName() {
		return clubName;
	}

	public void setClubName(String clubName) {
		this.clubName = clubName;
	}

	public Color getColors() {
		return colors;
	}

	public void setColors(Color colors) {
		this.colors = colors;
	}

	public String getClubValue() {
		return clubValue;
	}

	public void setClubValue(String clubValue) {
		this.clubValue = clubValue;
	}
	
	
	public Club(String clubName, Color colors, String clubValue) {
		
	}
	
	public Club() {
		
	}
	

}
