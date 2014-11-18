import java.util.*;


public class TeamManager {
		private int teams;
		private Olympian[] managerArray;
		private int teamSize;
		private Team[] teamArray = new Team[15];
		private int current = 0;
		
		
		public TeamManager() {
			
			for(int i = 0; i < teamArray.length; i++) {
				teamArray[i] = new Team();
			}
			
			OlympianManager OM = new OlympianManager();
			
			managerArray = OM.getObjectOlympians();
			teamSize = managerArray.length / 2;
			
			int totalTeamSize = managerArray.length;
			
			while(totalTeamSize != 0) {
				
				Random rn = new Random();
				int random1 = rn.nextInt(15) + 1;
				int random2 = rn.nextInt(15) + 1;
			
			
				if(managerArray[random1] !=null && managerArray[random2] != null) {
					teamArray[current].SetInfo(managerArray[random1], managerArray[random2], 0, 0);
					
					current++;
					if ((managerArray[random1].getSex() == Sex.M && managerArray[random2].getSex() == Sex.M) || (random1 == random2)) {
						current--;
					}
					
					else{
						managerArray[random1] = null;
						managerArray[random2] = null;
						totalTeamSize = totalTeamSize - 2;
						
						
					}{
						
					}
						
				}
			
			}	
		}
		
	public Team[] getTeamArray(){
		return this.teamArray;
	}
	
	public void printTeams(){
		System.out.println(for(int i = 0; i < teamArray[i].length; i++;) {
					System.out.println(teamArray[i].getInfo());
	}
				
}
}