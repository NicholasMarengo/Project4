
public class WashoosEvent extends Events{
	
	boolean hasAutoWinStick = true;
	private int numWashoos = 10;
	
	public WashoosEvent(String name, int playTo, boolean isPlayToExact, int playDistance){
		super (name, playTo, isPlayToExact, playDistance);
	}
	
	public WashoosEvent(){
		super("Washoos", 21, true, 15);
	}
	

	@Override public String getExtraInfo(){
		return "This game has " + numWashoos + " washoos and there is an auto-win stick";
	}
}



