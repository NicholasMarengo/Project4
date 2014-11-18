
public class CanJamEvents extends Events {
	
	int frisbeeSize = 6;
		public CanJamEvents(String newName, int newPlayTo, boolean newIsPlayToExact, int newPlayDistance){
			super (newName, newPlayTo, newIsPlayToExact, newPlayDistance);
		}
		
		public CanJamEvents(){
			super("CanJam", 21, true, 50);
		}
		
		@Override public String getExtraInfo(){
			return "The frisbee in this game is " + frisbeeSize + " inches big.";
		}
}