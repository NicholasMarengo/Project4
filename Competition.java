
public class Competition implements ICompetition {

	private Events x;
	private Team y; 
	private Team z;
	
	@Override
	public Events getevent1() {
		// TODO Auto-generated method stub
		return x;
	}

	@Override
	public Team getteam1() {
		// TODO Auto-generated method stub
		return y;
	}

	@Override
	public Team getteam2() {
		// TODO Auto-generated method stub
		return z;
	}
	
	public void setEvents(Events myEvent) {
		x = myEvent; 
	}
	
	public void setTeam1(Team myTeam1) {
		y = myTeam1;
	}
	
	public void setTeam2(Team myTeam2) {
		z = myTeam2;
	}
	
}
