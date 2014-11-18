import java.util.Arrays;
import java.io.*;


public class Main {
		
	public static void main(String[] args) {
		
		try {
			BufferedReader br = new BufferedReader (new FileReader (args[0]));
			
			String line;
			
			boolean firstLine = false;
			
			while ((line = br.readLine()) != null) {
				if(line.equals("lgoo") || line.equals("LGOO")) {
					System.out.println("correct file");
					break;
				}
				else
				{
					System.out.println("Error: File not found");
					break;
				}
			}
		} 
		catch(IOException ioe) {
			System.out.println("IO exception");
		}
				System.out.println(" Welcome to the Lawn Game Olympics!");	
				System.out.println("Please enter a command!");
				
		String userMove;
		BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
		
		try{
			userMove = userInput.readLine();
		} 
		
		catch(IOException ioe) {
			System.out.println("Play well");
			return;
		}
		
		while (userMove != "quit" || userMove != "q") {
		if(userMove.equals("events") || userMove.equals("e")){
			EventManager();
		
		}
		else if (userMove.equals("Olympians") || userMove.equals("o")) {
		OlympianManager();
		
		}
		else if (userMove.equals("quit") || userMove.equals("q")) {
		System.out.println("Quitting Application");
		EndProgram();
		
		}
		else if (args[0].equals("teams") || args[0].equals("t")) {
			DisplayTeams();
		
		}
		else if (userMove.equals("help") || userMove.equals("h"))	{
			DisplayHelp();
		}
			System.out.println("Enter a valid command!");
			try{
				userMove = userInput.readLine();
			}
			catch(IOException ioe){
				System.out.println("Play well!");
			}
		}
			
	
	}

	public static void EventManager(){
		EventManager event = new EventManager();
		event.printEvents();
	}
	
	public static void OlympianManager(){
		OlympianManager oly = new OlympianManager();
		oly.printOlympians();
	}

	public static void DisplayHelp(){
		System.out.println("Here is some help!");
	}
	
	public static void DisplayTeams(){
		TeamManager Team = new TeamManager();
		Team.printTeams();
	}
	
	public static void EndProgram(){
		System.exit(0);
	}


}
