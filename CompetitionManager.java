
public class CompetitionManager {
	
	public void StartCompetition(Events event, Team team1, Team team2){
		
		Competition data = new Competition();
		
		data.setEvents(event);
		
		data.setTeam1(team1);
		
		data.setTeam2(team2);
		
		list.add(data);
		
	}
	
	public Linkedlist compList = new Linkedlist();
	public Linkedlist eventList = new Linkedlist();
	public Linkedlist teamList = new Linkedlist();

	public ICompetition[] GetCompetitions(){
		return null;
		//traverse list and build array
	}
	

	
	
	public void EndCompetition(Competition competition, Team winningTeam){
		compList.add(competition);
		teamList.add(winningTeam);
	}

	
	private Linkedlist list = new Linkedlist();
	



}
