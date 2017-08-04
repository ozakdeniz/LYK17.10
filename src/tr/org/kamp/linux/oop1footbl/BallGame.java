package tr.org.kamp.linux.oop1footbl;

public abstract class BallGame extends Game{
	
	abstract void moveTheBall();
		
	abstract void anOppenentScores(String team);
	
	@Override
	public void hasWinner() {
		// TODO Auto-generated method stub
		super.hasWinner();
	}
	
	@Override
	public void hasOpponent() {
		// TODO Auto-generated method stub
		
	}
	
}
