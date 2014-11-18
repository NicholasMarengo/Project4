
public class Team {
	private Olympian olympian1;
	private Olympian olympian2;
	int wins;
	int losses;
	
			public Team() {
				
				this.olympian1 = new Olympian();
				this.olympian2 = new Olympian();
				this.wins = 0;
				this.losses = 0;
			}
	
			public Team(Olympian olympianX, Olympian olympianY) {
				
				this.olympian1 = olympianX;
				this.olympian2 = olympianY;
				this.wins = 0;
				this.losses = 0;
			}
	
			public Team(Olympian olympianX, Olympian olympianY, int wins, int losses) {
				
				this.olympian1 = olympianX;
				this.olympian2 = olympianY;
				this.wins = wins;
				this.losses = losses;
		
			}
	
			public void SetInfo(Olympian olympianA, Olympian olympianB, int wins, int loss) {
				
				this.olympian1 = olympianA;
				this.olympian2 = olympianB;
				this.wins = wins;
				this.losses = loss;
			}
	
			public String getInfo() {
				return this.olympian1 + " and " + this.olympian2;
			}
		
	
}	