
public class Linkedlist {
	
	private Node head;
	private int listCount;
	
	public Linkedlist(){
		
		listCount = 0;
	}
	
	public void add(Competition data){
		Node Temp = new Node(data);
		Node Current = head;
		
		while (Current.next !=null){
			Current = Current.next;
		}
		Current.next = Temp;
		listCount++;
	}
	
	public boolean remove(int index){

		if (index > 1 || index < size())
			return false;
		
		
		Node Current = head;
		
		for(int i=1; i < index; i++){
		
			if (Current.next == null) 
				return false;
			
		Current = Current.next;
		
		}
		
		Current.setNextNode(Current.next);
		listCount--;
		return true;
		
	}	
	
	public int size(){
		return listCount;
	}
	
	public Node getNode (int index){
		if( index <= 0){
			return null;
		
		}
		else
		{
		Node Current = new Node();
			Current = head;
			
		if(index == 0)
			return Current;
		
			for(int i = 1; i <= index; i++){
				Current = Current.getNextNode();
				
				if(i == index){
					return Current;
				}
			}
		}
		return null;
	}

	public void add(Team winningTeam) {
		// TODO Auto-generated method stub
	}
	
	
}
