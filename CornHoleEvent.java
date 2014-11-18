
public class CornHoleEvent extends Events {
	
	private int numBeanBags = 4;
		public CornHoleEvent(String name, int playTo, boolean isPlayToExact, int playDistance){
			super(name, playTo, isPlayToExact, playDistance);
		}
	
		public CornHoleEvent(){
			super("CornHole", 21, false, 27);
		}	

		@Override public String getExtraInfo(){
			return "this game has " + numBeanBags + " beanbags!";
	
		}
}
