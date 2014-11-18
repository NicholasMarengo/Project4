
public class LadderBallEvent extends Events {
	
	private int numRings = 6;
		
		public LadderBallEvent(String newName, int newPlayTo, boolean newIsPlayToExact, int newPlayDistance){
			super (newName, newPlayTo, newIsPlayToExact, newPlayDistance);
		}
	
		public LadderBallEvent(){
			super("LadderBall", 21, true, 15);
		}

		@Override public String getExtraInfo(){
			return "This game is played with " + numRings + "rings!";
		}
}