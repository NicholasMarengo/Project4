
public class Node {
	public  Node next;
	public Competition value;
	private Events event;
	private Team team;
	
	public Node(){
		
	}
	
	public void setNextNode(Node nextNode){
		next = nextNode;
	}
	
	public void setCompetition(Competition comp){
		value = comp;
	}
	
	public Node(Competition data){
		value = data;
	}
	
	public Events getEvents(){
		return event;
	}
	
	public Team getTeam(){
		return team;
	}
	
	public Node getNextNode(){
		return next;
	}
	
}
