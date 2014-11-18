
public class EventManager {
	
		Events[] eventArray = new Events[6];
		{
			this.eventArray[0] = new WashoosEvent();
			this.eventArray[1] = new StickGame();
			this.eventArray[2] = new LadderBallEvent();
			this.eventArray[3] = new HorseShoesEvent();
			this.eventArray[4] = new CornHoleEvent();
			this.eventArray[5] = new CanJamEvents();
		}
		
		public Events[] EventManager(){
			return this.eventArray;
		}

		public void printEvents(){
			for (int i = 0; i< eventArray.length; i++) {
				System.out.println(eventArray[i].getInfo());
				
				
			}
		}
}