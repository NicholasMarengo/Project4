
public class Linkedlist {
	
	private Node head;
	private int listCount;
	
	public Linkedlist(){
		
		head = new Node(null);
		listCount = 0;
	}
	
	public void add(Object data){
		Node Temp = new Node(data);
		Node Current - head;
		
		while (Current.getNext() !=null){
			Current = Current.getNext();
		}
		Current.setNext(Temp);
		listCount++;
	}
	
	public void add(Object data, int index){
		Node Temp = new Node(data);
		Node Current = head;
		
		for(int i = 1; i < index && Current.etNext() !=nulll; i++)
			Current = Current.getNext();
	}
}
