package tr.org.kamp.linux.oop1footbl;


	
	public class FootballRules extends Football{
//alt+shift+s kisa yol source menusu
		
		protected String homeTeam;
		protected String guestTeam;
		protected int scoreOfGuestTeam;
		protected int scoreOfHomeTeam;
		private FootballClub club1;
		private FootballClub club2;
		
		public FootballRules(FootballClub club1, FootballClub club2) {
			this.club1 = club1;
			this.club2 = club2;
		}
	
		public FootballRules(String homeTeam, String guestTeam, int scoreOfGuestTeam, int scoreOfHomeTeam,
				FootballClub club1, FootballClub club2) {
			super();
			this.homeTeam = homeTeam;
			this.guestTeam = guestTeam;
			this.scoreOfGuestTeam = scoreOfGuestTeam;
			this.scoreOfHomeTeam = scoreOfHomeTeam;
			this.club1 = club1;
			this.club2 = club2;
		}

		public FootballRules() {
			// TODO Auto-generated constructor stub
		}

		public String getHomeTeam() {
			return homeTeam;
		}

		public void setHomeTeam(String homeTeam) {
			this.homeTeam = homeTeam;
		}

		public String getGuestTeam() {
			return guestTeam;
		}

		public void setGuestTeam(String guestTeam) {
			this.guestTeam = guestTeam;
		}
		public void setAsHomeTeam(String teamone) {
			homeTeam=teamone;
		}
		public void setAsGuestTeam(String teamtwo) {
			guestTeam=teamtwo;
		}
		
		public int getScoreOfHomeTeam() {
			return scoreOfHomeTeam;
		}

		public void setScoreOfHomeTeam(int scoreOfHomeTeam) {
			this.scoreOfHomeTeam = scoreOfHomeTeam;
		}

		public int getScoreOfGuestTeam() {
			return scoreOfGuestTeam;
		}

		public void setScoreOfGuestTeam(int scoreOfGuestTeam) {
			this.scoreOfGuestTeam = scoreOfGuestTeam;
		}

		@Override
		public void hasOpponent() {
			// TODO Auto-generated method stub
			
		}

		@Override
		protected void hasHoliganism() {
			// TODO Auto-generated method stub
			
		}

		@Override
		protected void playableWith22Players() {
			// TODO Auto-generated method stub
			
		}

		@Override
		void moveTheBall() {
			// TODO Auto-generated method stub
			
		}

		@Override
		void anOppenentScores(String team) {
			// TODO Auto-generated method stub
			club1=new FootballClub();
			club2=new FootballClub();
			
			if(team.equals(club1.getClubName())) {
				setScoreOfHomeTeam(getScoreOfHomeTeam()+1);//set aliyor get ile eşitlemiş olduk
			}else {
				setScoreOfGuestTeam(getScoreOfGuestTeam()+1);
			}
			
		}
		
	

	}
