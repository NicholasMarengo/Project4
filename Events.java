
public abstract class Events {
	private String name;
	private int playTo;
	private boolean isPlayToExact;
	private int playDistance;
	
	public abstract String getExtraInfo();
	
	public Events() {
		this.name = "";
		this.playTo = 0;
		this.isPlayToExact = false;
		this.playDistance = 0;
	}
	
	protected Events(String newName, int newPlayTo, boolean newIsPlayToExact, int newPlayDistance) {
		this.name = newName;
		this.playTo = newPlayTo;
		this.isPlayToExact = newIsPlayToExact;
		this.playDistance = newPlayDistance;
	}
	
	public String getInfo() {
		return this.name + " : " + this.playTo + " : " + this.isPlayToExact + " : " + this.playDistance + " : " + getExtraInfo();
	}
}