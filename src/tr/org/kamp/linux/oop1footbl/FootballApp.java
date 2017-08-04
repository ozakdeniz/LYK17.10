package tr.org.kamp.linux.oop1footbl;

import java.awt.Color;

public class FootballApp {
	
	
	public static void main(String[] args) {
	
	FootballClub fc1 = new FootballClub("LezizSpor", Color.DARK_GRAY, "LezizSporun leziz kulübü.","ReadArmy",200000000);
	
	FootballClub fc2 = new FootballClub("AnkaraGücü", Color.BLUE, "1", "19Mayıs", 1000);
	
	FootballRules rule = new FootballRules(fc1,fc2);
	
	System.out.println(rule.homeTeam);
	System.out.println(rule.guestTeam);
	rule.anOppenentScores(fc1.getClubName());
	rule.anOppenentScores(fc2.getClubName());
	rule.anOppenentScores(fc1.getClubName());
	rule.hasWinner();
	}
}
