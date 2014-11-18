
public class HorseShoesEvent extends Events {
	int numHorseShoes = 2;
		public HorseShoesEvent(String newName, int newPlayTo, boolean newIsPlayToExact, int newPlayDistance) {
			super(newName, newPlayTo, newIsPlayToExact, newPlayDistance);
		}
	
		public HorseShoesEvent(){
			super("Horse Shoes", 11, false, 40);
		}
		
		@Override public String getExtraInfo(){
			return "There are " + numHorseShoes + " horse shoes in this game";
		}
}	